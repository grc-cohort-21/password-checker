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
  public void confirmShortPasswordLength() {
    PasswordChecker checker = new PasswordChecker(3, 8);
    String passwordLength = checker.describePasswordLength("ll");
    assertEquals("short", passwordLength);
  }

  @Test
  public void confirmMediumPasswordLength() {
    PasswordChecker checker = new PasswordChecker(3, 8);
    String passwordLength = checker.describePasswordLength("llll");
    assertEquals("medium", passwordLength);
  }

  @Test
  public void confirmLongPasswordLength() {
    PasswordChecker checker = new PasswordChecker(3, 8);
    String passwordLength = checker.describePasswordLength("lllllllll");
    assertEquals("long", passwordLength);
  }

  @Test
  public void testAllIsAlphanumeric(){
    PasswordChecker checker = new PasswordChecker(3, 8);
    Boolean actualBoolean = checker.isAlphanumeric("jhfjdb89579823");
    assertEquals(true, actualBoolean);
  }

  @Test
  public void testAllIsNotAlphanumeric(){
    PasswordChecker checker = new PasswordChecker(3, 8);
    Boolean actualBoolean = checker.isAlphanumeric("&^^&^%&*%$%$#___");
    assertEquals(false, actualBoolean);
  }

  @Test
  public void testSomeAreAlphanumeric(){
    PasswordChecker checker = new PasswordChecker(3, 8);
    Boolean actualBoolean = checker.isAlphanumeric("jhfj____9579823");
    assertEquals(false, actualBoolean);
  }

  @Test void testPasswordIsBanned() {
    PasswordChecker checker = new PasswordChecker(3, 8);
    Boolean actualIsBanned = checker.isBannedPassword("password123");
    assertEquals(true, actualIsBanned);
  }

  @Test void testPasswordIsNotBanned() {
    PasswordChecker checker = new PasswordChecker(3, 8);
    Boolean actualIsBanned = checker.isBannedPassword("password1234");
    assertEquals(false, actualIsBanned);
  }
}
