package CatCafe;
import static org.junit.jupiter.api.Assertions.*;
import catcafe.CatCafe;
import catcafe.FelineOverLord;
import org.junit.jupiter.api.Test;

public class CatCafeTest {

    private CatCafe cafe;
    FelineOverLord fd;

    public CatCafeTest() {
        cafe = new CatCafe();

        FelineOverLord ge = new FelineOverLord("Gwenapurr Esmeralda", 3);
        FelineOverLord mcs = new FelineOverLord("Miss Chief Sooky", 2);
        FelineOverLord m = new FelineOverLord("Morticia", 7);
        FelineOverLord fd = new FelineOverLord("Fitzby Darnsworth", 5);

        cafe.addCat(ge);
        cafe.addCat(mcs);
        cafe.addCat(m);
        cafe.addCat(fd);
    }

    @Test
    void cat_by_weight_test_4_6(){
        //given in constructor
        //when
        FelineOverLord c = cafe.getCatByWeight(4,6);
        //then
        assertEquals(c.name(), cafe.getCatByName("Fitzby Darnsworth").name());
    }
    @Test
    void cat_by_weight_3(){
        //given in constructor
        //when
        FelineOverLord c = cafe.getCatByWeight(3,4);
        //then
        assertEquals(c.weight(), 3);
    }
    @Test
    void get_cat_by_name_test(){
        //given in constructor
        //when
        FelineOverLord m = cafe.getCatByName("Morticia");
        //then
        assertEquals("Morticia", m.name());
    }

    @Test
    void get_cat_by_name_null(){
        //when
        FelineOverLord c = cafe.getCatByName("");
        //then
        assertNull(c);
    }

    @Test
    void cat_count_test(){
        //given in constructor
        //when
        long num = cafe.getCatCount();
        //then
        assertEquals(4,num);
    }
}
