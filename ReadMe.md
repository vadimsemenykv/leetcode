#### Create virtualenv for python 3.7

###### Install Pyenv

````bash
apt-get install make libssl-dev zlib1g-dev libbz2-dev libreadline-dev libsqlite3-dev
````
````bash
git clone git://github.com/yyuu/pyenv.git ~/.pyenv
````
````bash
echo 'export PYENV_ROOT="$HOME/.pyenv"' >> ~/.bashrc
````
````bash
echo 'export PATH="$PYENV_ROOT/bin:$PATH"' >> ~/.bashrc
````
````bash
echo 'eval "$(pyenv init -)"' >> ~/.bashrc
````
````bash
. ~/.bashrc

````

######  Install virtualenv+pyenv warapper
````bash
mkdir -p ~/.pyenv/plugins
````
````bash
git clone git://github.com/yyuu/pyenv-virtualenv.git ~/.pyenv/plugins/pyenv-virtualenv
````
````bash
git clone git://github.com/yyuu/pyenv-virtualenvwrapper.git ~/.pyenv/plugins/pyenv-virtualenvwrapper
````

######  Create virtualenv for local python 3.7.2
````bash
pyenv install 3.7.2
````
````bash
pyenv rehash
````
````bash
pyenv virtualenv 3.7.2 leetcode-3.7.2
````
````bash
pyenv local leetcode-3.7.2
````
