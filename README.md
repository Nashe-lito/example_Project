### About:
- Java 11
- Selenium
- TestNG
- Maven


### How to run
- Open command line
- Go to the project directory
- Run command 
```bash
$ ./mvnw clean test site
```
OR
- Open IDE
- Run testng.xml file


### How to generate the allure report
- Run commands 
```bash
$ ./mvnw clean test site
$ ./mvnw io.qameta.allure:allure-maven:serve
```
