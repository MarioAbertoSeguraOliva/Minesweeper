package element;

class Cell {
    private final Mine mine;

    public Cell(Mine mine) {
        this.mine = mine;
    }

    Object content() {
        return mine;
    }

}
