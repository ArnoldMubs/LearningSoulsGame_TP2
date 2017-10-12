package lsg.characters;

/**
 * La Classe lsg.characters.Hero est destinée à fournir les mécanismes a un hero
 */
public class Hero extends Character {

    public Hero (String name) {
        super(name);
        super.setLife(100);
        super.setStamina(50);
    }

    public Hero () {
        super("Gregooninator");
        super.setLife(100);
        super.setStamina(50);
    }

}
