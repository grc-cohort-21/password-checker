import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testDummy() {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    assertEquals(0, 0);
  }

  @Test
  public void testCaseSensitiveForBan(){
    PasswordChecker testV = new PasswordChecker(6, 12);
    String password = "LetMeIN";

    Boolean testTF = testV.isBannedPassword(password);

    assertEquals(true, testTF);
  }

}
