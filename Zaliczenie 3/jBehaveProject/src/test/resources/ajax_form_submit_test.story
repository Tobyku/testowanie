Scenario:  AjaxFormSubmit
Given open chrome ajaxformsubmit
When go to the website http://www.seleniumeasy.com/test/ajax-form-submit-demo.html
Then click on the name textbox
Then type the name Tobiasz
Then click on the comment textbox
Then type the comment Pozdrawiam
When press the submit button
Then should be written Form submited Successfully!
Then close chrome ajaxformsubmit