Feature: Validate AddPlace api
  Scenario: A new place can be added
    Given "AddPlace" api body
    When POST http method is hit
    Then "status_code" received is "200"
    And "status" received is "OK"