import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest 
{
  Set<String> testSet = new HashSet<>(Arrays.asList("password123", "123456", "qwerty", "letmein", "password", "hello"));

  public void CheckThePassWordLength() 
  {
    // Arrange
    PasswordChecker validator = new PasswordChecker(0, 0);
    // Act
    // Assert
  }

    
    









    @Test
    public void doesBannedPasswordReturnTrue()
    {
      // Arrange
      PasswordChecker testCheck1 = new PasswordChecker(10,10,testSet);
  
      // Act
      boolean result = testCheck1.isBannedPassword("password");
           
      // Assert
      assertEquals(true, result);  
    }

    @Test
    public void doesValidPasswordReturnFalse()
    {
      // Arrange
      PasswordChecker testCheck1 = new PasswordChecker(10,10,testSet);
  
      // Act
      boolean result = testCheck1.isBannedPassword("thisaValidpassword123");
           
      // Assert
      assertEquals(false, result);  
    }


























//Arrange


    //Act

    //Assert

    public boolean isAlphanumeric(String password) 
    {
      for (int i = 0; i < password.length() - 1; i++) 
      {
          char c = password.charAt(i);
          if (!Character.isLetterOrDigit(c)) 
          {
              return false;
          } else 
          {
              return true;
          }
      }
      return true;
    
  }













 

  }
