package lsg.helpers;

class Main{
    public static void main(String[] args){
        Dice dice = new Dice(50);
        int nb,max=0,min = 0;
        for(int i=0;i<500;i++){
            nb = dice.roll();
            max = nb > max? nb:max;
            min = nb < min? nb:min;
            System.out.print(dice.roll()+" ") ;
        }
        System.out.println();
        System.out.println("Min : "+min) ;
        System.out.println("Max : "+max) ;

    }
}
