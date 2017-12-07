FROM java:8
MAINTAINER zehua

#安装应用
ADD demo.jar demo.jar
RUN bash -c 'touch /demo.jar'
ENTRYPOINT ["java","-jar","/demo.jar"]

#暴露端口
EXPOSE 8080