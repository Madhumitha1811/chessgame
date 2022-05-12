package Objects;

public class Board {

    private Box box[][];

    public Box[][] getBox() {
        return box;
    }

    public void setBox(Box[][] box) {
        this.box = box;
    }

    public Board(){

        box = new Box[8][8];  // declaration of 64 boxes(2D array) in the chess board
        int i=0;
        String colorName;
        for(int row=0;row<8;row++){
            for(int column=0;column<8;column++){
                if(i==0) colorName=Color.B.toString(); // assign the color name for the box(B -> Black , W -> White)
                else colorName=Color.W.toString();
                i=1-i;
                box[row][column]=allocateIndexName(row,column,colorName);  // allocate the box attributes for the particular box
            }
            i=1-i;
        }
    }

    public Box allocateIndexName(int row,int column,String colorName){
        Box box =new Box();

        String rowName[];
        String columnName[];

        rowName = new String[]{ "1","2","3","4","5","6","7","8" };
        columnName = new String[]{ "a","b","c","d","e","f","g","h" };

        box.setIndexName(columnName[column]+rowName[row]);
        box.setChessman(null);
        if(colorName.equals("B")){
            box.setColor(Color.B);
        }
        else {
            box.setColor(Color.W);
        }

        return box;

    }

}

