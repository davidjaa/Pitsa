import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("see on start");

        String sisestatakse = JOptionPane.showInputDialog(null,
                "Lisandite valimiseks trüki soovitud lisand allolevasse kasti. " +
                        "(Lisandid: sink, paprika, seened, marineeritud kurk, sinihallitusjuust," +
                        "valekana, ananass, tomat, sibul) ", "Andmete sisestamine",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println("wow"+" sisestati: "+sisestatakse);
    }
}
