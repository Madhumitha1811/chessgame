package Objects;

public class Chessman {
    private Type type;
    private Color color;
    private String coinName;
    private String position;

    public String getPosition() { return position; }

    public void setPosition(String position) { this.position = position; }

    public Type getType() {
        return type;
    }

    public void setType(Type type) { this.type = type; }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

}

