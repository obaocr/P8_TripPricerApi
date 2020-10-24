P8 TipPricer
TipPricer is a Spring Boot application which expose web services for the Tourguide application Service : GetPrice

The services are exposed by port 8048

Endpoints : "/triprice"

Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

Prerequisites
What things you need to install the software and how to install them

Pleas Install and run the two project below

Java 1.8
Maven 3.6.3
SpringBoot 2.2.5
Installing
A step by step series of examples that tell you how to get a development env running:

1.Install Java:

https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html

3.Spring

https://spring.io

Installing this application in a Docker container, Ex : https://hub.docker.com/editions/community/docker-ce-desktop-windows
Run the application in a Docker container
Install Docker, launch Docker application

Build the application From the P8_GpsApi directory launch "mvn clean package", the jar is in the target directory

Build and run the docker image From the P8_GpsApi : "mvn install:install-file -Dfile=TripPricer.jar -DgroupId=com.p8.tripPricer -DartifactId=tripPricer -Dversion=1.0 -Dpackaging=jar
" to remove the image

Test the service ( Ex : http://localhost:8048)

Testing
The app has unit tests and performances tests written.

To run the tests from gradle launch the mvn test task or the build, il will generate the test report with jacoco

Other consideration
JAVADOC has been initialized and needs to be completed.