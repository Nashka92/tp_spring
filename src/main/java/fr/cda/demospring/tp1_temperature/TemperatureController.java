package fr.cda.demospring.tp1_temperature;

import fr.cda.demospring.tp1_temperature.dto.DtoConvert;
import fr.cda.demospring.tp1_temperature.dto.TemperatureDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

    // Injection de dépendances
    private final TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }


    @GetMapping
    public TemperatureDto tempTemp() {
        TemperatureDto dto = new TemperatureDto(); //créer une nouvelle instance de TemperatureDTO
        double celsius = temperatureService.celsius(); // récupère la temp en celsius du service
        dto.setCelsius(celsius);
        dto.setFahrenheit(temperatureService.celsiusAFahrenheit(celsius)); // Récup la méthode celsiusAFahrenheit
        dto.setKelvin(temperatureService.celsiusAKelvin(celsius)); // Récup la méthode celsiusAKelvin
        return dto; // retourne l'objet dto
    }

    @PostMapping("/convert")
    public TemperatureService convertTemperature(@RequestBody DtoConvert){
        return
    }

}
