@account
Feature: create a new different account
Scenario Outline: Create different account
   Given customer details and opening balance
   When for valid customer with minimum opening balance <value>
   Then create new <accountType> account
 Examples:
 |accountType|value|
 |Savings    |1000 |
 |Current    |10000|
 |RD         |100  |
 |FD         |500  |