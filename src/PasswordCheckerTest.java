import static org.junit.Assert.assertEquals;

import java.util.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
  @Test
  public void desribePasswordLengthVerificationOne() {
    // Arrange
    PasswordChecker password = new PasswordChecker(6, 12);
    // Act
    String hi = password.describePasswordLength("hi");
    // Assert
    assertEquals("short", hi);
  }

  @Test
  public void desribePasswordLengthVerificationTwo() {
    // Arrange
    PasswordChecker password = new PasswordChecker(6, 12);
    // Act
    String bye = password.describePasswordLength("goodbye");
    // Assert
    assertEquals("medium", bye);
  }

  @Test
  public void desribePasswordLengthVerificationThree() {
    // Arrange
    PasswordChecker password = new PasswordChecker(6, 12);
    // Act
    String copy = password.describePasswordLength("uncopoyrightable");
    // Assert
    assertEquals("long", copy);
  }
 
  @Test
  public void isAlphaNumericVerificationOne() {
    // Arrange
    PasswordChecker password = new PasswordChecker(6, 12);
    // Act
    boolean onlyLetters= password.isAlphanumeric("start345");
    // Assert
    assertEquals(true, onlyLetters);
  }

  @Test
  public void isAlphaNumericVerificationTwo() {
    // Arrange
    PasswordChecker password = new PasswordChecker(6, 12);
    // Act
    boolean onlySpecial = password.isAlphanumeric("////:::???");
    // Assert
    assertEquals(false, onlySpecial);
  }

  @Test
  public void isAlphaNumericVerificationThree() {
    // Arrange
    PasswordChecker password = new PasswordChecker(6, 12);
    // Act
    boolean mixed = password.isAlphanumeric("345gl?ty//");
    // Assert
    assertEquals(false, mixed);
  }

  @Test
  public void isBannedPasswordVerificationOne() {
    // Arrange
    PasswordChecker password = new PasswordChecker(6, 12);
    // Act
    boolean notBanned = password.isBannedPassword("thisisnotbanned");
    // Assert
    assertEquals(false, notBanned);
  }

  @Test
  public void isBannedPasswordVerificationTwo() {
    // Arrange
    PasswordChecker password = new PasswordChecker(6, 12);
    // Act
    boolean caseInsensetive = password.isBannedPassword("HELLO");
    // Assert
    assertEquals(true, caseInsensetive);
  }

  @Test
  public void isBannedPasswordVerificationThree() {
    // Arrange
    Set<String> customBanned = new HashSet<>();
    customBanned.add("h3llothere");
    PasswordChecker password = new PasswordChecker(6, 12, customBanned);
    // Act
    boolean banned = password.isBannedPassword("h3llothere");
    // Assert
    assertEquals(true, banned);
  }
}
