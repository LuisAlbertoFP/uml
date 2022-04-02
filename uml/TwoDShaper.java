package uml;

public class TwoDShaper extends Shaper {

    public TwoDShaper(){
        super();
    }

    @Override
    public Shape getShape(ShapeType type) throws Exception {
        switch (type) {
            case LINE: 
                return new Line();
            case CIRCLE:
                return new Circle();
            default: 
                throw new Exception("Forma no soportada");
        }
    }
}