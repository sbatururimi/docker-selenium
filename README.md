# Instructions
The recommended way of use is with docker containers.

# Simple mode
## Step 1
Navigate to the simple mode folder:
```
cd Simple\ mode
```

Install the selenium hub with its nodes:
```
docker-compose up -d
```

## Step 2
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
