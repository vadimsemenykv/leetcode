class Solution {
    public int addDigits(int num) {
        //Mathematical: Digital Root
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}