Sample Spring Boot Web Application with JSP
====

Building and running
---

    ./mvnw clean spring-boot:run


or

    ./mvnw clean package
    java -jar target/jsp-boot-tst.war
    
    
Verification:

    curl -i -I http://localhost:8080/
    HTTP/1.1 200 

Done:
1. Enabled Dynamic Code Reload for easier development

	    <dependency> <!--Allow Dynamically Reloading Code w/o restarting https://www.java4s.com/spring-boot-tutorials/spring-boot-how-to-reload-changes-without-restarting-the-server/ -->
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
	    </dependency>

1. Enabled basic web security just to try out spring-security

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
            <scope>provided</scope>
        </dependency>
