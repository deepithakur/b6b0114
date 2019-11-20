Feature: login Feature

 Scenario: User enter Username And Password
  Given the login page is opened
  When user enters Lalitha as username
  And user enters password123 as password
  Then  user will finds a testmeapp home page
  