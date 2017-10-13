package lsg;

import lsg.characters.*;
import lsg.characters.Character;
import lsg.weapons.Claw;
import lsg.weapons.ShotGun;
import lsg.weapons.Sword;
import lsg.weapons.Weapon;
import java.util.Scanner;

/**
 *
 */

public class LearningSoulsGame {
    private Hero hero;
    private Monster monster;
    private Scanner scanner;

    private void refresh (){
        this.hero.printStats();
        this.monster.printStats();
    }

    private void fight1v1 (){
        this.scanner = new Scanner(System.in);
        refresh();
        Character A = this.hero;
        Character B = this.monster;
        Character temp;
        int attack;
        while (A.isAlive() && B.isAlive()) {
            System.out.println();
            System.out.println("Hit enter key for next move > ");
            scanner.nextLine();
            attack = A.attack();
            System.out.println("!!!" + A.getName() +" attacks "+ B.getName() + " with "+A.getWeapon().getName() +"(ATTACK:"+attack+" | DMG: "+B.getHitWith(attack)+")");
            refresh();
            temp=A;
            A=B;
            B=temp;

        }
        if (this.hero.isAlive() ) {
            System.out.print(" --- "+this.hero.getName()+" WINS !!!---");
        }else {
            System.out.print(" --- "+this.monster.getName()+" WINS !!!---");
        }
    }

    private void init (){
        Weapon sword = new Sword();
        Weapon claw = new Claw();
        this.hero = new Hero();
        this.monster = new Monster();
        this.hero.setWeapon(sword);
        this.monster.setWeapon(claw);
    }

    private void play_v1 (){
        init();
        fight1v1();
    }

    public static void main(String args[]){
        Hero grego = new Hero();
        grego.printStats();

        Monster Studentatort = new Monster("Studentatort");

        Studentatort.printStats();
        Monster Monster_2 = new Monster();
        //Monster_2.printStats();
        Monster Monster_3 = new Monster();
        Monster_3.printStats();
        Monster Monster_4 = new Monster();
        Monster_4.printStats();
        Monster Monster_5 = new Monster();
        //Monster Monster_6 = new Monster();

        Weapon sword = new Sword();
        Weapon shotGun = new ShotGun();
        Character rick = new Hero("Rick");
        Character zombie = new Monster("Zombie");
        rick.setWeapon(shotGun);

        /*   Test   */

        Character gregooninator = new Hero();
        gregooninator.setWeapon(sword);
        gregooninator.printStats();
        System.out.println("attaque avec "+sword.toString()+" > "+gregooninator.attack());
        gregooninator.printStats();
        System.out.println("attaque avec "+sword.toString()+" > "+gregooninator.attack());
        gregooninator.printStats();
        System.out.println("attaque avec "+sword.toString()+" > "+gregooninator.attack());
        gregooninator.printStats();
        System.out.println("attaque avec "+sword.toString()+" > "+gregooninator.attack());

        while(zombie.isAlive() && rick.getStamina() > 0){
            rick.printStats();
            zombie.printStats();
            System.out.println("!!!" +rick.getName()+" attack "+zombie.getName()+" with "+rick.getWeapon().getName()+" ("+rick.attack()+") !!! -> Effective DMG:000"+zombie.getHitWith(rick.attack())+"PV");
        }


        while(zombie.isAlive() && rick.getStamina() > 0){
            rick.printStats();
            zombie.printStats();
            System.out.println("!!!" +rick.getName()+" attack "+zombie.getName()+" with "+rick.getWeapon().getName()+" ("+rick.attack()+") !!! -> Effective DMG:000"+zombie.getHitWith(rick.attack())+"PV");
        }

        //le friendly est le plus optimal lorsque les fichiers sont sue le meme packages.
        //sinon le public est plus optimal.

        LearningSoulsGame game = new LearningSoulsGame() ;
        game.play_v1();
    }
}
