package prakPemlan.tugas3;

import java.util.Scanner;

public class mainHero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Permainan adu hero");
        System.out.println("Silahkan masukkan hero Anda!");
        System.out.println();
        Hero hero1 = new Hero();
        do {
            System.out.println("CATATAN: HP/Attack/Defend tidak boleh > 500 point");
            System.out.println("===========================[HERO 1]===========================");
            System.out.print("Name    : ");
            hero1.setName(in.nextLine());
            System.out.print("HP      : ");
            hero1.setHP(in.nextDouble());
            System.out.print("Attack  : ");
            hero1.setAttack(in.nextDouble());
            System.out.print("Defense : ");
            hero1.setDefense(in.nextDouble());
            System.out.println("===============================================================");
            System.out.println();
        } while (hero1.getHP() > 500 || hero1.getAttack() > 500 || hero1.getDefense() > 500 );

        String NamaHero2;
        double HPHero2, AttackHero2, DefenseHero2;
        do {
            System.out.println("CATATAN: HP/Attack/Defend tidak boleh > 500 point");
            System.out.println("===========================[HERO 2]===========================");
            System.out.print("Name     : ");
            NamaHero2 = in.next();
            System.out.print("HP       : ");
            HPHero2 = in.nextDouble();
            System.out.print("Attack   : ");
            AttackHero2 = in.nextDouble();
            System.out.print("Defense  : ");
            DefenseHero2 = in.nextDouble();
            System.out.println("===============================================================");
            System.out.println();
        }while (HPHero2 > 500 || AttackHero2 > 500 || DefenseHero2 >500 );
        Hero hero2 = new Hero(NamaHero2, HPHero2, AttackHero2, DefenseHero2);

        int ronde = 1;
        if (hero1.getAttack() <= hero2.getDefense() && hero1.getDefense() >= hero2.getAttack()) {
            System.out.println("============================================================");
            System.out.println("====================[PERTARUNGAN IMBANG]====================");
            System.out.println("============================================================");
        } else {
            while (hero1.getHP() > 0 && hero2.getHP()>0){
                System.out.println("===========================[RONDE " + ronde + "]===========================");
                hero1.Game(hero2);
                hero2.Game(hero1);
                ronde++;
            }
            if (hero1.getHP()> hero2.getHP()){
                System.out.println("Pertarungan telah usai!");
                System.out.println(hero2.getName() + " telah kalah!");
                System.out.println("===============================================================");
                System.out.println(hero1.getName() + " adalah pemenangnya");
            } else {
                System.out.println("Pertarungan telah usai!");
                System.out.println(hero1.getName() + " telah kalah!");
                System.out.println("===============================================================");
                System.out.println(hero2.getName() + " adalah pemenangnya!");
            }
        }
    }
}
