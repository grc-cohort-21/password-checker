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
 
  @Test
  public void isAlphaNumericVerification() {
    // Arrange
    PasswordChecker password = new PasswordChecker(6, 12);
    // Act
    boolean onlyLetters= password.isAlphanumeric("start");
    boolean onlySpecial = password.isAlphanumeric("////:::???");
    boolean mixed = password.isAlphanumeric("345gl?ty//");
    // Assert
    assertEquals(true, onlyLetters);
    assertEquals(false, onlySpecial);
    assertEquals(false, mixed);
  }

  @Test
  public void isBannedPasswordVerification() {
    // Arrange
    PasswordChecker password = new PasswordChecker(6, 12);
    // Act
    boolean banned = password.isBannedPassword("password123");
    // Assert
    assertEquals(true, banned);
  }
}
