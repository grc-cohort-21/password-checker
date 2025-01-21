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
    // Create a set of custom banned passwords
    Set<String> customBanned = Set.of("apple", "banana", "orange");

    // Initialize PasswordChecker with custom banned passwords
    PasswordChecker checker = new PasswordChecker(6, 10, customBanned);

    // Test for a custom banned password (exact match)
    assertTrue(checker.isBannedPassword("apple"));

    // Test for a custom banned password (case-insensitive match)
    assertTrue(checker.isBannedPassword("BANANA"));

    // Test for a password that is NOT in the custom banned list
    assertFalse(checker.isBannedPassword("grape"));
}
}
