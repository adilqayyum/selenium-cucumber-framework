Feature: Home page

  @home_page @logo_display
  Scenario Outline: Check Babbel Logo
    Given A user navigates to URL "<URL>"
    Then Babbel logo is displayed

    Examples:
      | URL |
      | https://www.babbel.com/ |

  @home_page @home_page_title
  Scenario: Check title
    Given A user navigates to URL "https://www.babbel.com/"
    Then page title is "Language for Life - Babbel.com"

  @home_page @start_learning
  Scenario: Start Learning Check
    Given A user navigates to URL "https://www.babbel.com/"
    Then Click on Language Picker
    And Click on Value "German"
    And Click on Start Learning
