# Banking Web-Application

## Project Description

A BankingApp is a web-based application that simulates the banking operations. A customer can apply for an account, view balance, deposit the amount, withdraw the amount and transfer the amount. An employee can approve or deny the accounts and view the balance of their customers by looging in. And customer can perform the operations if and only if he has logged in successfully.

## Technologies Used

Java-1.8

JDBC-3.5.6

Hibernate-5.0.1

PostgreSQL-42.2.3

HTML-5

CSS

JavaScript
  
## Features
### Customer Module
- Customer can open account in the bank
- To perform the operations customer should log in successfully using the id and password.
- After logged in customer can deposit amount, view balance, withdraw amount and also can transfer amount from his/her account to other account.
### Employee Module
- Employee can approve or reject a particular customer account.
- And also can view the balance amounts of the registered customers.

  
## Technical Aspect

- Created two tables in PostgreSql i.e., customers and employees to store and retrieve the data.
- Created a model class in which properties are been declared and also used hibernate annotations.
- Used hibernate to handle the methods in DAO/Service layer.
- Implemented log4j for logging properties.
- Used servlets for fetching the requests and providing the response to the UI.
- Performed junit tests on the methods using junit4-test-suite.
- Created forms using HTML, CSS and also used Javascript for form validations.

## Future Enhancement:
- We can add more fields like loans i.e, gold-loan, agriculture-loan etc.
- And also can use mail sender to send the details of a particular account to their registered mail regarding status of their account or the details of their account created.

## Usage of the BankingApp
 - To run this project firstly download this project by clicking on download or pull this project from github desktop.
 - If you have downloaded the project extract the file and import it in EclipseIDE.
 - Then click on existing maven project then next and finish.
 - Then create two tables named as customers and employees in PostgreSQL.
 - Then run this project and to perform the actions use  http://localhost:8080/BankingOperations to open it on web browser.
