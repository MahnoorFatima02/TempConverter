//test
public class TemperatureConverter {
    public double fahrenheitToCelsius(double fahrenheit) {

        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {

        return (celsius * 9 / 5) + 32;
    }

    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static float kelvinToCel(float kel){
        return (float) (kel - 273.15);
    }

    public static void main(String[] args){
        System.out.println("Done docker");
    }

}