Feature: Validate Login Functionality

  Background: 
    Given Validate the browser
    When Browser is triggered
    Then Check if browser is started

  Scenario: Validate user get error when try to login without entring any data
    Given Navigate to login page
    When Do not enter any data
    And Click on Login button
    Then validate user get error message when try to login with blank data

  Scenario: Validate user get error when login with invalid email
    Given Navigate to login page
    When Enter invalid email and valid password
      | rpawar+sdawa1 | lsspl#123 |
    And Click on Login button
    Then validate user get error message when try to login with invalid email

  Scenario: Validate user get error when login with invalid password
    Given Navigate to login page
    When Enter valid email and invalid password
      | rpawar+wa1@may16.wptst.com | lsspl#110 |
    And Click on Login button
    Then validate user get error message when try to login with invalid password

  Scenario: Validate user get error when try to login with unregistered email
    Given Navigate to login page
    When Enter email address for unregitered user
      | rpawar+wa111@may16.wptst.com |
    And Click on Login button
    Then validate user get error message when try to login with unregistered email

  Scenario: Validate user able to login with valid credential
    Given Navigate to login page
    When Enter valid credential
      | rpawar+wa1@may16.wptst.com | lsspl#123 |
    And Click on Login button
    Then validate user able to login successfully
