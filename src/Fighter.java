public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;


    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;


    }

    public int hit(Fighter enmy) {
        System.out.println("------------");
        System.out.println(this.name + " -- " + enmy.name + " " + this.damage + " Struck damage.");
        if (enmy.dodge()) {
            System.out.println(enmy.name + " Incoming damage covered.");
            return enmy.health;
        }

        if (enmy.health - this.damage < 0)
            return 0;

        return enmy.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;

    }

    public boolean isHit() {
        int firstfigther = (int) (Math.random() * 100);
        return firstfigther % 2 == 0;


    }

}

