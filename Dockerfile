FROM tomcat
# 将war包添加进webapps中
COPY ./target/demo-0.0.1.war /usr/local/tomcat/webapps/
CMD ["catalina.sh", "run"] #启动tomcat shell执行程序

