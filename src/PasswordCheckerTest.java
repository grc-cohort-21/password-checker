import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  Set<String> testSet = new HashSet<>(Arrays.asList("password123", "123456", "qwerty", "letmein", "password", "hello"));

  @Test
  public void CheckThePassWordLength() {
    // Arrange
    PasswordChecker 
    // Act
    // Assert
  }













  @Test
  public void doesBannedPasswordsreturnPassword()
  {
    // Arrange
    PasswordChecker test = new PasswordChecker(10,10,testSet);

    // Act
   
    
    // Assert
    

  }


  
}
