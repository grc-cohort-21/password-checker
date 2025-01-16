import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest 
{

  @Test
  public void testingDescribePasswordLengthShort() {
  PasswordChecker checker = new PasswordChecker(5, 8);
   String pass = "1234";
    assertEquals(checker.describePasswordLength(pass), "short");
    assertEquals(checker.describePasswordLength("asaaaaa"), "medium");
  }

  public void testingDescribePasswordLengthMedium() 
  {
  PasswordChecker checker = new PasswordChecker(5, 8);
   String pass = "12345678";
    assertEquals(checker.describePasswordLength(pass), "medium");
  }

  @Test
  public void testingDescribePasswordLengthLong() {
  PasswordChecker checker = new PasswordChecker(1, 4);
   String pass = "asdfasdf";
    assertEquals(checker.describePasswordLength(pass), "long");
    
  }


}
