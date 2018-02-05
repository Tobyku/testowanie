Scenario:  RadioButton
Given open chrome radiobutton
When go to the website http://www.seleniumeasy.com/test/basic-radiobutton-demo.html
Then select the male radiobutton
When click on check button
Then should be written Radio button 'Male' is checked
Then close chrome radiobutton
