Feature: Job Search
  As a user I want to search jobs on cv library website

  Scenario Outline: User should search for jobs successfully
    Given I am on HomePage
    And I accept Iframe alert
    And I enter "<jobTitle>" in JobTitle field
    And I enter "<location>" in Location field
    And I select "<distance>" from Distance dropdown
    And I click on more search options
    And I enter "<salaryMin>" in SalaryMin field
    And I enter "<salaryMax>" in SalaryMax field
    And I select "<salaryType>" from Salary Type dropdown
    And I select "<jobType>" from Job Type dropdown
    And I click on Find Jobs button
    Then I can verify Search "<result>"

    Examples:
      | jobTitle            | location              | distance       | salaryMin | salaryMax | salaryType | jobType   | result    |
      | Tester              | Harrow                | up to 5 miles  | 30000     | 40000     | per annum  | permanent | permanent |
      | Bookkeeper          | London                | up to 7 miles  | 40001     | 50000     | per annum  | permanent | permanent |
      | Warehouse Operative | Watford Hertfordshire | up to 5 miles  | 35000     | 45000     | per annum  | Contract  | Contract  |
      | Teacher             | Wembley               | up to 10miles  | 25000     | 35000     | per annum  | permanent | permanent |
      | Teaching Assistant  | Leeds                 | up to 10 miles | 30000     | 40000     | per annum  | permanent | permanent |
      | Recruiter           | London                | up to 5 miles  | 25000     | 38000     | per annum  | Contract  | Contract  |


