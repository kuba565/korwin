package pl.kuba565.korwin.service;

import org.springframework.stereotype.Service;
import pl.kuba565.korwin.util.KorwinSpeechUtil;

@Service
public class KorwinSpeechGenerator {

    public String generateKorwinSpeech() {
        return "<form action=\"https://korwin-generator.herokuapp.com\">\n" +
                "    <input type=\"submit\" value=\"generuj wypowiedź Korwina\" />\n" +
                "</form>" +
                KorwinSpeechUtil.generateKorwinSpeech();
    }
}
