import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  Set<String> testSet = new HashSet<>(Arrays.asList("password123", "123456", "qwerty", "letmein", "password", "hello"));

  @Test
  public void testDummy() {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    assertEquals(0, 0);
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
