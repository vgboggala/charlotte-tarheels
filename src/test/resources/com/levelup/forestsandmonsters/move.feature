Feature: ForestsAndMonsters
![Gamer](images/gamerErin.png)
    I want to move player position in the given direction

    Scenario Outline:: Move player position
        Given direction and current position
        When  player is at <x>, <y> and move direction is <moveDirectionInput> 
        Then the Game sets the player's position to <playerPositionOutput>
        Examples:
            | x  | y  | moveDirectionInput   | playerPositionOutput   |  
            | 4  | 3  | "NORTH"              | "4,4"                  |
            | 4  | 4  | "SOUTH"              | "4,3"                  |
            | 4  | 3  | "WEST"               | "3,3"                  |
            | 3  | 3  | "EAST"               | "4,3"                  |
            | 10 | 3  | "EAST"               | "10,4"                 |
            | 10 | 10 | "NORTH"              | "10,10"                |
            | 1  | 1  | "SOUTH"              | "1,1"                  |
            | 1  | 1  | "WEST"               | "1,1"                  |
            