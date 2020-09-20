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
    int size = this.games.length;
    Game[] back = new Game[size]; //create new array of games in memory
    if(this.getCurrentGames()==0)
        return back; //in this case no need to fill because we don't have what to fill
    for (int i = 0; i < size; i++) {
        if(this.games[i]!=null)
      back[i] = new Game(this.games[i]);
    }
    return back;
    }

  public void setGames(Game[] games) {
    int n = this.games.length;
    for (int i = 0; i < n; i++) {
      if (games[i] != null) this.games[i] = new Game(games[i]);
    }
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
    Game[] my = this.getGames();
    my[this.getCurrentGames()] = play;
    this.setGames(my);
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
