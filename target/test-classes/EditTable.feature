@test
Feature: Edit table TCT

  @appium
  Scenario: Edit table and add tmsurl ,appcode
    When Open navigation bar
    And Click on Edit table
    And Enter the password
    And click on the ok
    And Click on CDT
    And Click on TCT
    And Scroll for TMSURL Using Using direction "up"
    And Click on TMLSUrl field
    And Enter TMSUrl "http://124.43.16.185:50501/api/v1/Application"
    And Scroll for Appcode Using Using direction "up"
    And Click on AppCode field
    And Enter AppCode "V214"
    And Restart App