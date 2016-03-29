package element;
import org.testng.annotations.Test;

public class Mine_ {
    @Test
    public void can_explode(){
        Mine mine = new Mine();
        assert(mine.canExplode());
    }
}
