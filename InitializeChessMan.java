package Objects;

public class InitializeChessMan {

    private Chessman[] whiteChessMen;
    private Chessman[] blackChessMen;

    public Chessman[] getWhiteChessMen() {
        return whiteChessMen;
    }

    public void setWhiteChessMen(Chessman[] whiteChessMen) {
        this.whiteChessMen = whiteChessMen;
    }

    public Chessman[] getBlackChessMen() {
        return blackChessMen;
    }

    public void setBlackChessMen(Chessman[] blackChessMen) {
        this.blackChessMen = blackChessMen;
    }

    public InitializeChessMan(){
        blackChessMen = new Chessman[16];
        whiteChessMen = new Chessman[16];

        for(int i=0;i<16;i++){
            Chessman chessman = new Chessman();
            String coinName ="";
            Type[] types = Type.values();
            coinName = Color.B.toString() + types[i].toString();
            chessman.setType(types[i]);
            chessman.setColor(Color.B);
            chessman.setCoinName(coinName);
            chessman.setPosition(null);
            blackChessMen[i]=chessman;
        }
        for(int i=0;i<16;i++){
            Chessman chessman = new Chessman();
            String coinName ="";
            Type[] types = Type.values();
            coinName = Color.W.toString() + types[i].toString();
            chessman.setType(types[i]);
            chessman.setColor(Color.B);
            chessman.setCoinName(coinName);
            chessman.setPosition(null);
            whiteChessMen[i]=chessman;
        }
    }

}
