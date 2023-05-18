Feature: Information about user
  As a user,
  I want to be able to access personal detail
  So that I can check ot update the personal detail

  @personalInfoView
  Scenario: Redirect page to the personal detail page
    Given user is already on home page
    When user clicks on the My info menu
    Then user should be redirected to the personal detail page