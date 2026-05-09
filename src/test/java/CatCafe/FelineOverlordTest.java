package CatCafe;
import static org.junit.jupiter.api.Assertions.*;

import catcafe.FelineOverLord;
import org.junit.jupiter.api.Test;

public class FelineOverlordTest {
    @Test
    void compare_weight() {
        //given
        FelineOverLord f1 = new FelineOverLord("Viehch", 6);
        FelineOverLord f2 = new FelineOverLord("Minusch", 4);
        //when
        int a = f1.compareTo(f2);
        //then
        assertEquals(2, a);

    }
}
