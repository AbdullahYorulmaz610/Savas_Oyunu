import java.util.Scanner;


public class ToolStore extends Location {
    private Scanner sc = new Scanner(System.in);
    public ToolStore(Player player){
        super(player, "Tool Store");
    }
    @Override
    public boolean onLocation(){
        System.out.println("magazaya xos geldiniz! \n 1 Silahlar \n 2 Zirehler \n 3 Cixis \n secim edin!");

        int secim = sc.nextInt();
        switch (secim){
            case 1:
                printSilah();
                break;
            case 2:
                printZireh();
                break;
            case 3:
                System.out.println("magazadan cixdiniz");
                break;
            default:
                System.out.println("yanlis secim");
        }
        return true;
    }

    private void printSilah(){
        System.out.println("Silahlar: \n 1 Tufeng -- 25 damage, 35 dinar \n 2 Qilinc -- 15 damage, 25 dinar \n 3 Tapanca -- 10 damage, 15 qizil \n 0 Geri don ");
    }
    private void printZireh(){
        System.out.println("Zirehler: \n 1 Agir zireh -- 15 block, 40 dinar \n 2 Orta zireh -- 10 damage, 25 dinar \n 3 yungul zireh -- 5 damage, 15 qizil \n 0 Geri don ");
    }

}
