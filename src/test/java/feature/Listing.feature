Feature: Listing Service

  Scenario Outline: Listing of Cars
    Given Get the ListingAPI "<size>""<page>" with "getLisitngAPI"
    Then Get the total number of cars
    And Calculate How many cars in first page
    And Calculate total number of Cars with "getLisitngAPI"
    And Assert the number of cars with total
    Examples:
      | size | page |
      | 20   | 0    |


  Scenario Outline: Validate how many pages are require to show all cars
    Given Get the ListingAPI "<size>""<page>" with "getLisitngAPI"
    Then Get the total number of cars
    And Calculate How many cars in first page
    And Calculate number of pages required

    Examples:
      | size |page|
      | 20   |0   |

    Scenario Outline: Assert car is equal to given Appointment id
      Given Get the ListingAPI "<size>""<page>" with "getLisitngAPI"
      Then Get the total number of cars
      And Calculate How many cars in first page
      And Find the car with this "<Appointment_Id>" with "getLisitngAPI"
      And Engine configuration of car

      Examples:
        |Appointment_Id |size |page |
        |11872761824000 |20   | 0   |












