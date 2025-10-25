Feature: Create git repository
  As an authenticated user
  I want to create a new git repository

  Scenario: Create a valid git repository
    Given I am an authenticated github user
    When I send a request to create a repository with name as "Selenium-gitrepo" and with description "git"
    Then the response code should be 200
    And the response should contain the repository name "Selenium-gitrepo"
    And the response time should be less than 5000 milliseconds