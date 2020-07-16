public class PlayerO implements IPlayer {
    private final String symbol = "O";
    private boolean move = false;

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public boolean isMove() {
        return move;
    }

    @Override
    public void switchMove() {
        this.move = !move;
    }

}
