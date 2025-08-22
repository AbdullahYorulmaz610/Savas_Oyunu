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


        Player player = new Player(name, doyuscu);
        player.showInfo();
        Monster zombie = new Monster("Zombie", 50, 5);

        System.out.println("Mohtesem doyus baslayir!");
        while (player.getHealth() > 0 && zombie.getHealth()>0){
            System.out.println("eger savasmaq isteyirsense 1 istemirsense 2 secerek qac!");
            int secim = sc.nextInt();
            if(secim==1){
            zombie.setHealth(zombie.getHealth() - player.getDamage());
            System.out.println("Oyuncu canavara dehsetli zerbe vurdu!! " + zombie.getHealth());

            if (zombie.getHealth()<=0){
                System.out.println("Canavar rehmetlik oldu!");
                break;
            }

            player.setHealth(player.getHealth()- zombie.getDamage());
            System.out.println("Canavar oyuncuya zerbe vurdu, ehtiyatli olmalisan: " + player.getHealth());
            if (player.getHealth()<=0){
                System.out.println("rehmetlik oldun! oyun bitdi!");
            }
        } else if (secim==2) {
                System.out.println("qacmaga qerar verdin. igidlik 10du 9u qacmaqdir!");
                break;
            }
            else {
                System.out.println("yanlis secim etdin");
            }

            }
        sc.close();

        }
}