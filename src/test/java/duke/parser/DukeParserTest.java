package duke.parser;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DukeParserTest {

    private DukeParser p;

    @BeforeEach
    public void setUp() {
        this.p = new DukeParser();
    }

    @Test
    public void testIsInt() {
        String num = "1";
        String text = "a";
        assertTrue(p.isInt(num));
        assertFalse(p.isInt(text));
    }

    @Test
    public void testIsValidDate() {
        String valid = "2022-12-11";
        String invalid = "20221211";
        String invalid2 = "2022/12/11";
        assertTrue(p.isValidDate(valid));
        assertFalse(p.isValidDate(invalid));
        assertFalse(p.isValidDate(invalid2));
    }

}
