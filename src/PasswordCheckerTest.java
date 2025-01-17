import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest 
{
  Set<String> customSet = new HashSet<>(Arrays.asList("pa$$word", "p@ssw0rd", "opensesame", "987654"));

  public void CheckThePassWordLength() 
  {
    // Arrange
    PasswordChecker validator = new PasswordChecker(0, 0);
    // Act
    // Assert
  }

    
    









    
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
  ////  isBannedPassword tests  ////
    
  
  // tests if isBannedPassword method returns true if a default banned password is entered
  @Test
  public void doesIsBannedPasswordReturnTrueWhenDefaultInvalid()
  {
    PasswordChecker testChecker = new PasswordChecker(6,12,customSet);
    boolean result = testChecker.isBannedPassword("password");   
    assertEquals(true, result);  
  }


  // tests if isBannedPassword method returns true if a custom banned password is entered
  @Test
  public void doesIsBannedPasswordReturnTrueWhenCustomInvalid()
  {
    PasswordChecker testChecker = new PasswordChecker(6,12,customSet);
    boolean result = testChecker.isBannedPassword("opensesame");    
    assertEquals(true, result);  
  }


  // tests if isBannedPassword method returns false if a valid password is entered
  @Test
  public void doesIsBannedPasswordReturnFalseWhenValid()
  {
    PasswordChecker testChecker = new PasswordChecker(6,12,customSet);
    boolean result = testChecker.isBannedPassword("thisaValidpassword123");  
    assertEquals(false, result);  
  }



  ////  isAlphaNumeric Tests  ////


  // tests if isAlphaNumeric method returns true if a valid password is entered
  @Test
  public void doesIsAlphaNumericReturnTrueWhenValid()
  {
    PasswordChecker testChecker = new PasswordChecker(6,12,customSet);
    boolean result = testChecker.isAlphanumeric("abc12345");
    assertEquals(true, result);  
  }

  // tests if isAlphaNumeric method returns false if special characters are used in password
  @Test
  public void doesIsAlphaNumericReturnFalseWhenInvalidSpecial()
  {
    PasswordChecker testChecker = new PasswordChecker(6,12,customSet);
    boolean result = testChecker.isAlphanumeric("@bc%123$!");
    assertEquals(false, result);  
  }

  // tests if isAlphaNumeric method returns false if a spaces are used in password
  @Test
  public void doesIsAlphaNumericReturnFalseWhenInvalidSpaces()
  {
    PasswordChecker testChecker = new PasswordChecker(6,12,customSet);
    boolean result = testChecker.isAlphanumeric(" abc 12 34 5");
    assertEquals(false, result);  
  }


  
 }
