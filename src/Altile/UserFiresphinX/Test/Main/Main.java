package Altile.UserFiresphinX.Test.Main;

public class Main {
    public static void main(String[] args) {

        int a = 22;     // integer Ganzzahl
        int b = 33;
        float c = 23.222f;  // Floating Point number (kleinerer Bereich als double )
        double d = 20.00003;    // Double da numbas behind da point
        int e = Integer.MAX_VALUE;
        long f = Long.MAX_VALUE;    // Lange Ganzzahl
        char g = 'h';           // Zeichen bzw nur ein buchstabe aus ascII tabelle
        String h = "Hallo ich mag kuchen"; // Zeichenkette bzw Sätze

        /* dies ist ein Blockkommentar
         * Mathematische Operatoren:
         *  + addition
         *  - subtraction
         *  * Multiply
         *  / Divide
         *  % Modulo bzw Rest aus der Division 9 / 2 = 1
         *  ++ incrementieren (um 1 erhöhen)
         *  -- decrementieren (um 1 verringern)
         *
         *  Boolsche Operationen:
         *   == auf gleichheit prüfen
         *   <= kleiner gleich
         *   >= größer gleich
         *   < kleina
         *   > bigga
         *   ! nicht
         *   && Und
         *   || oder
         */

        // Simple Befehls und schleifssen

        if (e == 1) { // Überprüfung wenn wert gleich 1 ist
            System.out.println("congrats dein int = 1");// wird bei 1 geschrieben
        }
        else{   // sonst wird alles in den klammern von else ausgeführt
            System.out.println("Congrats dein int ist nicht 1");
        }
        /* *********************************************************** */
        // for schleife wiederholt für eine gewollte anzahl alle befehle in der
        // schleife dabei wird eine Ganzzahl "i" angelegt und geguckt ob sie
        // kleiner als 50 ist wenn das wahr ist wird alles in den klammern
        // ausgeführt und danach wir "i" um 1 incrementiert (erhört)
        for (int i = 0; i < 50; i++) {
            System.out.println("congrats diese line wurde " + i + " mal ausgeführt");
        }

        // switch case
        switch (e){
            case 1 :
                System.out.println("Arekusu-kun ist schwul.");
                break;
            case 2:
                break;
            default:
                System.out.println("Deus Vult!");
        }

int x = 0;

        do {
            --a;
            x++;
            System.out.println("Nicht der Fall! Versuch: " + x + "!");
        }while(a > 12);

        Auto lennysAuto = new Auto(4, 5, 4, 120, "Mazda6");
        System.out.println(lennysAuto.wieVielPS());
        lennysAuto.pimpen(15);
        System.out.println(lennysAuto.wieVielPS());

        Auto AdisAuto= new Auto(2,1,0,80,"moin");
        System.out.println(AdisAuto.wieVielPS());
        AdisAuto.hupen(7);
        AdisAuto.setName("Hyundai");
        System.out.println(AdisAuto.getName());



        System.out.println("Bazinga");

        System.out.println(f + "\n" + (e + 1));
        System.out.println(h);

    }

}
