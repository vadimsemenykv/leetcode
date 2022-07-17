/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // We will use binary search lower_bound variant
        
        // If nth version is not a bad version, then all versions are good.
        if (n <= 0 || !isBadVersion(n)) {
            return -1;
        }
        // If first version is a bad version, then all versions are bad.
        if (isBadVersion(1)) {
            return 1;
        }
        
        int start = 0;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    
    //Example n = 7  [1, 2, 3, 4, 5, 6, 7], 3 is bad
    // CH - Condition check, I{i} - Iteration {i}
    //Iterations:
    //  CH: start(0) <= end(7) TRUE
    //  I1: start = 0, end = 7, mid = 4
    //      isBad... = true
    //      end = 4 - 1 = 3
    //  CH: start(0) <= end(3) TRUE
    //  I2: start = 0, end = 3, mid = 0 + (3 - 0) / 2 = 1
    //      isBad... = false
    //      start = 1 + 1 = 2
    //  CH: start(2) <= end(3) TRUE
    //  I2: start = 2, end = 3, mid = 2 + (3 - 2) / 2 = 2
    //      isBad... = false
    //      end = 2 + 1 = 3;
    //  CH: start(3) <= end(3) TRUE
    //  I2: start = 3, end = 3, mid = 3 + (3 - 3) / 2 = 3
    //      isBad... = true
    //      end = 3 - 1 = 2;
    //  CH: start(3) <= end(2) FALSE
    //  return start 3
}