import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Oyuna xos geldin! Baslamaga hazirsan? ");
        System.out.println("Adini daxil et: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String doyuscu;
        int secim;
        boolean dogruSecim = false;

        do {
            System.out.println("sen hansi doyuscusen? 3-den 1-i sec! \n 1. Samuray \n 2. Cengaver \n 3. Oxatan ");
            secim = sc.nextInt();
            if (secim != 1 || secim != 2 || secim != 3) {
                dogruSecim = true;


                switch (secim) {
                    case 1:
                        doyuscu = "Samuray";
                        System.out.println("Siz " + doyuscu + "secdiniz! yaxin doyusde tesirlidir");
                        break;
                    case 2:
                        doyuscu = "Cengaver";
                        System.out.println("Siz " + doyuscu + "secdiniz! Uzaqdan mohtesem hucum edir!");
                        break;
                    case 3:
                        doyuscu = "Oxatan";
                        break;
                }
            } else {
                System.out.println("sadece 3 eded seciminiz var!");
            }
        } while (!dogruSecim);

        sc.close();
    }
}
