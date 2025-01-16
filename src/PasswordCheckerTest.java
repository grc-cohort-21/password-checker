import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest 
{


  //---------------------Length ----------------------
  @Test
  public void testingDescribePasswordLengthShort() {
  PasswordChecker checker = new PasswordChecker(5, 8);
   String pass = "1234";
    assertEquals( "short", checker.describePasswordLength(pass));
  }

  @Test
  public void testingDescribePasswordLengthMedium() 
  {
  PasswordChecker checker = new PasswordChecker(5, 9);
   String pass = "12345678";
    assertEquals("medium", checker.describePasswordLength(pass));
  }

  @Test
  public void testingDescribePasswordLengthLong() {
  PasswordChecker checker = new PasswordChecker(1, 4);
   String pass = "asdfasdf";
    assertEquals("long", checker.describePasswordLength(pass));
  }

  //---------------------Is Numeric----------------------
  @Test
  public void AlphaNumericSymbolTester() {
  PasswordChecker checker = new PasswordChecker(1, 4);
   String pass = "!@#$%^&*()";
    assertEquals(false, checker.isAlphanumeric(pass));
  }

  @Test
  public void AlphaNumericNoSymbols(){
    PasswordChecker checker = new PasswordChecker(1, 4);
    String pass = "asdfaasdf";
    assertEquals(true, checker.isAlphanumeric(pass));
  }

  @Test
  public void AlphaNumericMixed(){
    PasswordChecker checker = new PasswordChecker(1, 4);
    String pass = "Pass!#$%^&";
    assertEquals(true, checker.isAlphanumeric(pass));
  }
}
