Feature: Order creation end to end case

@login
  Scenario: Successful login using text recognition
    Given IMC App open using the batfile 
    When login page is displayed
    And I type valid username
    And I type valid password
    And I click login_button
    Then I should see IMC landing page
    And I navigate to Order Creation page


@orderCreation
  Scenario: Successful login using image recognition
    Given I'm at order creation screen  
     #full screen mode
    When Creation page is displayed 
    And Enter the order creation details
    And Enter the sumbit button to create the order
    Then validate the order creation success message

 @searchOrder
  Scenario: Search for an order
    Given I'm at order search screen
    When I enter the order number to search
    And I click the search button
    Then I should see the order details displayed
    And I validate the order details