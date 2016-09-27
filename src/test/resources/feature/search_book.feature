Feature: Book search
  To allow a customer to find his favourite books quickly, the library must offer multiple ways to search fo$

  Scenario: Search books by publication year
    Given I have a hangman app with the word 'cat'
    When the user enters 'z' to guess as a letter
    Then The word should still look like '...'
