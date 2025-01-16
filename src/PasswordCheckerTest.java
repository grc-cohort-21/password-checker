import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
  @Test
  public void desribePasswordLengthVerification() {
    // Arrange
    PasswordChecker password = new PasswordChecker(6, 12);
    // Act
    String hi = password.describePasswordLength("hi");
    String bye = password.describePasswordLength("goodbye");
    String copy = password.describePasswordLength("uncopoyrightable");
    // Assert
    assertEquals("short", hi);
    assertEquals("medium", bye);
    assertEquals("long", copy);
  }
 
}
