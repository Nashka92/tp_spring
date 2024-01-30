package fr.cda.demospring.tp1_temperature.dto;

import lombok.Data;

// dto = donnée une forme en json.
@Data
public class DtoConvert {

    private double value;
    private double unit;
}
