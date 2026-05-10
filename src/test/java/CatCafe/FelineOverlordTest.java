package CatCafe;

import static org.junit.jupiter.api.Assertions.*;

import catcafe.FelineOverLord;
import org.junit.jupiter.api.Test;

public class FelineOverlordTest {
    @Test
    void compare_to_test() {
        // given
        FelineOverLord f1 = new FelineOverLord("Viehch", 6);
        FelineOverLord f2 = new FelineOverLord("Minusch", 4);
        // when
        int a = f1.compareTo(f2);
        // then
        assertEquals(2, a);
    }

    @Test
    void name_test() {
        // given
        FelineOverLord f2 = new FelineOverLord("Minusch", 4);
        // when
        String n = f2.name();
        // then
        assertEquals(n, "Minusch");
    }

    @Test
    void to_string_test() {
        // given
        FelineOverLord f2 = new FelineOverLord("Minusch", 4);
        // when
        String s = f2.toString();
        // then
        assertEquals(s, "FelineOverLord[name=Minusch, weight=4]");
    }
}
