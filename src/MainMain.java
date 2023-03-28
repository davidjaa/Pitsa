import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mis suuruses pitsat soovite? (väike/keskmine/suur) ");
        String sisend = scan.nextLine();

        int suurus = pitsaSuurus(sisend); // tagastab pitsa diameetri vastavalt valitud suurusele

        // loome lisandid
        Lisand pepperoni = new Pepperoni();
        Lisand ananass = new Ananass();
        Lisand paprika = new Paprika();
        Lisand kirsstomat = new Kirsstomat();
        Lisand suitsukana = new Suitsukana();

        // näide retseptipitsadest: ehk kastuaja ei tee oma enda pitsat
        PepperoniPitsa pepperoniPitsa = new PepperoniPitsa(suurus);
        pepperoniPitsa.teePitsaRetseptiJärgi();
        pepperoniPitsa.loetleLisandid();

        MargheritaPitsa margheritaPitsa = new MargheritaPitsa(suurus);
        margheritaPitsa.teePitsaRetseptiJärgi();
        margheritaPitsa.loetleLisandid();



        // ehitame pitsa
        Pitsa pitsa = new Pitsa(suurus); // kui kasutaja tahab nt ise pitsat teha
        pitsa.lisaLisand(pepperoni);
        pitsa.lisaLisand(pepperoni);
        pitsa.lisaLisand(paprika);
        pitsa.lisaLisand(ananass);

        // väljastab lisandid
        pitsa.loetleLisandid();

        // pitsa hind koos lisanditega (põhja hind + iga lisandi hind)
        System.out.println(pitsa.pitsaHindHetkel());


    }
    public static int pitsaSuurus(String sisend) {
        // meetod tagastab pitsa läbimõõdu sentimeetrites vastavalt kasutaja valitud suurusele
        return switch (sisend) {
            case "väike" -> 20;
            case "keskmine" -> 30;
            case "suur" -> 40;
            default -> 0;
        };
    }
}
