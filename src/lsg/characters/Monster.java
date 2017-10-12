package lsg.characters;

/**
 * La classe lsg.characters.Monster est destinée à fournir les mécanismes de base communs à tous les (types de) monstres
 */
public class Monster extends Character {
    private static int INSTANCES_COUNT = 0;

    public Monster(String name) {
        super(name);
        super.setLife(10);
        super.setStamina(10);
        this.INSTANCES_COUNT++;
    }

    public Monster() {
        super("Monster_"+INSTANCES_COUNT);
        super.setLife(10);
        super.setStamina(10);
        this.INSTANCES_COUNT++;

    }

}
