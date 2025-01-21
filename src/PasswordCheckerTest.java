import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import java.util.Set;

public class PasswordCheckerTest {

    @Test
    public void testDescribePasswordLength() {
        PasswordChecker checker = new PasswordChecker(6, 10);

        // Test for short passwords
        assertEquals("short", checker.describePasswordLength("abc"));

        // Test for medium passwords
        assertEquals("medium", checker.describePasswordLength("abcdef"));

        // Test for long passwords
        assertEquals("long", checker.describePasswordLength("abcdefghij"));
    }

    @Test
    public void testIsAlphanumeric() {
        PasswordChecker checker = new PasswordChecker(6, 10);

        // Test alphanumeric password
        assertTrue(checker.isAlphanumeric("Password123"));

        // Test password with special characters
        assertFalse(checker.isAlphanumeric("Pass@123"));

        // Test empty password (not alphanumeric)
        assertFalse(checker.isAlphanumeric(""));
    }

    @Test
    public void testIsBannedPassword() {
        PasswordChecker checker = new PasswordChecker(6, 10);

        // Test for default banned password
        assertTrue(checker.isBannedPassword("password"));

        // Test for case-insensitive match
        assertTrue(checker.isBannedPassword("PASSWORD"));

        // Test for password not in the banned list
        assertFalse(checker.isBannedPassword("uniquePassword"));
    }

    @Test
    public void testCustomBannedPasswords() {
        Set<String> customBanned = Set.of("admin", "root", "12345");
        PasswordChecker checker = new PasswordChecker(6, 10, customBanned);

        // Test for custom banned password
        assertTrue(checker.isBannedPassword("admin"));

        // Test for case-insensitive custom banned password
        assertTrue(checker.isBannedPassword("ROOT"));

        // Test for password not in the custom banned list
        assertFalse(checker.isBannedPassword("safePassword"));
    }
}
