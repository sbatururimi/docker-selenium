# Instructions
The recommended way of use is with docker containers.

## Step 1
Navigate to the `Simple mode` or `Headless mode` folder(steps are same):
```
cd Simple\ mode
```

Install the selenium hub with its nodes:
```
docker-compose up -d
```
**NB** To stop your grid:
```
docker-compose stop
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

## Additional possibilities:
By default we setup a grid with  2 nodes. To setuo for example a grid with 2 Chrome nodes and 1 Mozilla node (the default one):
```
docker-compose up -d --scale chrome=2
```

More info:
https://github.com/SeleniumHQ/docker-selenium/wiki/Getting-Started-with-Docker-Compose
