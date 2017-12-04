import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEightBall {
    EightBall eightBall;

    @Before
    public void before() {
        eightBall = new EightBall();
    }


    @Test
    public void hasNumberOfWords(){
        assertEquals(0, eightBall.getOptionCount());
    }


    @Test
    public void hasEntries(){
        eightBall.add("Yes");
        eightBall.add("No");
        eightBall.add("Maybe");
        assertEquals(3, eightBall.getOptionCount());
    }

    @Test
    public void removeAnswer() {
        eightBall.add("Yes");
        eightBall.add("No");
        eightBall.add("Maybe");
        eightBall.remove("Maybe");
        assertEquals(2, eightBall.getOptionCount());
    }

    @Test
    public void randomAnswer() {
        eightBall.add("Yes");
        eightBall.add("No");
        eightBall.add("Maybe");
        System.out.println(eightBall.shake());
        assertNotNull(eightBall.shake());
        }
}