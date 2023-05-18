Feature: Information employee history
  As a user,
  I want to be able to access employee history
  So that I can track employee history

  @performance @employeeTrack
  Scenario: Redirect page to the personal detail page
    Given user is already on home page
    And user clicks on the Performance menu
    When user clicks on the employee tracker
    Then user should be redirected to the employee tracker page
