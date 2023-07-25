Feature: Job Search Test

  @smoke
  Scenario Outline: As s user I can able to search desire jobs
    Given enter job title '<jobTitle>'
    When I enter Location '<location>'
    When I select distance '<distance>'
    When I click on moreSearchOptionsLink
    When I enter salaryMin '<salaryMin>'
    When I enter salaryMax '<salaryMax>'
    When I select salaryType '<salaryType>'
    And I select jobType '<jobType>'
    And I click on '<Find Jobs>' button
    Then I verify the result '<result>'
#    Examples:
#      | jobTitle             | location           | distance | salaryMin | salaryMax | salaryType | jobType    | result                                           |
#      | Tester               | Harrow on the Hill | 5 miles  | 30000     | 50000     | Per annum  | "Permanent | Permanent Tester jobs in Harrow on the Hill      |
#      | Test Lead            | Stanmore           | 5 miles  | 30000     | 50000     | Per annum  | "Permanent | Permanent Test Lead jobs in Stanmore             |
#      | Developer            | Greenford          | 5 miles  | 30000     | 50000     | Per annum  | "Permanent | Permanent Developer jobs in Greenford            |
#      | Senior Developer     | Kingsbury          | 5 miles  | 30000     | 50000     | Per annum  | "Permanent | Permanent Senior Developer jobs in Kingsbury     |
#      | Technology sales     | Wembley            | 5 miles  | 30000     | 50000     | Per annum  | "Permanent | Permanent Technology sales jobs in Wembley       |
#      | Software development | Perivale           | 5 miles  | 30000     | 50000     | Per annum  | "Permanent | Permanent Software development jobs in Perivale  |
#      | Cloud engineering    | Wembley Park       | 5 miles  | 30000     | 50000     | Per annum  | "Permanent | Permanent Cloud engineering jobs in Wembley Park |
