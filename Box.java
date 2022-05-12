package Objects;

public class Box{
    private Color color;
    private String indexName;
    private Chessman chessman;

    public Chessman getChessman() { return chessman; }

    public void setChessman(Chessman chessman) { this.chessman = chessman; }

    public Color getColor() { return color; }

    public void setColor(Color color) { this.color = color; }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }



}
