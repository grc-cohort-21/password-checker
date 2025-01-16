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
}
