Feature: Login
  As a user,
  I want to be able to login with a username and password
  So that I can access orange HRM Live website

  @login
  Scenario: Login with a valid credential
    Given user is on login page
    And  user inputs the user name
    And  user inputs a password
    When user clicks the login button
    Then user should be redirected to the home page

 # Scenario: Login with Invalid Credential
   # Given User is on login page
   # And User type invalid username and invalid password
   # And User click button login
   # Then User should see error message "Tidak dapat masuk. Email/kata sandi salah."