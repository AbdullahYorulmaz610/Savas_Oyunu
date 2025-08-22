import jdk.jshell.spi.SPIResolutionException;

public abstract class Location {
    protected Player player;
    protected String name;

    public Location(Player player, String name){
        this.name= name;
        this.player = player;
    }
    public String getName(){
        return name;
    }
    public abstract boolean onLocation();
}

