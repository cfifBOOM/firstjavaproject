import org.junit.Assert;
import org.junit.Test;

import static org.example.Main.get_age;

public class MainTest {
    @Test
    public void get_ageTest(){
        Assert.assertEquals("взрослый", get_age(45));
        Assert.assertEquals("взрослый", get_age(18));
        Assert.assertEquals("взрослый", get_age(61));
        Assert.assertEquals("взрослый", get_age(24));
        Assert.assertEquals("пенсионер", get_age(69));
        Assert.assertEquals("пенсионер", get_age(90));
        Assert.assertEquals("пенсионер", get_age(100000));
        Assert.assertEquals("пенсионер", get_age(150));
        Assert.assertEquals("ребенок", get_age(0));
        Assert.assertEquals("ребенок", get_age(13));
        Assert.assertEquals("ребенок", get_age(10));
        Assert.assertEquals("не бывает", get_age(-20));
    }
}