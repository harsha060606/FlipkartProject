Feature: Flipkart login page

  Scenario Outline: login
    Given open "<browser>"
    And Launch site with "<url>"
    When login with "<username>" and "<password>"
    Then do logout

    Examples: 
      | browser | url                       | username   | password |
      | chrome  | https://www.flipkart.com/ | 9908953894 | fli06fli |
    # | firefox  | https://www.flipkart.com/ | 9908953894 | fli06fli |
     
     
   
      
