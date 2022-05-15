enum Shapes{
    SQUARE, RECTANGLE, CIRCLE, TRAPEZOID,
    RHOMBUS, TRIANGLE, OVAL, HEXAGON
}
class show{
    Shapes myShapes = Shapes.SQUARE;

    public void changeShapes(){
        switch (myShapes){
            case SQUARE:
                myShapes = Shapes.RECTANGLE;
                break;
            case RECTANGLE:
                myShapes = Shapes.CIRCLE;
                break;
            case CIRCLE:
                myShapes = Shapes.TRAPEZOID;
                break;
            case TRAPEZOID:
                myShapes = Shapes.RHOMBUS;
                break;
            case RHOMBUS:
                myShapes = Shapes.TRIANGLE;
                break;
            case TRIANGLE:
                myShapes = Shapes.OVAL;
                break;
            case OVAL:
                myShapes = Shapes.HEXAGON;
                break;
            case  HEXAGON:
                myShapes = Shapes.SQUARE;
                break;
        }
    }
    public String toString(){
        return " " + myShapes;
    }
}

public class Task1 {
    public static void main(String[] args) {
        show s1 = new show();
        for(int i = 0; i < 8; i++){
            System.out.println(s1);
            s1.changeShapes();
        }
    }
}