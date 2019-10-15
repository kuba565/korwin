package pl.kuba565.korwin.util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class KorwinSpeechUtil {

    private KorwinSpeechUtil() {
    }

    private static List<Integer> get6RandomInts() {
        Random randomGenerator = new Random();

        int randomInt1 = randomGenerator.nextInt(22);
        int randomInt2 = randomGenerator.nextInt(22);
        int randomInt3 = randomGenerator.nextInt(22);
        int randomInt4 = randomGenerator.nextInt(22);
        int randomInt5 = randomGenerator.nextInt(22);
        int randomInt6 = randomGenerator.nextInt(22);

        return Arrays.asList(randomInt1, randomInt2, randomInt3, randomInt4, randomInt5, randomInt6);
    }

    public static String generateKorwinSpeech() {
        List<Integer> randomInts = get6RandomInts();

        List<String> strings1 = Arrays.asList(
                "Proszę zwrócić uwagę, że",
                "I tak mam trzy razy mniej czasu, więc proszę mi pozwolić powiedzieć:",
                "Państwo się śmieją, ale",
                "Ja nie potrzebowałem edukacji seksualnej, żeby wiedzieć, że",
                "No niestety:",
                "Gdzie leży przyczyna problemu? Ja państwu powiem:",
                "Państwo chyba nie widzą, że",
                "Oświadczam kategorycznie:",
                "Powtarzam:",
                "Powiedzmy to z całą mocą:",
                "W Polsce dzisiaj",
                "Państwo sobie nie zdają sprawy, że",
                "To ja przepraszam bardzo:",
                "Otóż nie wiem, czy pan wie, że",
                "Yyyyy...",
                "Ja chcę powiedzieć jedną rzecz:",
                "Trzeba powiedzieć jasno:",
                "Jak powiedział wybitny krakowianin Stanisław Lem,",
                "Proszę mnie dobrze zrozumieć:",
                "Ja chciałem państwu przypomnieć, że",
                "Niech państwo nie mają złudzeń:",
                "Powiedzmy to wyraźnie:"
        );

        List<String> strings2 = Arrays.asList(
                "właściciele niewolników",
                "związkowcy",
                "trockiści",
                "tak zwane dzieci kwiaty",
                "rozmaici urzędnicy",
                "federaści",
                "etatyści",
                "ci durnie i złodzieje",
                "ludzie wybrani głosami meneli spod budki z piwem",
                "socjaliści pobożni",
                "socjaliści bezbożni",
                "komuniści z krzyżem w zębach",
                "agenci obcych służb",
                "członkowie Bandy Czworga",
                "pseudo-masoni z Wielkiego Wschodu Francji",
                "przedstawiciele czerwonej hołoty",
                "ci wszyscy (tfu!) geje",
                "funkcjonariusze reżymowej telewizji",
                "tak zwani ekolodzy",
                "ci wszyscy (tfu!) demokraci",
                "agenci bezpieki",
                "feminazistki"
        );

        List<String> strings3 = Arrays.asList(
                "po przeczytaniu \"Manifestu komunistycznego\"",
                "którymi się brzydzę",
                "których nienawidzę",
                "z okolic \"Gazety Wyborczej\"",
                "czyli taka żydokomuna",
                "odkąd zniesiono karę śmierci",
                "którymi pogardzam",
                "kórych miejsce w normalnym kraju jest w więzieniu",
                "na polecenie Brukseli",
                "posłusznie",
                "bezmyślnie",
                "z nieprawdopodobną pogardą dla człowieka",
                "za pieniądze podatników",
                "zgodnie z ideologią LGBTQZ",
                "za wszelką cenę",
                "zupełnie bezkarnie",
                "całkowicie bezczelnie",
                "o poglądach na lewo od komunizmu",
                "celowo i świadomie",
                "z premedytacją",
                "od czasów Okrągłego Stołu",
                "w ramach postępu"
        );

        List<String> strings4 = Arrays.asList(
                "udają homoseksualistów,",
                "niszczą rodzinę,",
                "idą do polityki,",
                "zakazują góralom robienia oscypków,",
                "organizują paraolimpiady,",
                "wprowadzają ustrój, w którym raz na cztery lata można wybrać sobie pana,",
                "ustawiają fotoradary,",
                "wprowadzają dotacje,",
                "wydzielają buspasy,",
                "podnoszą wiek emerytalny,",
                "rżną głupa,",
                "odbierają dzieci rodzicom,",
                "wprowadzają absurdalne przepisy,",
                "umieszczają dzieci w szkołach koedukacyjnych,",
                "wprowadzają parytety,",
                "nawołują do podniesienia podatków,",
                "próbują wyrzucić kierowców z miast,",
                "próbują skłócić Polskę z Rosją,",
                "głoszą brednie o globalnym ociepleniu,",
                "zakazują posiadania broni,",
                "nie dopuszczają prawicy do władzy,",
                "uczą dzieci homoseksualizmu,"
        );

        List<String> strings5 = Arrays.asList(
                "żeby poddawać wszystkich tresurze,",
                "bo taka jest ich natura,",
                "bo chcą wszystko kontrolować,",
                "bo nie rozumieją, że socjalizm nie działa,",
                "żeby wreszcie zapanował socjalizm,",
                "dokładnie tak jak towarzysz Janosik,",
                "zamiast pozwolić ludziom zarabiać,",
                "żeby wyrwać kobiety z domu,",
                "bo to jest w interesie tak zwanych ludzi pracy,",
                "zamiast pozwolić decydować konsumentowi,",
                "żeby nie opłacało się mieć,",
                "zamiast obniżyć podatki,",
                "bo nie rozumieją, że selekcja naturalna jest czymś dobrym,",
                "żeby mężczyźni przestali być agresywni,",
                "bo dzięki temu mogą brać łapówki,",
                "bo dzieki temu mogą kraść,",
                "bo dostają za to pieniądze,",
                "bo tak się uczy w państwowej szkole,",
                "bo bez tego (tfu!) demokracja nie może istnieć,",
                "bo głupich jest więcej niż mądrych,",
                "bo chcą tworzyć raj na ziemi,",
                "bo chcą niszczyć cywilizację białego człowieka,"
        );

        List<String> strings6 = Arrays.asList(
                "co zresztą ma tyle samo sensu, co zawody w szachach dla debili.",
                "co zostało dokładnie zaplanowane w Magdalence przez śp. generała Kiszczaka.",
                "i trzeba być idiotą, żeby ten system popierać.",
                "ale nawet ja jeszcze dożyję normalnych czasów.",
                "co dowodzi, że wyskrobano nie tych, co trzeba.",
                "a zwykłym ludziom wmawiają, że im coś \"dadzą\".",
                "cóż: chcieliście (tfu!) demokracji, to macie.",
                "dlatego trzeba zlikwidować koryto, a nie zmieniać świnie.",
                "a wystarczyłoby przestać wypłacać zasiłki.",
                "podczas gdy normalni ludzie uważani są za dziwaków.",
                "co w wieku dziewiętnastym po prostu by wyśmiano.",
                "dlatego w społeczeństwie jest równość, a powinno być rozwartwienie.",
                "co prowadzi Polskę do katastrofy.",
                "dlatego trzeba przywrócić normalność.",
                "ale w wolnej Polsce pójdą siedzieć.",
                "przez kolejne kadencje.",
                "o czym się nie mówi.",
                "i właśnie dlatego Europa umiera.",
                "ale przyjdą muzułmanie i zrobią porządek.",
                "tak samo zresztą jak za Hitlera.",
                "proszę zobaczyć, co się dzieje na Zachodzie, jeśli mi państwo nie wierzą.",
                "co sto lat temu nikomu nie przyszłoby nawet do głowy."
        );

        return String.format("%s %s %s %s %s %s",
                strings1.get(randomInts.get(0)),
                strings2.get(randomInts.get(1)),
                strings3.get(randomInts.get(2)),
                strings4.get(randomInts.get(3)),
                strings5.get(randomInts.get(4)),
                strings6.get(randomInts.get(5)));
    }
}
