package org.learnwithllew.duplicationkata;

public class CatSong extends Song
{

  public static final String BUT_THE_CAT_CAME_BACK = "But the cat came back";
  public static final String THE_VERY_NEXT_DAY = "The very next day";
  public static final String OH_THE_CAT_CAME_BACK = "Oh the cat came back";
  public static final String WE_THOUGHT_HE_WAS_A_GONER = "We thought he was a goner";
  public static final String HE_JUST_WOULDN_T_GO_AWAY = ", he just wouldn't go away";
  public static final String CAME_BACCK_WOULDN_T_GO_AWAY = BUT_THE_CAT_CAME_BACK + HE_JUST_WOULDN_T_GO_AWAY;

  public void singCatSong()
  {
    sing("We gave the cat to a little kid");
    sing(BUT_THE_CAT_CAME_BACK);
    sing(THE_VERY_NEXT_DAY);
    sing(OH_THE_CAT_CAME_BACK);
    sing(WE_THOUGHT_HE_WAS_A_GONER);
    sing(CAME_BACCK_WOULDN_T_GO_AWAY);
    sing("We sent the cat out on a boat");
    sing(BUT_THE_CAT_CAME_BACK);
    sing(THE_VERY_NEXT_DAY);
    sing(OH_THE_CAT_CAME_BACK);
    sing(WE_THOUGHT_HE_WAS_A_GONER);
    sing(CAME_BACCK_WOULDN_T_GO_AWAY);
  }
}
