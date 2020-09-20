package Targil2;
//    :) Happily by Aviv Wachman YA2
public class Main {

  public static void main(String[] args) {

    Game Pokemon = new Game("Pokemon", 1200, true);
    Game SheshBesh = new Game("SheshBesh", 2, false);
    Game Chess = new Game("Chess", 2, false);

    Game[] myGames = new Game[] {Pokemon, SheshBesh, Chess};
    Country Israel = new Country("Israel");
    for (Game myGame : myGames) {
      Israel.addGame(myGame);
    }
    System.out.println(Israel.toString());

    // Israel doesn't have Aviv
    // Israel has the game Pokemon!
    System.out.println(Pokemon.toString());
    // From Class:
    System.out.println("Israel has Pokemon is " + Israel.isParticipateOne("Pokemon")); // True
    System.out.println("Israel has Aviv is " + Israel.isParticipateOne("Aviv")); // False
    System.out.println("Israel has Pokemon is " + Israel.isParticipateTwo("Pokemon")); // True
    System.out.println("Israel has Aviv is " + Israel.isParticipateTwo("Aviv")); // False

    // From Static:
    System.out.println("Israel has Pokemon is " + isParticipateOne(Israel, "Pokemon")); // True
    System.out.println("Israel has Aviv is " + isParticipateTwo(Israel, "Aviv")); // False
    System.out.println("Israel has Pokemon is " + isParticipateOne(Israel, "Pokemon")); // True
    System.out.println("Israel has Aviv is " + isParticipateTwo(Israel, "Aviv")); // False
  }

  // ------------------------------Way One-----------------------
  // (With the private Current games) :
  public static boolean isParticipateOne(Country place, String name) {
    int i = 0;
    while (i < place.getCurrentGames()) {
      if (place.getGames()[i].getGameName().equals(name)) return true;
      i++;
    }
    return false;
  }

  // ------------------------------Way two-----------------------
  public static boolean isParticipateTwo(Country place, String name) {
    int i = 0;
    while (i < place.getGames().length) {
      if (place.getGames()[i] != null && place.getGames()[i].getGameName().equals(name))
        return true;
      i++;
    }
    return false;
  }
}
