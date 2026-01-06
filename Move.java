
import java.util.Random;

public class Move {
    float accuracy;
    double power;
    TypesImplementation type;
    private Random randomNumber100;
    private final int low = 1;
    private final int high = 100;

    public Move(float accuracy, int power, TypesImplementation type){
        this.accuracy = accuracy;
        this.power = power;
        this.type = type;
    }

    public double  calculateDamage(double multiplier){
        if (rng()<=accuracy) {
            return Math.round(damageRoll(power) * multiplier);
        } else {
            System.out.println("\nBut it missed\n");
            return 0;
        }
        
    }

    private int rng(){
        randomNumber100 = new Random();
        return randomNumber100.nextInt(high) + low;
    }

    private double damageRoll(double power){
        return power * (randomNumber100.nextInt(4) / 10.0 + 1);
    }
}
