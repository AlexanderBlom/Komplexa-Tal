public class Komplex {
    //Variabler
    private double a;
    private double b;

    //Konstruktor
    public Komplex(double re, double im){
        this.a = re;
        this.b = im;
    }

    //Metod för att skriva talet som (a + bi)
    public String toString() {
        if (b < 0) {
            return a + " - " + (-b) + "i";
        } else {
            return a + " + " + b + "i";
        }
    }

    //Metod för att addera två komplexa tal
    public void add(Komplex z2) {
        a = a + z2.a;
        b = b + z2.b;
    }

    //Metod för att multiplicera två komplexa tal
    public void multiply(Komplex z2) {
        Komplex temp = new Komplex(this.a, this.b);
        this.a = (temp.a * z2.a) - (temp.b * z2.b);
        this.b = (temp.a * z2.b) + (z2.a * temp.b);
    }

    public double arg(){
        return Math.atan(b / a);
    }
}


