
import java.lang.classfile.instruction.ThrowInstruction;

public class PokeBattle {
    static double damage;

    public static void main(String[] args) {
        Monster haunter = new Monster("Haunter", Types.GHOST);
        haunter.setMoveUsed(new Move(100, 30, Types.GHOST));
        Monster lillipup = new Monster("Lillipup", Types.GHOST);
        StartBattle(haunter,lillipup);
    }

    private static void StartBattle(Monster attackingMonster, Monster defendiMonster) {
        PokeBattle.damage = attackingMonster.calculateDamage();
        System.out.println("Start Battle");
        System.out.println("\n" + attackingMonster.id + " used an attack that is " 
        + attackingMonster.getMovesType() + " on " + defendiMonster.id + "\n");
        defendiMonster.hp = defendiMonster.hp - damage;
        System.out.println(defendiMonster.id + " took " + damage + " damage.\n\n");
        System.out.println("End of Battle\n"); 
    }

   
}