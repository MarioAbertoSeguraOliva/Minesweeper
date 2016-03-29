package element;

class Cell {
    private final Mine mine;
    
    public Cell(Mine mine) {
        this.mine = mine;
    }

    Mine content() {
        return mine;
    }
}
