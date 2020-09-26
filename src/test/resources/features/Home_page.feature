Feature: Home page

  @home_page @logo_display
  Scenario Outline: Check Babbel Logo
    Given A user navigates to URL "<URL>"
    Then Babbel logo is displayed

    Examples:
      | URL |
      | https://www.babbel.com/ |
