import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Oyuna xoş gəldin! Başlamağa hazırsan?");
        System.out.print("Adını daxil et: ");
        String name = sc.nextLine();

        String doyuscu = "";
        boolean dogruSecim = false;

        do {
            try {
                System.out.println("Sən hansı döyüşçüsən? 3-dən 1-ni seç!");
                System.out.println("1. Samuray");
                System.out.println("2. Cəngavər");
                System.out.println("3. Oxatan");
                System.out.print("Seçiminizi daxil edin (1-3): ");

                int secim = sc.nextInt();
                sc.nextLine(); // Bufeti təmizləmək üçün

                switch (secim) {
                    case 1:
                        doyuscu = "Samuray";
                        System.out.println("Siz " + doyuscu + " seçdiniz! Yaxın döyüşdə çox təsirlidir.");
                        dogruSecim = true;
                        break;
                    case 2:
                        doyuscu = "Cəngavər";
                        System.out.println("Siz " + doyuscu + " seçdiniz! Uzaqdan möhtəşəm hücum edir!");
                        dogruSecim = true;
                        break;
                    case 3:
                        doyuscu = "Oxatan";
                        System.out.println("Siz " + doyuscu + " seçdiniz! Səssiz və ölümcül hücum edir!");
                        dogruSecim = true;
                        break;
                    default:
                        System.out.println("Xəta: Yalnız 1, 2 və ya 3 daxil edin!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Xəta: Yalnız rəqəm daxil edin!");
                sc.nextLine(); // Bufeti təmizləmək üçün
            }
        } while (!dogruSecim);

        sc.close();
    }
}