@smoke @wp

  Feature: Cars page selection
     Scenario: Search by Make
       Given User is on cars page
       When User selects Used Cars
       Then User selects Make as "Honda"
       Then User selects Model as "Pilot"
       Then User selects Price as 50000
       And User selects Distance 100 miles
       And User Enters zip code 60008
       Then User clicks search button

       Scenario: Validate that filters are displayed
         Given User selected all fields and clicked search
         Then Verify that "Price" "Make" "Model" and "Used" are displayed
         When User selects New radio button from New/Used
         Then Validate that New filter is selected
         And Used filter is not selected
         When User selects "Touring 8-Paasenger" from Trim
         Then Validate that the "Touring 8-Passenger" is displayed
         And User select the second available car
         Then Verify that car title contains "Honda Pilot 8-Passenger"
         And Verify that check availability button is displayed
         When User enters first name "Car"
         Then User enters last name "Owner"
         And User enters email "carowner@yahoo.com"
         Then User takes screenshot of payment calculator







