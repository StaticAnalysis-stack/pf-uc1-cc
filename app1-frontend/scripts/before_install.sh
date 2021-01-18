#!/bin/bash
sudo rm -rf /opt/codedeploy/deployment-root/*
sudo rm -rf /home/ec2-user/*.jar /home/ec2-user/*.yml /home/ec2-user/*.sh
cd /home/ec2-user/server
curl -sL https://rpm.nodesource.com/setup_14.x | sudo -E bash -
yum -y install nodejs npm
