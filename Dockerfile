FROM tomcat:7-jre7
MAINTAINER "errorlife <steffan.fan@foxmail.com>"
ADD dockertest.war /usr/local/tomcat/webapps/ #将war包添加进webapps中
CMD ["catalina.sh", "run"] #启动tomcat shell执行程序

