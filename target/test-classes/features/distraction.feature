Feature: As a user
  I want to input two natural numbers and distract second from first

  Scenario Outline: Two natural numbers
    Given I create a new function object
    When I pass <a> and <b> as parameters
    Then I get <result> as a result

    Examples:
    | a | b | result |
    | 5 | 2 | 3 |
    | 7 | 8 | -1 |