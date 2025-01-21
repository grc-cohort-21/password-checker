import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class PasswordCheckerTest {
Set<String> customBannedPasswords = new HashSet<>();


//1 test for describePasswordLength, 3 tests for is alphanumeric


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

  @Test
  public void testingIsALphaNumericWithSymbols()
  { 
    
  }

}
