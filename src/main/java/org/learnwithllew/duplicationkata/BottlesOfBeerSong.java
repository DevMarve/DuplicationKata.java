package org.learnwithllew.duplicationkata;

public class BottlesOfBeerSong extends Song
{
  private static final String BOTTLES_OF_BEER = "bottles of beer";
  private static final String BOTTLES_OF_BEER_ON_THE_WALL = BOTTLES_OF_BEER + " on the wall";
  private static final String TAKE_ONE_DOWN_PASS_IT_AROUND = "Take one down, pass it around";
  private static final String firstRound = "100";
  private static final String secondRound = "99";
  private static final String thirdRound = "98";

  public void singBottlesOfBeer()
  {
    sing(firstRound + " " + BOTTLES_OF_BEER_ON_THE_WALL);
    sing(firstRound + " " + BOTTLES_OF_BEER);
    sing(TAKE_ONE_DOWN_PASS_IT_AROUND);
    sing(secondRound + " " + BOTTLES_OF_BEER_ON_THE_WALL);
    sing(secondRound + " " + BOTTLES_OF_BEER_ON_THE_WALL);
    sing(secondRound + " " + BOTTLES_OF_BEER);
    sing(TAKE_ONE_DOWN_PASS_IT_AROUND);
    sing(thirdRound + " " + BOTTLES_OF_BEER_ON_THE_WALL);
  }
}
