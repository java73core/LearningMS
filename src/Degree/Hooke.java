package Degree;

public class Hooke implements ConverterT {
    private double celsium;

    @Override
    public double convert(double celsium) {
        return celsium * 2.4;
    }

    @Override
    public void writeResult() {
        System.out.println("Result of convert Celsium to Hook equals: " + convert(celsium));
    }
}
