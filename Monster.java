
public class Monster {
    Types type;
    String id = "MissingNo";
    double hp = 100;
   private Move moveUsed = new Move(100, 50, Types.NOTYPE);

    public Monster(String name, Types typing){
        this.type = typing;
        this.id = name;
    }

    public void setMoveUsed(Move moveToUse){
        this.moveUsed = moveToUse;
    }

    public Types getMovesType(){
        return moveUsed.type;
    }

    public double calculateDamage(){
        return moveUsed.calculateDamage(type.equals(moveUsed.type));
    }
}
