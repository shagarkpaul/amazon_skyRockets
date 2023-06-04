Feature: Login to amazon account

Scenario Outline: Login to amazon account

Given I am on the amazon homepage 

When i click on the sign in button 
And I enter the "<User_Name>" in user name input field 
And I enter the "<password>" in password input field 
And i click on the sign in button 


Then i can successfully login to my amazon account 


Examples: 
|    User_Name    | password      | 
| sagor.paul.2519@gmail.com |        | 

