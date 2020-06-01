import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SILab2Test {

    private List<String> createList(String... elementi) {
        return new ArrayList<>(Arrays.asList(elementi));
    }

    SILab2 siLab2 = new SILab2();

    @Test
    void everyStatementTest() {
        RuntimeException exception;

        // Test case 1: Input empty list, no output because exception with the message "List length should be greater than 0" will be thrown.
        exception = assertThrows(RuntimeException.class, () -> siLab2.function(createList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        // Test case 2: Input "#", "0", "#", output "#", "2", "#"
        assertEquals((createList("#", "2", "#")), siLab2.function(createList("#", "0", "#")));
    }

    @Test
    void everyBranchTest() {
        RuntimeException exception;

        // Test case 1: Input empty list, no output because exception with the message "List length should be greater than 0" will be thrown
        exception = assertThrows(RuntimeException.class, () -> siLab2.function(createList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        // Test case 2: Input "0", "#", "0", "#", "0", output "1", "#", "2", "#", "1"
        assertEquals((createList("1", "#", "2", "#", "1")), siLab2.function(createList("0", "#", "0", "#", "0")));
    }
}