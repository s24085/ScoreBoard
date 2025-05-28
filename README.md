Football World Cup Scoreboard
Description

This project implements a simple application for managing football match scores during the World Cup. The application allows starting a match, updating scores, finishing a match, and retrieving a summary of all matches sorted by their total score. All data is stored in memory (using collections).
Assumptions:
    The project is implemented in pure Java without any external libraries (except for the standard Java library).

    The application stores data in memory, so all data is lost when the application stops running.

    A match can be started, its score can be updated, the match can be finished, and a summary of all matches can be printed.

Features:
    Start a Game: Adds a new match with an initial score of 0-0.

    Update Score: Allows updating the score of an existing match (home team score and away team score).

    Finish Game: Removes a match from the scoreboard.

    Match Summary: Returns a list of matches sorted by the total score in descending order, preserving the order in which the matches were added.
