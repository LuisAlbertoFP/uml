package uml;

public class ThreeDShaper extends Shaper {

    public ThreeDShaper(){
        super();
    }

    @Override
    public Shape getShape(ShapeType type) throws Exception {
        switch (type) {
            case SPHERE: 
                return new Sphere();
            default: 
                throw new Exception("Forma no soportada");
        }
    }
}