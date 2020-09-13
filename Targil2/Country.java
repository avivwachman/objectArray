package Targil2;
//    :) Happily by Aviv Wachman YA2

import java.util.Arrays;

public class Country {

    private String countryName;
    private Game[] games;
    private int currentGames;

  public Country(String countryName) {
    this.countryName = countryName;
    this.games = new Game[43];
    this.currentGames=0;

    // ------------To make sure all is null traditional way--------------

    for (int i = 0; i < this.games.length; i++)
      this.games[i] = null;

      // Arrays.fill(this.games, null); //another way...

  }

    public int getCurrentGames() {
        return currentGames;
    }

    public void setCurrentGames(int currentGames) {
        this.currentGames = currentGames;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }


    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", games=" + Arrays.toString(games) +
                ", currentGames=" + currentGames +
                '}';
    }

  // ----------------------add game to array!--------------

  public void addGame(Game play) {
    this.getGames()[this.getCurrentGames()] = play;
    this.setCurrentGames(this.getCurrentGames() + 1);
    }



  // --------------Can be done in class these ways (also done in main method as static)----------


  // ------------------------------Way One-----------------------
  // (With private Current games) :

  public boolean isParticipateOne(String name) {
    int i = 0;
    while (i < this.currentGames) {
      if (this.getGames()[i].getGameName().equals(name)) return true;
      i++;
    }
    return false;
  }

    //------------------------------Way two-----------------------
    public boolean isParticipateTwo(String name){
        int i = 0;
        while (i < this.getGames().length) {
            if (this.getGames()[i]!=null && this.getGames()[i].getGameName().equals(name)) return true;
            i++;
        }
        return false;
    }
}
