#!/bin/sh

set -e

# 应用统一存放目录
APP_HOME="/data/www-data/zq.com"

# jar包对于APP_HOME的位置
APP_EXEC="apollo-extended-env-exec.jar"


# 应用程序名，需要与spring.application.name一致
APP_NAME=apollo-extended-env

# 环境
APP_PROFILE=docker

##########################################################################
JAVA_OPTS=" -Denv=$APP_PROFILE -Dapp.id=$APP_NAME -Ddocker_meta=http://apollo:8084 -Dfile.encoding=UTF-8 -Duser.timezone=Asia/Shanghai  -Dspring.application.name=$APP_NAME -Dspring.profiles.active=$APP_PROFILE -Dspring.cloud.sentinel.enabled=false"

java $JAVA_OPTS -jar $APP_HOME/$APP_EXEC