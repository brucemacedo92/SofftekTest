#SoftTek API Test Application

This document is intended to record the requirements
and configurations for running the code in 
any environment.

The POM.XML file **must be configured** with the dependencies and plugins below:

    <dependencies>
    <!-- CUCUMBER: FOR JUNIT RUN-->
    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>1.2.5</version>
        <scope>test</scope>
    </dependency>
    <!-- CUCUMBER: FOR INTERPRET THE BDD-->
    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>1.2.5</version>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.testng/testng -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.1.0</version>
        <scope>test</scope>
    </dependency>
    <!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>4.4.0</version>
        <scope>test</scope>
    </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.0</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                    <includes>
                        <include>src/test/java</include>
                    </includes>
                </configuration>
            </plugin>
        </plugins>
    </build>


The optimal JDK version is *jdk1.8.0_311* for greater compatibility of plugins and
dependencys.

After configuring the pom.xml, download the repository and open it with IntelliJ IDEA, browse the path:

- src
  - test
    - java
      - pages
      - SofttekAPITest.java

and execute the test.

The reports are inside the directory:

  - test-output
    - old


I suggest opening the index.html file and emailable-report.html file from the repository download location.