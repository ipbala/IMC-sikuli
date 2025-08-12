Feature: User Login with Sikuli

  Scenario: Successful login using image recognition
    Given I have opened Notepad
    When I type "username_image.png" into "username_field_image.png"
    And I type "password_image.png" into "password_field_image.png"
    And I click "login_button_image.png"
    Then I should see "welcome_message_image.png"