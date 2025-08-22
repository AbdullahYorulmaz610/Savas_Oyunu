public class Player {
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String name;
    private String characterType;

    public Player(String name, String characterType){
        this.name = name;
        this.characterType = characterType;
        switch (characterType){
            case "Samuray":
                this.health = 100;
                this.originalHealth = 100;
                this.damage = 15;
                this.money = 50;
                break;

            case "Cəngavər":
                this.health = 120;
                this.originalHealth = 120;
                this.damage = 10;
                this.money = 40;
                break;

            case "Oxatan":
                this.health = 80;
                this.originalHealth = 80;
                this.damage = 20;
                this.money = 60;
                break;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getCharacterType() {
        return characterType;
    }

    public int getHealth() {
        return health;
    }
    public int getOriginalHealth(){return originalHealth;}
    public int getDamage() {
        return damage;
    }

    public int getMoney() {
        return money;
    }



public void showInfo(){
    System.out.println("Ad: " + name + "\nXarakter: " + characterType + "\nSaglamliq: " + health + "\nZerer: " + damage + "\nPul: " + money );

}

}
