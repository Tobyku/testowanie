Scenario:  SelectDropDown
Given open chrome selectdropdown
When go to the website http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html
Then expand the list
When select on the value Friday
Then should be written Day selected :- Friday
Then close chrome selectdropdown
