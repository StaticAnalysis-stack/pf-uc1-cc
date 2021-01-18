#!/bin/bash
cd /home/ec2-user/server/
npm start
pm2 start npm --name "employeeapp" -- start
pm2 startup
pm2 save
pm2 restart all