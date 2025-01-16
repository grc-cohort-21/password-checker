import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest 
{

  @Test
  public void testDummy() 
  {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    
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







}
