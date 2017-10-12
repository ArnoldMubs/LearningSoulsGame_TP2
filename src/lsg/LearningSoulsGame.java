package lsg;

import lsg.characters.Hero;
import lsg.characters.Monster;
import lsg.weapons.Sword;
import lsg.weapons.Weapon;

/**
 *
 */

public class LearningSoulsGame {

    public static void main(String args[]){
        Hero gregooninator = new Hero();

        gregooninator.printStats();

        Monster Studentatort = new Monster("Studentatort");

        Studentatort.printStats();

        Monster Monster_2 = new Monster();

        Monster_2.printStats();

        Monster Monster_3 = new Monster();

        Monster_3.printStats();

        Weapon sword = new Sword();

        System.out.println(" HERO ATTACKS");


        gregooninator.printStats();
        System.out.println("attaque avec "+sword.toString()+" > "+gregooninator.attackWith(sword));
        gregooninator.printStats();
        System.out.println("attaque avec "+sword.toString()+" > "+gregooninator.attackWith(sword));
        gregooninator.printStats();
        System.out.println("attaque avec "+sword.toString()+" > "+gregooninator.attackWith(sword));
        gregooninator.printStats();
        System.out.println("attaque avec "+sword.toString()+" > "+gregooninator.attackWith(sword));

        System.out.println(" MONSTERS ATTACKS");

        Studentatort.printStats();
        System.out.println("attaque avec "+sword.toString()+" > "+Studentatort.attackWith(sword));
        Studentatort.printStats();
        System.out.println("attaque avec "+sword.toString()+" > "+Studentatort.attackWith(sword));
        Studentatort.printStats();
        System.out.println("attaque avec "+sword.toString()+" > "+Studentatort.attackWith(sword));
        Studentatort.printStats();
        System.out.println("attaque avec "+sword.toString()+" > "+Studentatort.attackWith(sword));

        //le friendly est le plus optimal lorsque les fichiers sont sue le meme packages.
        //sinon le public est plus optimal.


    }
}
