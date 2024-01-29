package fr.cda.demospring.tp1_temperature;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

    // celsius toujours à 0
    public double celsius() {
        return 0;
    }

    // Convertir de Celsius à Fahrenheit
    public double celsiusAFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    // Convertir de Celsius à Kelvin
    public double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Convertir de Fahrenheit à Celsius
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    // Convertir de Kelvin à Celsius
    public double kelvinACelsius(double kelvin) {
        return kelvin - 273.15;
    }
}

