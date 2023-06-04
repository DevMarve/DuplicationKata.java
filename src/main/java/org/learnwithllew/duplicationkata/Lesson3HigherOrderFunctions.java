package org.learnwithllew.duplicationkata;

public class Lesson3HigherOrderFunctions extends Song
{
  public void singCheers()
  {
    singEven();
    sing("Who do we appreciate?");
    singPrime();
    sing("These are the primes, that we find fine!");

  }

  private void singEven() {
    for (int number = 2; number<=8; number=number+2) {
      singNumber(number);
    }
  }

  private void singPrime() {
    for (int i = 0, number = 17; i<=3; i++) {
      singNumber(number);
      number = getNextPrime(number);
    }
  }

  private void singNumber(int number) {
    sing(number + "! ");
  }

  private int getNextPrime(int number)
  {
    switch (number)
    {
      case 13 :
        return 17;
      case 17 :
        return 19;
      case 19 :
        return 23;
      case 23 :
        return 29;
    }
    return 0;
  }
}
