package prakPemlan.tugas3;

public class Hero {
    private String name;
    private double hp, attack, defense;

    public Hero() {
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setHP(double hp) {
        this.hp = hp;
    }
    public double getHP() {
        return hp;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
    public double getAttack() {
        return attack;
    }
    public void setDefense(double defense){
        this.defense = defense;
    }
    public double getDefense(){
        return this.defense;
    }
    public Hero(String name, double hp, double attack, double defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public void Game (Hero Musuh){
        if (this.getHP() != 0 && Musuh.getHP() != 0) {
            double damage = this.getAttack() - Musuh.getDefense();
            if (damage < 0) damage = 0;
            System.out.println(this.getName() + " menyerang " + Musuh.getName());
            System.out.println();
            System.out.println(this.getName() + " menyerang sebesar " + this.getAttack());
            System.out.println(Musuh.getName() + " memiliki pertahanan sebesar " + Musuh.getDefense());
            Musuh.setHP(Musuh.getHP() - damage);
            if (this.hp < 0) this.hp = 0;
            if (Musuh.getHP() < 0) Musuh.setHP(0);
        }
    }
}
