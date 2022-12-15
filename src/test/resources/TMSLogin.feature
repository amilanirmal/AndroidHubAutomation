Feature: TMS login scenarios

  @web
  Scenario Outline: Login with valid user name
    When I enter tms username as "<username>"
    And I enter tms password as "<password>"
    And I click the submit button
    Examples:
      | username | password |
      | nirmal   | 123456|