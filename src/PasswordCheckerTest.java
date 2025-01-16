import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
  @Test
  public void desribePasswordLengthVerification() {
    // Arrange
    PasswordChecker password = new PasswordChecker(6, 12);
    // Act
    String hi = password.describePasswordLength("hi");
    // Assert
    assertEquals("short", hi);
  }
}
