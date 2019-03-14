#Author: Redwan Hossain
@Webapplicationtesting
Feature: I Want to test ec2instances website

  Background: 
    Given I launch the ec2instances home page url

  Scenario: RDS Link test
    When I click on the RDS link
    Then I see the RDS page

  Scenario: Confirm background row color change
  	When I click on the RDS link
    And I click on the M1 General Purpose Extra Large row
    Then I verify the row background color

  Scenario: Confirm “Confirm selected” button action
  	When I click on the RDS link
    And I click M1 General Purpose Extra Large row
    And I click on the Confirm selected button
    Then I verify the  the button changes
    And the row is displayed
