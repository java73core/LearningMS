package Degree;

public class Faringate implements ConverterT {
    private double celsium;

    @Override
    public double convert(double celsium) {
        return (9.0/5.0) * (celsium + 32);
    }

    @Override
    public void writeResult() {
        System.out.println("Result of convert Celsium to Faringate equals: " + convert(celsium));
    }
}

