import enums.HealerType;
import enums.HealingType;
import game.Healer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer healer;

    @Before
    public void setUp() {
        healer = new Healer("Galadriel", HealerType.CLERIC, HealingType.DANDELLION);
    }

    @Test
    public void hasName(){
        assertEquals("Galadriel", healer.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(8, healer.getHealthFromEnum());
    }

    @Test
    public void hasHealerType() {
        assertEquals(HealerType.CLERIC, healer.getHealerType());
    }

    @Test
    public void hasHealingType() {
        assertEquals(HealingType.DANDELLION, healer.getHealingType());
    }

    @Test
    public void canChangeHealingType(){
        healer.setHealingType(HealingType.PARACETAMOL);
        assertEquals(HealingType.PARACETAMOL, healer.getHealingType());
    }
    @Test
    public void getHealingStrength(){
        assertEquals(-10, healer.getHealStrength());
    }
}
