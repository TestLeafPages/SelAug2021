Feature: Login functionality of LeafTaps application

Scenario:
#Given Open the chrome browser
#And Load the application url 'http://leaftaps.com/opentaps'
Given Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click crmsfa link