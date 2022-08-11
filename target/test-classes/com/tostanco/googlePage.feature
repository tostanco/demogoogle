Feature: Basic test
@SmokeTest
  Scenario: page works
    Given Page is loaded
    When I wait 1 hour
    Then my belly should growl
