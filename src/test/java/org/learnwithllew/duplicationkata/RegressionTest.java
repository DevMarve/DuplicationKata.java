package org.learnwithllew.duplicationkata;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class RegressionTest
{
  @Test
  public void testCat()
  {
    CatSong song = new CatSong();
    song.singCatSong();
    Approvals.verify(song.song);
  }
  @Test
  public void testBeer()
  {
    BottlesOfBeerSong song = new BottlesOfBeerSong();
    song.singBottlesOfBeer();
    Approvals.verify(song.song);
  }
  @Test
  public void testNames()
  {
    Lesson21 song = new Lesson21();
    String[] names = {"Llewellyn", "Samatha", "Tomas", "Emilia"};
    song.singSong(1, names);
    song.singSong(2, names);
    song.singSong(3, names);
    Approvals.verify(song.song);
  }
  @Test
  public void testNumbers()
  {
    Lesson3HigherOrderFunctions song = new Lesson3HigherOrderFunctions();
    song.singCheers();
    Approvals.verify(song.song);
  }
  @Test
  public void testNames3()
  {
    Lesson31 song = new Lesson31();
    String[] names = {"Llewellyn", "Samatha", "Tomas", "Emilia"};
    song.singSong(1, names);
    song.singSong(2, names);
    song.singSong(3, names);
    Approvals.verify(song.song);
  }
}
