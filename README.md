# Instructions
The recommended way of use is with docker containers.

## Step 1
Install the selenium hub with its nodes:
```
docker-compose up -d
```

## Step 2
### Simple mode
```
# download selenium
wget https://selenium-release.storage.googleapis.com/3.141/selenium-server-standalone-3.141.5.jar
# set the Java CLASSPATH environment variable 
export CLASSPATH=".:selenium-server-standalone-3.141.5.jar"
# compile the test code
javac MyTest.java
# launch
java MyTest
```
