Feature: Different functions of Docuport

  @day20
Scenario: Change Rows Per Page
Given user is on docuport homepage of "advisor"
Then user clicks "Leads" button
And rows per page shows by default 10
And change rows per page to 5
And user clicks "Users" button
And rows per page shows by default 10
And change rows per page to 5


