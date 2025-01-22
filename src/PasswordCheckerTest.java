import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
  @Test
  public void testIfCaseSensBanned() {
    PasswordChecker check = new PasswordChecker(5, 10);
    String password = "hELlO";
    boolean actualTF = check.isBannedPassword(password);
    assertEquals("Expected: True",true,actualTF);
  }
  @Test
  public void testifAllCpasBannedPswisBanned() {
    PasswordChecker check = new PasswordChecker(5, 10);
    String password = "LETMEIN";
    boolean actualTF = check.isBannedPassword(password);
    assertEquals("Expected: True",true,actualTF);
  }
  @Test
  public void testIfPartialBannedPswisNOTbanned() {
    PasswordChecker check = new PasswordChecker(5, 10);
    String password = "qwert";
    boolean actualTF = check.isBannedPassword(password);
    assertEquals("Expected: False",false,actualTF);
  }
  @Test
  public void testIfoneCharLengthPswistooshort() {
    PasswordChecker check = new PasswordChecker(5, 10);
    String password = "a";
    String actualLength = check.describePasswordLength(password);
    assertEquals("Expected: short","short",actualLength);
  }

  // @Test public void testFive() {
  //   // Arrange

  //   // Act

  //   // Assert
    
  // }

  // @Test public void testSix() {
  //   // Arrange

  //   // Act

  //   // Assert
    
  // }

  // @Test public void testIfAllUpperCaseBannedPasswordsWork() { // test 7
  //   // Arrange - all the stuff you need before starting your test
  //   isBannedPassword uppercaseHello = new isBannedPassword("HELLO");

  //   // Act - actually making something happen; calling a method

  //   // Assert - did what i actually got match what i was expecting
  // }

  // @Test public void testEight() {
  //   // Arrange

  //   // Act

  //   // Assert
    
  // }

  // @Test public void testNine() {
  //   // Arrange

  //   // Act

  //   // Assert
    
  // }
}
