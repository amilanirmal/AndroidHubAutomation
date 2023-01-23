@b
Feature: TMS login scenarios

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
    And I select the device operation "Profile Download"
    And Send operation to right side
    And Click on assign
    And close popup window
    And scroll down for gride table one
    Then Operation should be completed

    Examples:
      | username | password |
      | nirmal   | 654321     |