Feature: Testing to validate Login Functionality is working.
  In order to validate that
  the login page is working
  Doing the Regression Testing
#
#  Scenario: Validate the Presence Of All Elements In Login Page
#    Given Validate the presence of Login Page Header
#    Then Validate the presence of Username Input Header
#    And Validate the presence of Username Input field
#    And Validate the presence of Password Input Header
#    And Validate the presence of Password Input field
#    And Validate the presence of Login Button
#    And Validate the presence of Forgot Password link
#    And Validate the presence of All Footer elements

  Scenario Outline: Validate Login With Valid Credentials
    Given the user is on the login page
    When the user enters username "<username>"
    And enters "<password>"
    And clicks on the login button
    And Accept alert
    Then the user should be redirected to the dashboard page

    Examples:
      | username | password |
      | Admin    | admin123 |
      | Admin    | Admin123 |
      | aDMin    | admin123 |
      | admi@    | admin123 |
