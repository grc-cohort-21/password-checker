import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

  public class PasswordCheckerTest {
  Set<String> customBannedPasswords = new HashSet<>();
  Set<String> customAlphaNumericPasswords = new HashSet<>();


  //3 tests for describePasswordLength
    @Test
  public void testingLengthShort() {
    PasswordChecker shortChecker = new PasswordChecker(5, 10);
    String result = shortChecker.describePasswordLength("1234");
    assertEquals("Expected res: short.", result, "short");

  }//end testingLengthShort

    @Test
  public void testingLengthMedium() {
    PasswordChecker medChecker = new PasswordChecker(5, 10);
    String result = medChecker.describePasswordLength("1234567");
    assertEquals("Expected res: medium.", result, "medium");

  }//end testingLengthMedium

    @Test
  public void testingLengthLong() {
    PasswordChecker longChecker = new PasswordChecker(5, 10);
    String result = longChecker.describePasswordLength("123456790123");
    assertEquals("Expected res: long.", result, "long");
  }//end testingLengthLong



  //3 tests for isBannedPasswords
    @Test
  public void testingBaseBannedPasswords() {
    PasswordChecker baseChecker = new PasswordChecker(5, 10);
    assertEquals("Expect res: banned.", true, baseChecker.isBannedPassword("password"));
    assertEquals("Expect res: banned.", true, baseChecker.isBannedPassword("PASSWORD"));

  }//end testingBaseBannedPasswords

    @Test
  public void testingCustomBannedPasswords() {
    //test passwords also added in main java file
    customBannedPasswords.add("sillyBusiness");
    customBannedPasswords.add("FROLICKING");

    PasswordChecker customChecker = new PasswordChecker(5, 10, customBannedPasswords);
    assertEquals("Expected res: banned.", true, customChecker.isBannedPassword("sillybusiness"));
    assertEquals("Expected res: banned.", true, customChecker.isBannedPassword("frolicking"));

  }//end testingCustomBannedPasswords

    @Test
  public void testingCaseInsensitive() {
    //test password also added in main java file
    customBannedPasswords.add("CASEINSENSITIVE");

    PasswordChecker insenChecker = new PasswordChecker(5, 10, customBannedPasswords);
    assertEquals("Expected res: banned.", true, insenChecker.isBannedPassword("CASEINSENSITIVE"));
    assertEquals("Expected res: banned.", true, insenChecker.isBannedPassword("caseinsensitive"));

  }//end testingCaseInsensitive



  @Test
  public void testDummy() {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    assertEquals(0, 0);
  }



  //3 Tests for isAlphaNumeric
  @Test
  public void testingIsALphaNumericWithNumbers()
  { 
    customAlphaNumericPasswords.add("62840174");
    PasswordChecker alphaNumChecker = new PasswordChecker(5, 10, customAlphaNumericPasswords);
    assertEquals("Expected Result: true", true, alphaNumChecker.isAlphanumeric("62840174"));
  }//end of test 1

  @Test
  public void testingIsALphaNumericWithNumbersAndLetters()
  { 
    customAlphaNumericPasswords.add("moose1234");
    PasswordChecker alphaNumCharChecker = new PasswordChecker(5, 10, customAlphaNumericPasswords);
    assertEquals("Expected Result: true", true, alphaNumCharChecker.isAlphanumeric("moose1234"));
  }//end of test two

  @Test
  public void testingIsALphaNumericWithSymbols()
  { 
    customAlphaNumericPasswords.add("p@ss0wrd!");
    PasswordChecker alphaSymbolChecker = new PasswordChecker(5, 10, customAlphaNumericPasswords);
    assertEquals("Expected Result: false", false, alphaSymbolChecker.isAlphanumeric("p@ssword!"));
  }//end of test three
}
