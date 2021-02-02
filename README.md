# MonopolySimulator

This program is an analysis tool for the board game "Monopoly". I enjoy winning Monopoly more than losing, so I created this so I could get an idea of the best-working strategies for the game.

It essentially simulates players rolling dice around a Monopoly board for the user's preferred amount of turns, calculating different statistics depending on return type. The number of players simulated is determined by the user's input.

The program includes various game mechanics such as:

  - Rolling doubles means that a particular player gets to play again  
  - Players going to jail if they land on the "Go to Jail" space, and if three doubles in a row are rolled
  - Chance and community chest cards may affect where a player is, as well as how much they may have to pay when landing on a property (i.e. Pay the owner twice the amount to which they are otherwise entitled)
  
There are three return types for the program. They each return different statistics about the simulation trial:

  - Return type 1 gives average break-even time for each property, not counting costs for other properties in the color group. 
  - Return type 2 also gives average break-even time for each property. This includes costs for other properties in the color group.
  - Return type 3 yields the average income per turn for each property.
  
Note that this is a simulation relying on pseudo-randomness, meaning that each run of the program will vary slightly in its results. 

Statistical analysis of the results can be found in the Monopoly Analysis.xlsx file. This analysis is not complete at the moment, and data collection is ongoing.
