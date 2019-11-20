

Feature: Login Action



  Scenario Outline: Successful Login with Valid Credentials
    Given User is open the application
    When  User click on to login link
    And  User enters "<username>" and "<password>"
    Then Message displayed login successfully

    Examples: 
      | username  | password 		|
      | Lalitha 	| password123 |
      | Admin			| password123 |
