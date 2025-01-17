import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testDummy() {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    assertEquals(0, 0);
  }

  // certain common characters are not handled correctly
  @Test
  public void testIsAlphanumericForCommonSpecialSymbols() {
    
    // Arrange
    // setting up a PasswordChecker with the default configuration
    PasswordChecker checker = new PasswordChecker(6, 12);

    // a test password containing a common symbols (£ British Pound symbol/Alt-0163)
    String testPassword = "2)]\"\'£";

    // Act
    boolean results = checker.isAlphanumeric(testPassword);

    // Assert
    assertEquals(false, results);
  
  }

}
