public class SafeHouse extends Location{
    public SafeHouse(Player player){
        super(player, "Safe House");
    }
    @Override
    public boolean onLocation(){
        System.out.println(">> Tehlukesiz mekandasiz, özünüzü evinizdeki kimi hiss edin, canınız doldu");
        this.player.setHealth(this.player.getOriginalHealth());
        System.out.println("Canim benim doldu: " + this.player.getHealth());
        return true;
    }

}
