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
  Scenario Outline: Start Learning Check
    Given A user navigates to URL "<URL>"
    When Click on Language Picker
    And Click on Dropdown Value "<Language>"
    Then Click on Start Learning
    And Select Form Value "<Reason>"

    Examples:
      | URL | Language | Reason |
      | https://www.babbel.com/ | German | I need it for an upcoming trip |
      | https://www.babbel.com/ | French | I need it for my career |
