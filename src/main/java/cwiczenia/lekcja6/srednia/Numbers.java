package cwiczenia.lekcja6.srednia;

public class Numbers {
    double numberA;
    double numberB;
    double numberC;

    public Numbers(double numberA, double numberB, double getNumberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = getNumberC;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getNumberC() {
        return numberC;
    }

    public void setNumberC(double numberC) {
        this.numberC = numberC;
    }
}
