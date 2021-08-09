package Degree;

public class Newton implements ConverterT {
    private double celsium;

    @Override
    public double convert (double celsium) {
        return 0.33 * celsium;
    }

    @Override
    public void writeResult() {
        System.out.println("Result of convert Celsium to Newton equals: " + convert(celsium));
    }
}
