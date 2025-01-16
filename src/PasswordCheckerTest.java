import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testingDescribePasswordLength() {
  PasswordChecker checker = new PasswordChecker(5, 8);
   String pass = "1234";
    assertEquals(checker.describePasswordLength(pass), "short");
    assertEquals(checker.describePasswordLength("asfdasd"), "medium");
  }

}
