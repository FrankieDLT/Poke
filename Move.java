
import java.util.Random;

public class Move {
    float accuracy;
    double power;
    Types type;
    private Random randomNumber100;
    private final int low = 1;
    private final int high = 100;

    public Move(float accuracy, int power, Types type){
        this.accuracy = accuracy;
        this.power = power;
        this.type = type;
    }

    public double  calculateDamage(boolean STAB){
        if (rng()<=accuracy) {
            return Math.round(damageRoll(power) * getSTAB(STAB));
        } else {
            System.out.println("\nBut it missed\n");
            return 0;
        }
        
    }

    private int rng(){
        randomNumber100 = new Random();
        return randomNumber100.nextInt(high) + low;
    }

    private double getSTAB(boolean stab){
        int multiplier = stab ? 1 : 0;
        return Math.pow(1.5, multiplier);
    }

    private double damageRoll(double power){
        return power * (randomNumber100.nextInt(4) / 10.0 + 1);
    }
}
