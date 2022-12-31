@test3
Feature: TMS Application download

  @web
  Scenario Outline: Login with valid user name
    When I enter tms username as "<username>"
    And I enter tms password as "<password>"
    And I click the submit button
    Then I verify the home page
    And I extract the side menu
    And I select the Device section
    And I select the device operation Management page
    And I verify device on Boarding
    And I click on assign operation
    And I select the device operation "Application Download"
    And Send operation to right side
    And Click on assign
    And scroll down for gride table1


    Examples:
      | username | password |
      | nirmal   | 123456   |