@createlead
Feature: Create Lead in LeafTaps application

#Background:
#Given Open the chrome browser
#And Load the application url 'http://leaftaps.com/opentaps/control/main'

@functional @regression
Scenario: Create lead with mandatory informations
Given Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' Page should be displayed
When Click on 'Leads' link
Then 'My Leads' Page should be displayed
When Click on 'Create Lead' link
Then 'Create Lead' Page should be displayed
#Given Enter the Company name as 'Testleaf'
#And Enter the FirstName as 'Hari'
#And Enter the LastName as 'R'
#When Click on Create Lead button
#Then New Lead should be created