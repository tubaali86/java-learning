Feature: Yahoo signup Test

  Scenario Outline: Validating yahoo sign up options with test data
    Given user is on the yahoo sign up page
    When user enters firstname "<firstname>" in the textbox
    And user enters lastname "<lastname>" in the textbox
    And user enters new email "<emailaddress>" in the textbox
    And user enters new password "<password>" in the textbox
    And user is able to select "<countrycode>" from the drop down menu
    And user is able to enter "<mobilenumber>"  within the text box
    And user is able to select "<birthmonth>" from  drop down menu
    And user is able to enter "<birthday>" in  text box
    And user is able to enter "<birthyear>" in the text box
    And user is able to enter "<gender>" into the  text box
    Then user should be able to close the browser

    Examples: 
      | firstname | lastname | emailaddress         | password       | countrycode | mobilenumber | birthmonth | birthday | birthyear | gender |      |
      | Annie     | Ali      | annie@yahoo.com      | random123      |           0 |    123456789 |          4 |       10 |      1987 | female |      |
      | Ali       | Rahim    | rahim@yahoo.com      | fandom1234     |           1 |   9876543231 |          2 |       04 |      1976 | male   |      |
      | Bob       | Gale     | gale12@yahoo.com     | colour456      |           2 |   9087654322 |          3 |       02 |      1990 | male   |      |
      | Steve     | Watson   | watson45@yahoo.com   | faluire123     |           3 |   8765432101 |          6 |       08 |      2003 | male   |      |
      | Mary      | clove    | marycl@yahoo.com     | polarbear12    |           4 |   2345678018 |          2 |       24 |      2000 | female |      |
      | Elly      | May      | elly567@yahoo.com    | pardesi234     |          13 |   3468575652 |          1 |       23 |      2001 | female |      |
      | Anna      | Fernat   | anna123fer@yahoo.com | barbertshirt23 |          14 |   5714275994 |          9 |       06 |      1975 | female |      |
      | Jay       | Lee      | leejay@yahoo.com     | safeway123     |          10 |    786453210 |         11 |       30 |      1986 | male   |      |
