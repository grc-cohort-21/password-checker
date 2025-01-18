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
  @Test
  public void testShortPasswordLength() {
    //Arrange
    // what does it do with 0?    
    PasswordChecker checker = new PasswordChecker(0, 0);

    // testing empty password
    String testPassword = "a";

    //Act
    String results = checker.describePasswordLength(testPassword);

    //Assert
    assertEquals("long",results);
  }


@Test
  public void testMediumPasswordLenght(){
    //Arrange
    PasswordChecker checker = new PasswordChecker(6, 12);
    String testPassword ="Password123";

    //Act
    String result = checker.describePasswordLength(testPassword);

    //Assert
    assertEquals("medium",result);
  }

@Test
public void testLongPasswordLength() {
  PasswordChecker checker = new PasswordChecker(6, 12);
  String longPassword = "Password1223339393939393939";

  String result = checker.describePasswordLength(longPassword);

  assertEquals("long", result);
}


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

  @Test 
  public void testIsAlphanumericForSpace(){
    //Arrange
    PasswordChecker checker = new PasswordChecker(0, 0);
    String testPassord = " ";

    //Act
    boolean result = checker.isAlphanumeric(testPassord);

    //Assert
    assertEquals(false,result);
  }
  
  @Test
  public void testEmptyPassword(){
    PasswordChecker checker = new PasswordChecker(5, 10);
    String testPassword = "";

    //Act
    boolean result = checker.isAlphanumeric(testPassword);

    //Assert
    assertEquals(false, testPassword);

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

  @Test
  public void testCheckIfPartialPassword (){
    //Arange
    PasswordChecker checker = new PasswordChecker(6, 12);
    String testPassword = "Password123456";

    //Act
    boolean results= checker.isBannedPassword(testPassword);

    //Assert
    assertEquals(false, results);
  }


}
