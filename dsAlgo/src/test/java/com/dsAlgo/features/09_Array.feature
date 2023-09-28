@linkedlist
Feature: dsAlgo:009 Array feature and functionality test

  Before: User launch the dsAlgo application
    Given open the browser maximize and set the timeouts
    And load the url
    When user click the "Get Started" button
    Then user redirects to the home page and verify the page title
    
  Scenario:  
    Given user click on the sign in link
    Given enter the username
      | username        |
      | SeleniumTesting |
    Then enter the password
      | password     |
      | Selenium@123 |
    And click the login button