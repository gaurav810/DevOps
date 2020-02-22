Tomcat Installation on AWS EC2 
==============================

Create directory for Java and Tomcat installation.
--------------------------------------------------
```
mkdir /usr/java
```

Download and Install Java 8
---------------------------
```
sudo yum install java-1.8.0-openjdk
```

Another Way for Download and Install Java 8
-----------------------------------------
- Download rpm file form oracle

```
yum install downloaded_file.rpm
```

Check Java Version
------------------
```
java -version
```

Download Tomcat (tar file)
--------------------------
```
wget https://downloads.apache.org/tomcat/tomcat-8/v8.5.51/bin/apache-tomcat-8.5.51.tar.gz
```

Extract downloaded tar file
---------------------------
```
tar xvfz file_name
```

Start the Tomcat Server
-----------------------
```
location of bin folder > ./startup.sh
```

Check tomcat server started or not
----------------------------------
```
wget http://localhost:8080
```

- You can also check using browser

http://{your_instance_ip}:8080

If its not working follow below steps

Access tomcat for remotly
-------------------------
- Go to webapps/manager/META-INF/context.xml

Comment below line

<!--  <Valve className="org.apache.catalina.valves.RemoteAddrValve"
         allow="127\.\d+\.\d+\.\d+|::1|0:0:0:0:0:0:0:1" / > -->

- Afre change restart your tomcat server.

Open 8080 port from your EC2 instance
-------------------------------------
- Go to your instance Security Groups
- Go to Inbound Tab and add 8080 port

![open](C:\Users\Gaurav\Desktop\open.png)

After that check on your browser
--------------------------------
http://{your_instance_ip}:8080

For access Tomcat Web Application Manager
-----------------------------------------
- Add below line in conf/tomcat-users.xml

<role rolename="manager-gui"/>
<user username="admin" password="admin" roles="manager-gui"/> 