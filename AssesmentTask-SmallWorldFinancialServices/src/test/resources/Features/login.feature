Feature: Feature to Test WebSite Functionality

  Scenario: Check User can login and perform multiple actions 
    Given user is on login page
    And click on login button
    Then error message occur for empty credentails


    When user enters valid <username> and <password>
    And user click on login button
    Then user is navigate to home page successfullly
    
  
     When user add multiple products in cart 
     
     
   When user click on add to cart icon
   
   When user remove products from cart 
   
   Then user logout successfully
     
     #When user remove prpduct
     #When user click on add to cart icon 
      #When user add third product
     
     
     

    Examples: 
      | username     | password     |
      | problem_user | secret_sauce |
      
   
      #When User add second prodcut
      #When user add third product
      
      
