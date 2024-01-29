package fr.cda.demospring.tp1_temperature.dto;

import lombok.Data;

@Data
public class TemperatureDto {
    private double celsius;
    private double fahrenheit;
    private double kelvin;
}
