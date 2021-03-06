public class PlayerX implements IPlayer {
    private final String symbol = "X";
    private boolean move = true;

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
