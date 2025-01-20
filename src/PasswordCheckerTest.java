import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testDummy() {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    assertEquals(0, 0);
  }

  @Test
  public void isThreeAShortPassword() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    String actualResult = passwordUtils.describePasswordLength("zzz");
    assertEquals("short", actualResult);
  }

  @Test
  public void isSixAMediumPassword() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    String actualResult = passwordUtils.describePasswordLength("zzzzzz");
    assertEquals("medium", actualResult);
  }

  @Test
  public void isAnEmptyStringAShortPassword() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    String actualResult = passwordUtils.describePasswordLength(" ");
    assertEquals("short", actualResult);
  }

  @Test
  public void isAnEmptyStringHandledCorrectly() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    Boolean actualResult = passwordUtils.isAlphanumeric("");
    assertEquals(false, actualResult);
  }

  @Test
  public void nonAlphaNumericDetectedCorrectly() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    Boolean actualResult = passwordUtils.isAlphanumeric("er^^ty");
    assertEquals(false, actualResult);
  }

  @Test
  public void alphaNumericDetectedCorrectly() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    Boolean actualResult = passwordUtils.isAlphanumeric("erty");
    assertEquals(true, actualResult);
  }

  @Test
  public void checkForBannedPasswordsEmptySring() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    Boolean actualResult = passwordUtils.isBannedPassword("");
    assertEquals(false, actualResult);
  }

  @Test
  public void checkForBannedPasswordsQwerty() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    Boolean actualResult = passwordUtils.isBannedPassword("qwerty");
    assertEquals(true, actualResult);
  }

  @Test
  public void checkForBannedPasswordsQwertyCaps() {
    PasswordChecker passwordUtils = new PasswordChecker(6, 12);
    Boolean actualResult = passwordUtils.isBannedPassword("QWERTY");
    assertEquals(true, actualResult);
  }

}
