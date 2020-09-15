package fahrenheit;

public class TemperatureConverter {


//    #4
    public static double convertToFahrenheit(double celciusTemperature) {
        return celciusTemperature * 1.8 + 32;
    }

    public static double convertToCelcius(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) / 1.8;
    }

//    #3
//    public static double convertToFahrenheit(double celciusTemperature) {
//        return celciusTemperature * 1.8 + 32;
//    }

//    public static double convertToCelcius(double fahrenheitTemperature) {
//        return 0;
//    }

//    #2
//    public static double convert(double celciusTemperature) {
//        return celciusTemperature * 1.8 + 32;
//    }

//    #1
//    public static double convert(double celciusTemperature) {
//        return 0;
//    }

}
