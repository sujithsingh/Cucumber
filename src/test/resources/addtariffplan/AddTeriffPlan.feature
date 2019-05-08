
Feature:  The user to verify the Add Tariff Plan functionality

 Scenario: To verify the Add Tariff Plan is added
    Given The user is in Telecom home page
    When The user to Click the Add Tariff Plan
    When The user should navigate to Add Tariff Plan page
    When The user to fill the Tariff plan details
      | MonRent | locMin | IntMin | smsPack | Locpermin | IntPerMin | smschar |
      |       1 |      2 |      3 |       00 |         98 |         100 |       456 |
    When The click the submit button
    And The user should see the Congratulation you add Tariff Plan
    And The user click the home button
    Then The user return to Telecom home page