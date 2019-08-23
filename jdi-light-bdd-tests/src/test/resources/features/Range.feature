@Range
Feature: Range
  
Background: 
  Given I should be logged in
  And I open "Html5 Page" page
  And install "Volume" value to 90
  
Scenario: Check label text
  Then the "Volume" label text equals to "Volume"

Scenario: Validate value test
  Then the "Disabled Range" attribute "value" equals to "50"

Scenario: Validate minimum value
  Then  the "Volume" attribute "min" equals to "10"

Scenario: Validate maximum value
  Then  the "Volume" attribute "max" equals to "100"

Scenario: Validate step value
  Then the "Volume" attribute "step" equals to "5"

Scenario: Change Volume value
  When install "Volume" value to 5
  Then the "Volume" attribute "value" equals to "10"

Scenario: Validation Volume element test
  Then the "Volume" is enabled
  And the "Volume" attribute "min" equals to "10"
  And the "Volume" attribute "max" equals to "100"
  And the "Volume" attribute "step" equals to "5"
  And the "Volume" progress volume greater or equal to 10
  And the "Volume" range volume less or equal to 100
  And the "Volume" attribute "value" equals to "90"

Scenario: Label Test
  Then the "Volume" label text equals to "Volume"
  Then the "Volume" label text contains "lume"

Scenario: Validation Test
  And the "Volume" progress volume greater or equal to 0
  And the "Volume" progress volume less or equal to 100
  Then the "Disabled Range" attribute "value" equals to "50"

Scenario: Base validation
  Then the "Volume" is basically valid