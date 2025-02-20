import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    @Test
    void testFahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(0.0, converter.fahrenheitToCelsius(32.0), 0.01);
        assertEquals(-40.0, converter.fahrenheitToCelsius(-40.0), 0.01);
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), 0.01);
    }

    @Test
    void testCelsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.01);
        assertEquals(212.0, converter.celsiusToFahrenheit(100.0), 0.01);
        assertEquals(-40.0, converter.celsiusToFahrenheit(-40.0), 0.01);
    }

    @Test
    void testIsExtremeTemperature() {
        TemperatureConverter converter = new TemperatureConverter();
        assertTrue(converter.isExtremeTemperature(-65.0));
        assertTrue(converter.isExtremeTemperature(65.0));
        assertFalse(converter.isExtremeTemperature(30.0));
        assertFalse(converter.isExtremeTemperature(-5.0));
    }

    @Test
    public void testKelvinToCel() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(0.0, converter.kelvinToCel(273.15F), 0.001);
    }

}