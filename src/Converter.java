public class Converter {

    private long inch = 1000;
    private long foot = 12000;
    private long yard = 36000;
    private long chain = 792000;
    private long furlong = 7920000;
    private long mile = 63360000;
    private long league = 190080000;

    public double convert(int number, String inputUnit, String outputUnit){
        //convert into thou
        double thouNum = convertThou(number, inputUnit);
        //convert into output
        double result = convertOutputUnit(thouNum, outputUnit);

        return result;
    }

    private double convertThou(int number, String unit){
        double convertedValue = 0;

        if (unit.equals("th") || unit.equals("thou")){
            convertedValue = number;
        } else if (unit.equals("in") || unit.equals("inch")) {
            convertedValue = number * inch;
        } else if (unit.equals("ft") || unit.equals("foot")) {
            convertedValue = number * foot;
        } else if (unit.equals("yd") || unit.equals("yard")) {
            convertedValue = number * yard;
        } else if (unit.equals("ch") || unit.equals("chain")) {
            convertedValue = number * chain;
        } else if (unit.equals("fur") || unit.equals("furlong")) {
            convertedValue = number * furlong;
        } else if (unit.equals("mi") || unit.equals("mile")) {
            convertedValue = number * mile;
        } else { //this only works because the task guarantees that input will be valid
            convertedValue = number * league;
        }


        return convertedValue;
    }

    private double convertOutputUnit(double number, String outputUnit){
        double convertedOutput = 0;

        if (outputUnit.equals("th") || outputUnit.equals("thou")){
            convertedOutput = number;
        } else if (outputUnit.equals("in") || outputUnit.equals("inch")) {
            convertedOutput = number / inch;
        } else if (outputUnit.equals("ft") || outputUnit.equals("foot")) {
            convertedOutput = number / foot;
        } else if (outputUnit.equals("yd") || outputUnit.equals("yard")) {
            convertedOutput = number / yard;
        } else if (outputUnit.equals("ch") || outputUnit.equals("chain")) {
            convertedOutput = number / chain;
        } else if (outputUnit.equals("fur") || outputUnit.equals("furlong")) {
            convertedOutput = number / furlong;
        } else if (outputUnit.equals("mi") || outputUnit.equals("mile")) {
            convertedOutput = number / mile;
        } else { //this only works because the task guarantees that input will be valid
            convertedOutput = number / league;
        }

        return convertedOutput;
    }
}
