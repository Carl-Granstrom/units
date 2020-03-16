public class Main {

    static private Converter converter = new Converter();

    public static void main(String[] args) {

        Kattio io = new Kattio(System.in, System.out);

        while (io.hasMoreTokens()) {

            int numUnits = io.getInt();
            String inputUnit = io.getWord();
            io.getWord(); //skip "in"
            String outputUnit = io.getWord();

            double convertedResult = converter.convert(numUnits, inputUnit, outputUnit);

            io.println(convertedResult);
        }
        io.close();
    }
}
