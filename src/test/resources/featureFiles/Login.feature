Feature: Testing to validate Login Functionality is working.
  In order to validate that
  the login page is working
  Doing the Regression Testing

  Scenario: Validate the Presence Of All Elements In Login Page
    Given I validate the presence of Login Page Header
    Then I validate the presence of Username Input Header
    And I validate the presence of Username Input field
    And I validate the presence of Password Input Header
    And I validate the presence of Password Input field
    And I validate the presence of Login Button
    And I validate the presence of Forgot Password link
    And I validate the presence of All Footer elements

  Scenario: Validate Login With Valid Credentials
    Given I validate the presence of Login Page Header
    Then I enter Username
    And I enter Password
    And I Click on Login Button
    And I accept alert
    And I validate the Dashboard page
