import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.frequency;

public class Pitsa {
    private List<Lisand> lisandid; // siia kogutakse pitsa peale pandud lisandid
    private double pitsaPõhjaHind;
    private double suurus;

    public Pitsa(double suurus) {
        super(); // suurust küsitakse kasutajalt
        this.suurus = suurus;
        this.lisandid = new ArrayList<Lisand>();
        if (suurus == 20) {
            this.pitsaPõhjaHind = 2.99;
        } else if (suurus == 30) {
            this.pitsaPõhjaHind = 4.99;
        } else if (suurus == 40) {
            this.pitsaPõhjaHind = 6.99;
        } else {
            this.pitsaPõhjaHind = 0;
        }
    }


    public void lisaLisand(Lisand lisand) {
        lisandid.add(lisand);
    }
    public double pitsaHindHetkel() { // pitsa hind koos praeguste lisanditega
        double lisanditeHindKokku = 0;
        for (Lisand l : lisandid) {
            lisanditeHindKokku += l.getHind();
        }
        return pitsaPõhjaHind + lisanditeHindKokku;
    }

    public void loetleLisandid() {
        // uus list, kuhu lisatakse ekraanile väljastatud lisandid,
        // et mitu korda valitud sama lisandit ei väljastata eraldi (vaid valitud kordade arvuga)
        List<Lisand> väljastatudLisandid = new ArrayList<Lisand>();
        String koma = "";
        for (Lisand l : lisandid) {
            if (!väljastatudLisandid.contains(l)) {
                int mitu = frequency(lisandid, l);
                System.out.print(koma+mitu+"x "+l.getLisandiNimi());
                koma = ", ";
                väljastatudLisandid.add(l);
            }
        }
        System.out.println();
    }
}