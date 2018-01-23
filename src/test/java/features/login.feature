Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to login page
    And I enter the following for Login
      | username | password  |
      | admin    | adminpass |
    And I click login button
    Then I should see the userform page

  Scenario Outline: Login with correct username and password using Scenario Outline
    Given I navigate to login page
    And I enter <username> and <password> for Login
    And I click login button
    Then I should see the userform page

    Examples:
      | username | password  |
      | admin    | adminpass |
      | root     | rootpass  |
      | user     | userpass  |
      | wrong    | wrongpass |
