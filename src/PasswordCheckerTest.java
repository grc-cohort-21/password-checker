import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

//emily does banned passwords and 2 of describe password length



public class PasswordCheckerTest {

//public void describingPasswordLength(){
//public void testingBannedPasswords(){
//PasswordChecker bannedPasswords = new PasswordChecker (1, 1, "password");

@Test
public void testingBaseBannedPasswords(){

PasswordChecker baseChecker = new PasswordChecker(4,8);
assertEquals(true, baseChecker.isBannedPassword("password"), "Expect res: banned.");
assertEquals(true, baseChecker.isBannedPassword("PASSWORD"), "Expect res: banned.");

}

@Test
public void testingCustomBannedPasswords(){

Set<String> customBannedPasswords = new HashSet<>();
customBannedPasswords.add("sillyBusiness");
customBannedPasswords.add("FROLICKING");

PasswordChecker customChecker = new PasswordChecker (4,8, customBannedPasswords);
assertEquals(true, customChecker.isBannedPassword("sillyBusiness"), "Expected res: banned.");
assertEquals(true, customChecker.isBannedPassword("FROLICKING"), "Expected res: banned.");
assertEquals(false, customChecker.isBannedPassword("veryVerySecure1902"), "Expected res: allowed.");

}

@Test
public void testingCaseInsensitive(){

Set<String> customBannedPasswords = new HashSet<>(); {

customBannedPasswords.add("CASEINSENSITIVE");

PasswordChecker insenChecker = new PasswordChecker(4, 8, customBannedPasswords);
assertEquals(true, insenChecker.isBannedPassword("CASEINSENSITIVE"), "Expected res: banned.");
assertEquals(true, insenChecker.isBannedPassword("caseinsensitive"), "Expected res: banned.");

}

}






  @Test
  public void testDummy() {
    // This test is used only to validate that your VS Code setup is working
    // Delete this test after you have written your other tests
    assertEquals(0, 0);
  }

}
