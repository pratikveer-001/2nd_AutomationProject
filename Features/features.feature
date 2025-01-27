
Feature: launch an application inside the mobile
  I want to open application and login

  Scenario: simple Login
    Given open the application 
    When Its open click on Allow element
    And enter Email
    And enter Paas
    Then Click on submit button
    And Check the successfully login or not

