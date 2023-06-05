package org.learnwithllew.duplicationkata;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lesson31 extends Song
{
  public void singSong(int style, String... names)
  {
    for (String name: names) {
      switch (style)
      {
        case 1 :
          singLine(name, this::type1Special, this::type1SpecialSong);
          break;
        case 2 :
          singLine(name, this::type2Special, this::type2SpecialSong);
          break;
        case 3 :
            singLine(name, x -> false, x -> {;});
          break;
      }
    }
  }

  private boolean type1Special(String name) {
    return name.startsWith("L");
  }

  private void type2SpecialSong(String name) {
    sing(name.toUpperCase() + "! Yay " + name + "!");
  }

  private boolean type2Special(String name) {
    return name.contains("a");
  }

  private void type1SpecialSong(String name1) {
    sing("Hip Hip Horray! For " + name1);
  }

  private void singLine(String name, Predicate<String> isSpacial, Consumer<String> stringConsumer) {
    if (isSpacial.test(name) )
    {
      stringConsumer.accept(name);
    }
    else
    {
      sing("Hello " + name + ", it's nice to meet you.");
    }
  }
}
