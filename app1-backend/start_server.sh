#!/bin/bash
java -jar -Dspring.profiles.active=prod /home/ec2-user/app1/springboot-backend-0.0.1-SNAPSHOT.jar > /dev/null 2> /dev/null < /dev/null &