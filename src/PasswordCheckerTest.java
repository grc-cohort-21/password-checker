import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest 
{

  @Test
  public void testPasswordLengthShort()
  {
     // Arrange
     PasswordChecker shortName = new PasswordChecker(6, 12);
     String password = "Green";
     // Act
     String actualLength = shortName.describePasswordLength(password);
     // Assert
     assertEquals("short", actualLength);
  }

}
