package pl.kuba565.korwin.service;

import org.springframework.stereotype.Service;
import pl.kuba565.korwin.util.KorwinSpeechUtil;

@Service
public class KorwinSpeechGenerator {

    public String generateKorwinSpeech() {
        return KorwinSpeechUtil.generateKorwinSpeech();
    }
}
