Feature: Search Player

  @Nba
  Scenario: user search for a player
    Given user on NBA page
    When user click on "Players"
    Then user  type in search bar "LaMelo Ball"
    Then  user click on  slideButton team
    Then user click on "CHA"

  @NbaTeam
  Scenario: user tickets page
    Given user on NBA ticket page
    Then user select from dropdown box "May"
    Then user select from dropdown box team  "Dallas Mavericks"
    Then user click on "Find Tickets"
    Then user validate word "Sorry, no games were found for the selected filters."







