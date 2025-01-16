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

  @Test
  public void testPasswordLengthMedium() {
    //Arrange
    PasswordChecker mediumName = new PasswordChecker(6, 12);
    String password = "LengthM";
    //Act
    String actualLength = mediumName.describePasswordLength(password);
    //Assert
    assertEquals("medium", actualLength);
  }

  @Test
  public void testPasswordLengthLong ()
  {
     // Arrange
     PasswordChecker longName = new PasswordChecker(6, 12);
     String password  = "GreenMonkeys";
     // Act
     String actualLength =  longName.describePasswordLength(password);
     // Assert
     assertEquals("long", actualLength);
  }

  @Test
  public void testAlphanumericStart() {
    //Arange
    PasswordChecker symbolStart = new PasswordChecker(6, 12);
    String password = "&%brain";
    //Act
    Boolean actualBoolean = symbolStart.isAlphanumeric(password);
    //Assert
    assertEquals(false, actualBoolean);
  }
}
