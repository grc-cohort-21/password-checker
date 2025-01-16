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
    PasswordChecker 
    // Act
    // Assert

    
    




































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












  @Test
  public void doesBannedPasswordsreturnPassword()
  {
    // Arrange
    PasswordChecker test = new PasswordChecker(10,10,testSet);

    // Act
   
    
    // Assert
    

>>>>>>> 0190653749a73810cbd156e44df19e19ad485dbc
  }

  }







}
