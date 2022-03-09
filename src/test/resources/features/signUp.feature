Feature: Sign up User

  Scenario: Login user
    Then Content BasePage visible
    Then Click "Заполнить анкету" button
      Then Content SignUpPage visible
      Then Input e-mail
      Then Input phone number
      Then Click next button
        Then Input users data
        Then Click next button
