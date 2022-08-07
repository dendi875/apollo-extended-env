FROM openjdk:8-jdk
#FROM maven:3.5-jdk-8

RUN java -version

RUN mkdir -p /data/www-data/zq.com

ADD docker-entrypoint.sh /usr/local/bin/docker-entrypoint.sh

COPY ./target/apollo-extended-env-exec.jar  /data/www-data/zq.com/apollo-extended-env-exec.jar

# 添加可执行权限
RUN chmod a+x /usr/local/bin/*

WORKDIR /data/www-data/zq.com

EXPOSE 8051

ENTRYPOINT ["docker-entrypoint.sh"]