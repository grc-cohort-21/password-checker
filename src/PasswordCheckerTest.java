import static org.junit.Assert.assertEquals;

import java.util.Set;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testDummy()
  {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    assertEquals(0, 0);
  }

  @Test
  public void testMaxShortLength()
  {
    PasswordChecker passwordCheck = new PasswordChecker(3, 5);
    String passwordLength = passwordCheck.describePasswordLength("Jo");

    assertEquals("short", passwordLength);
  }


  @Test
  public void testMaxMediumLength()
  {
    PasswordChecker passwordCheck = new PasswordChecker(3, 5);
    String passwordLength = passwordCheck.describePasswordLength("Joe");

    assertEquals("medium", passwordLength);
  }

  @Test
  public void testMaxLongLength()
  {
    PasswordChecker passwordCheck = new PasswordChecker(3, 5);
    String passwordLength = passwordCheck.describePasswordLength("Jordan");

    assertEquals("long", passwordLength);
  }

  @Test
  public void testIsNotAlphanumeric()
  {
    PasswordChecker passwordCheck = new PasswordChecker(3, 5);
    boolean alphanumericCheck = passwordCheck.isAlphanumeric("#$@!@%^");

    assertEquals(false, alphanumericCheck);
  }

  @Test
  public void testIsAlphanumeric()
  {
    PasswordChecker passwordCheck = new PasswordChecker(3, 5);
    boolean alphanumericCheck = passwordCheck.isAlphanumeric("Hello1");

    assertEquals(true, alphanumericCheck);
  }

  @Test
  public void testHalfAlphaNumeric()
  {
    PasswordChecker passwordCheck = new PasswordChecker(3, 5);
    boolean alphanumericCheck = passwordCheck.isAlphanumeric("Hello#()");

    assertEquals(false, alphanumericCheck);
  }


  @Test
  public void testIsBanned()
  {
    PasswordChecker passwordCheck = new PasswordChecker(3, 5);
    boolean alphanumericCheck = passwordCheck.isBannedPassword("letmein");

    assertEquals(true, alphanumericCheck);
  }


  @Test
  public void testIsNotBanned()
  {
    PasswordChecker passwordCheck = new PasswordChecker(3, 5);
    boolean alphanumericCheck = passwordCheck.isBannedPassword("Theodore");

    assertEquals(false, alphanumericCheck);
  }

  @Test
  public void testCustomBannedPassword()
  {
    Set<String> passwordCheckSet = new HashSet<>();
    passwordCheckSet.add("dontletthispasswordwork");

    PasswordChecker passwordCheck = new PasswordChecker(3, 5,passwordCheckSet);
    boolean alphanumericCheck = passwordCheck.isBannedPassword("dontletthispasswordwork");

    assertEquals(true, alphanumericCheck);
  }

}
