Feature: Login Functionality

  Background:
    Given Navigate to the ParaBank

  Scenario Outline: Login Successfully

    When Enter your valid "<username>" and "<password>"

    Then User should successfully login to the system
    And User should logout from the system

    Examples:
      | username | password |
      | Kerem   | password |

  Scenario Outline: Login Failure

    When Enter valid "<username>" and invalid "<password>"
    Then Unsuccessfull attempt should be displayed

    When Enter invalid "<username>" and valid "<password>"
    Then Unsuccessfull attempt should be displayed

    Examples:
      | username | password |
      | Kerem   | passwor  |
      | KeremY   | password |