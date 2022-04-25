Feature: ForestsAndMonsters
![Gamer](images/gamerErin.png)
    I want to create a new custom character, setting their name

    Scenario Outline:: Set player name
        Given the player's name is <playerNameInput>
        When the player sets their name
        Then the Game sets the player's name to <playerNameOutput>
        Examples:
            | playerNameInput | playerNameOutput |  
            | "Erin"          | "Erin"           |
            | ""              | "Player"         |
        
