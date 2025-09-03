Feature: Order creation end to end case

@AppLaunch
  Scenario: Successful login using text recognition
    Given IMC App open in full screen mode
    When IMC app is launched
    Then navigate to Create Query page in full screen mode
    And Validate the Page 


@orderCreation
  Scenario: Successful login using image recognition
    Given I'm at order creation screen  
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

@cleanup
  Scenario: Clean up after tests
    Given I have completed all tests
    When I close the application