import static org.junit.Assert.assertEquals;

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
    assertEquals("Expected: Short","short",actualLength);
  }
  @Test
  public void testifTooLong() {
    PasswordChecker check = new PasswordChecker(5, 10);
    String password = "fdjfhdjsfhsdfjksdfkjsdfjsdh";
    String actualLength = check.describePasswordLength(password);
    assertEquals("Expected: Long","long",actualLength);
  }
  @Test
  public void testifreturnasMedium() {
    PasswordChecker check = new PasswordChecker(5, 10);
    String password = "fdjfhdf";
    String actualLength = check.describePasswordLength(password);
    assertEquals("Expected: Medium","medium",actualLength);
  }
  @Test
  public void testifalphanumericwhenmixed() { // test 7
    // Arrange - all the stuff you need before starting your test
    PasswordChecker check = new PasswordChecker(5, 10);
    boolean actualTF = check.isAlphanumeric("dsajhk5435");
    // Act - actually making something happen; calling a method
    assertEquals("Expected: True",true,actualTF);
    // Assert - did what i actually got match what i was expecting
  }
  @Test
  public void testifalphamericwhenallnumbers() {
    // Arrange
    PasswordChecker check = new PasswordChecker(5, 10);
    boolean actualTF = check.isAlphanumeric("dsajhkfdfds");
    // Act
    assertEquals("Expected: True",true,actualTF);
    // Assert
  }
  @Test
  public void testifalphamericwhenallnumberswithspecialstuff() {
    // Arrange
    PasswordChecker check = new PasswordChecker(5, 10);
    boolean actualTF = check.isAlphanumeric("$#@@#dsajh%$#%#!!!$kfdfds");
    // Act
    assertEquals("Expected: False",false,actualTF);
    // Assert
    
  }
}
