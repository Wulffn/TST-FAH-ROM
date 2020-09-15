package fahrenheit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    public void testFahrenheitConverter() {
        double celciusTemperature = 23.5;
        double fahrenheit = TemperatureConverter.convertToFahrenheit(celciusTemperature);
        double expFahrenheit = 74.3;
        assertEquals(expFahrenheit, fahrenheit, 0.1);
    }

    @Test
    public void testFahrenheitConverterNegativeNumbers() {
        double celciusTemperature = -18.7;
        double fahrenheit = TemperatureConverter.convertToFahrenheit(celciusTemperature);
        double expFahrenheit = -1.66;
        assertEquals(expFahrenheit, fahrenheit, 0.1);
    }

    @Test
    public void testCelciusConverter() {
        double fahrenheitTemperature = 90;
        double fahrenheit = TemperatureConverter.convertToCelcius(fahrenheitTemperature);
        double expCelsius = 32.22;
        assertEquals(expCelsius, fahrenheit, 0.1);
    }

    @Test
    public void testCelciusConverterNegativeNumbers() {
        double fahrenheitTemperature = -20;
        double fahrenheit = TemperatureConverter.convertToCelcius(fahrenheitTemperature);
        double expCelsius = -28.89;
        assertEquals(expCelsius, fahrenheit, 0.1);
    }
}
