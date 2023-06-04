package org.learnwithllew.duplicationkata;

public class Lesson21 extends Song
{
  public void singSong(int style, String... names)
  {
    for (String name: names) {
      if (style == 1 && name.startsWith("L", 0)) {
        sing("Hip Hip Horray! For " + name);
      } else if (style == 2 && name.startsWith("am", 1)) {
        sing("Say yeah! Say yo! Say " + name);
      } else {
        sing("Hello " + name + ", it's nice to meet you.");
      }
    }
  }
}
