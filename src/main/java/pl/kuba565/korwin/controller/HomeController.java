package pl.kuba565.korwin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kuba565.korwin.service.KorwinSpeechGenerator;

@RestController
public class HomeController {
    @Autowired
    private KorwinSpeechGenerator korwinSpeechGenerator;

    @GetMapping()
    public String getKorwinSpeech() {
        return korwinSpeechGenerator.generateKorwinSpeech();
    }
}
