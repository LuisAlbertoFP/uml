package ejercio1;

public class Ejercicio1 {

    private static int superficieSolapada(Rectangulo r1, Rectangulo r2) {
        
       int superficie = 0;
        if (r1.getArriba() <= r2.getAbaixo() || 
            r1.getAbaixo() >= r2.getArriba() || 
            r1.getDereita() <= r2.getEsquerda() || 
            r1.getEsquerda() >= r2.getDereita()) {
                superficie = 0;
            } else {
                int width = Math.abs(Math.min(r1.getDereita(), r2.getDereita()) - Math.max(r1.getEsquerda(), r2.getEsquerda()));
                int height = Math.abs(Math.min(r1.getArriba(), r2.getArriba()) - Math.max(r1.getAbaixo(), r2.getAbaixo()));
                System.out.println("Superficie solapada: w: "+width+" , h: "+height);
                superficie = Math.abs(width * height) ;
        } 
        return superficie;
    }

    public static void main(String args[]){
        Rectangulo r1 = new Rectangulo(5,5,1,1);
        Rectangulo r2 = new Rectangulo(4,4,0,0);
        System.out.println("Superficie solapada: "+superficieSolapada(r1, r2));
    }
}