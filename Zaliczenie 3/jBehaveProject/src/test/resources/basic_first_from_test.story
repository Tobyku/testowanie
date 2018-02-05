Scenario:  BasicFirstForm
Given open chrome basicfirstform
When go to the website http://www.seleniumeasy.com/test/basic-first-form-demo.html
Then click on the TextBox
Then we should see Please enter your Message
Then enter the message Selenium Test
When click on show button
Then we should see Selenium Test
Then close chrome basicfirstform