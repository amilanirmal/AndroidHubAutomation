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
    And Scroll for TMSURL
    And Click on TMLSUrl field
    And Enter TMSUrl ""
    And Scroll for Appcode
    And Click on AppCode field
    And Enter AppCode ""
    And Restart App