Feature: Login
  i as services user i need to automate login for access the services

  Scenario: Login Successful
    Given He user is on the page
    When the user enter the credentials
      | numberdocument           | password      |
      | TuNumeroDeIdentificacion | TuContraseña. |
    And He could see the index
    And He use the main menu
      | numberdocument | password |
      | aaaaa          | aaaaaaa. |
    And He see the another page with info
    And He see the document
    And He see the index page final
    Then User logs out
      | numberdocument | password |
      | aaaaa          | aaaaaaa. |