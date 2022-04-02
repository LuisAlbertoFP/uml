package uml;

public class ShaperProvider {
    public ShaperProvider(){
        
    }
    public Shaper getShaper(ShaperType shaperType) {
        switch (shaperType) {
            case TWO_D_SHAPER:
                return new TwoDShaper();
            default:
                return new ThreeDShaper();
        }
    }
}
