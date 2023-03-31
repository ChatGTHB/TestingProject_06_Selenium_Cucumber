Feature: Login Multiple Scenerio

  Background:
    Given Navigate to the ParaBank

  Scenario Outline: Login Functionality

    When Enter your valid "<valid username>" and "<valid password>"
    Then User should successfully login to the system
    And User should logout from the system


    When Enter valid "<valid username>" and invalid "<invalid password>"
    Then Unsuccessfull attempt should be displayed


    When Enter invalid "<invalid username>" and valid "<valid password>"
    Then Unsuccessfull attempt should be displayed

    Examples:
      | valid username | valid password | invalid username | invalid password |
      | Kerem          | password       | Kerem_Y          | passwor          |


