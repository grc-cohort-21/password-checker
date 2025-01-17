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

    
    









    
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // tests if isBannedPassword method returns true if a default banned password is entered
    @Test
    public void doesIsBannedPasswordReturnTrueWhenDefaultInvalid()
    {
      // Arrange
      PasswordChecker testCheck = new PasswordChecker(10,10,customSet);
  
      // Act
      boolean result = testCheck.isBannedPassword("password");
           
      // Assert
      assertEquals(true, result);  
    }


     // tests if isBannedPassword method returns true if a custom banned password is entered
     @Test
     public void doesIsBannedPasswordReturnTrueWhenCustomInvalid()
     {
       // Arrange
       PasswordChecker testCheck = new PasswordChecker(10,10,customSet);
   
       // Act
       boolean result = testCheck.isBannedPassword("opensesame");
            
       // Assert
       assertEquals(true, result);  
     }

    
    // tests if isBannedPassword method returns false if a valid password is entered
    @Test
    public void doesIsBannedPasswordReturnFalseWhenValid()
    {
      // Arrange
      PasswordChecker testCheck = new PasswordChecker(10,10,customSet);
  
      // Act
      boolean result = testCheck.isBannedPassword("thisaValidpassword123");
           
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
