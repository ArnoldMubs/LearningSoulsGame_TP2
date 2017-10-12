package lsg.characters;
import java.lang.String;
import lsg.helpers.*;
import lsg.weapons.*;


public class Character {
    protected String name; //on les passe de private a protected pour y avoir access dans la les classes heritantes.
    protected int life;
    protected int maxLife;
    protected int stamina;
    protected int maxStamina;
    protected Dice dice;
    protected Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }



    public Character (String name) {
        this.name = name;
        this.dice = new Dice(101);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    protected void setLife(int life) {
        this.life = life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    protected void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getStamina() {
        return stamina;
    }

    protected void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    protected void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public void printStats () {
        System.out.println(this.toString());
    }

    public boolean isAlive() {
        return this.life > 0;
    }

    public int attackWith(Weapon weapon) {
        int roll,degats;
        if (weapon.isBroken()){
            degats = 0;
        }else {
            roll = dice.roll();
            if (roll == 0){
                degats = weapon.getMinDamage();
            }else if (roll == 100){
                degats = weapon.getMaxDamage();
            }else {
                degats = weapon.getMinDamage() + Math.round(((weapon.getMaxDamage() - weapon.getMinDamage())*((float)roll/100)));
            }

        }
        if (((float)this.stamina/weapon.getStamCost()) >= 1.0){
            this.stamina -= weapon.getStamCost();
        }
        else{
            degats = Math.round(degats * ((float)this.stamina/weapon.getStamCost()));
            this.stamina = 0;
        }
        weapon.use();
        return degats;
    }

    @Override
    public String toString() {
        if (isAlive()) {
            return String.format("%-20s %-20s LIFE:%-10s STAMINA:%-10s(ALIVE)","[ "+getClass().getSimpleName()+" ]",this.getName(),String.format("%5d",this.getLife()),String.format("%5d",this.getStamina()));
        }
        return String.format("%-20s %-20s LIFE:%-10s STAMINA:%-10s","[ "+getClass().getSimpleName()+" ]",this.getName(),String.format("%5d",this.getLife()),String.format("%5d",this.getStamina()));
    }
}
