public class Medias {

private double N1;
private double N2;
private double N3;


/**
 * Construtor sem Parametros
 */
public Medias (){
    System.out.println("Construtor: " + this);
    setN1(0);
        setN2(0);
            setN3(0);


}

/**
 * Construtor com Parametros
 * @param N1 A N1 da média
 * @param N2 A N2 da média
 * @param N3 A N3 da média
 */
public Medias (double N1, double N2, double N3){
    setN1(N1);
    setN2(N2);
    setN3(N3);

}

/**
 * Recuperador da N1
 * @return  A primeira nota
 */
    public double getN1() {
        return N1;
    }
    
    /**
 * Recuperador da N2
 * @return  A segunda nota
 */
    public double getN2() {
        return N2;
    }
    
    /**
 * Recuperador da N3
 * @return  A terceira nota
 */
    public double getN3() {
        return N3;
    }

/**
 * Modificador da N1
 * @param N1 A N1 da media
 */
    public void setN1(double N1) {
        this.N1 = N1;
    }
    
    /**
 * Modificador da N2
 * @param N2 A N2 da media
 */
    public void setN2(double N2) {
        this.N2 = N2;
    }
    
    /**
 * Modificador da N3
 * @param N3 A N3 da media
 */
    public void setN3(double N3) {
        this.N3 = N3;
    }
    
    public double getMedia () {
        double media = ((getN1() + getN2() + getN3())/3);
        return media;
    }
}

