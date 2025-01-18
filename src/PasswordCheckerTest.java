import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testDummy() {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    assertEquals(0, 0);
  }
  //3 tests for describePasswordLength

  //3 tests for isAlphanumeric
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
  
  //3 tests for getDefaultBannedPasswords
  @Test
  public void testCheckIfPasswordIsBanned (){
    //Arange
    PasswordChecker checker = new PasswordChecker(6, 12);
    String testPassword = "Password123";

    //Act
    boolean results= checker.isBannedPassword(testPassword);

    //Assert
    assertEquals(true,results);
  }

  @Test
  public void testCheckIfPasswordIsNotBanned (){
    //Arange
    PasswordChecker checker = new PasswordChecker(6, 12);

    // this test password shouldn't cause a problem
    String testPassword = "testPassword";

    //Act
    boolean results= checker.isBannedPassword(testPassword);

    //Assert
    assertEquals(false,results);
  }


}
