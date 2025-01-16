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
  public void testHelloWorld2IsAlphanumeric() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    String password = "HelloWorld2";
    boolean result = passwordUtils.isAlphanumeric(password);
    assertEquals(true, result);
  }

  @Test
  public void testHelloWorldHashtag2IsNotAlphanumeric() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    String password = "HelloWorld#2";
    boolean result = passwordUtils.isAlphanumeric(password);
    assertEquals(false, result);
  }

  @Test
  void test2HelloWorldIsAlphanumeric() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    String password = "2HelloWorld";
    boolean result = passwordUtils.isAlphanumeric(password);
    assertEquals(true, result);
  }

  @Test
  public void testCaseSensitiveForBan() {
    PasswordChecker testV = new PasswordChecker(6, 12);
    String password = "LetMeIN";

    Boolean testTF = testV.isBannedPassword(password);

    assertEquals(true, testTF);
  }

  @Test
  public void testSpaceAfterBanPassword() {
    PasswordChecker testV = new PasswordChecker(6, 12);
    String password = "letmein ";

    Boolean testTF = testV.isBannedPassword(password);

    assertEquals(false, testTF);
  }

  @Test
  public void testContainABannedPassword(){
    PasswordChecker testV = new PasswordChecker(6, 12);
    String password = "containsletmein";

    Boolean testTF = testV.isBannedPassword(password);

    assertEquals(false, testTF);
  }

  @Test
  public void testPasswordLengthShort() {
    PasswordChecker testV = new PasswordChecker(6, 12);
    String password = "test";

    assertEquals("short", testV.describePasswordLength(password));
  }

  @Test
  public void testPasswordLengthMedium() {
    PasswordChecker testV = new PasswordChecker(6, 12);
    String password2 = "Test3239";

    assertEquals("medium", testV.describePasswordLength(password2));
  }

  @Test
  public void testPasswordLengthLong() {
    PasswordChecker testV = new PasswordChecker(6, 12);
    String password3 = "Test1234567890";

    assertEquals("long", testV.describePasswordLength(password3));
  }
}
