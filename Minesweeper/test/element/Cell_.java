package element;

import org.testng.annotations.Test;

public class Cell_ {
    @Test
    public void contains_mines(){
        Mine mine= new Mine();
        Cell cell = new Cell(mine);
        assert(cell.content() instanceof Mine);
    }
}
