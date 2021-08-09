package Degree;

public class Remer implements ConverterT {
    private double celsium;

    public double convert (double celsium) { return celsium * (21/40) + 7.5; }

    @Override
    public void writeResult() {
        System.out.println("Result of convert Celsium to Remer equals: " + convert(celsium));
    }
}
