package ejercio1;

public class Rectangulo {
    private int arriba;
    private int dereita;
    private int abaixo;
    private int esquerda;

    public Rectangulo(int arriba, int dereita, int abaixo, int esquerda) {
        super();
        this.arriba = arriba;
        this.dereita = dereita;
        this.abaixo = abaixo;
        this.esquerda = esquerda;
    }

    public int getArriba () {
        return arriba;
    }

    public int getDereita() {
        return dereita;
    }

    public int getAbaixo () {
        return abaixo;
    }
    
    public int getEsquerda () {
        return esquerda;  
    }
}
