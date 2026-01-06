
public class Monster {
    TypesImplementation type = TypesImplementation.NOTYPE;
    String id = "MissingNo";
    double hp = 100;
   private Move moveUsed = new Move(100, 50, TypesImplementation.NOTYPE);
    private double damageMultiplier = 1;

    public Monster(String name, TypesImplementation typing){
        this.type = typing;
        this.id = name;
    }

    public void setMoveUsed(Move moveToUse){
        this.moveUsed = moveToUse;
    }

    public TypesImplementation getMovesType(){
        return moveUsed.type;
    }

    private double getSTAB(){
        if (type.equals(moveUsed.type)) damageMultiplier*=1.5;
        return damageMultiplier;
    }

    private double getTypeMultiplier(Monster defendiMonster){
        /*for (int i = 0; i < defendiMonster.typeList.resist.size(); i++) {
        // For multy types
        if (defendiMonster.typeList.get(i).type.resist.contains(moveUsed.type)){
            damageMultiplier *= .5;
        } else if (moveUsed.type.advantage.contains(defendiMonster.get(i).type)) {
            damageMultiplier *= 2;
        }
        }
        */
        if (defendiMonster.getMovesType().containsTypes(defendiMonster.type.resist, moveUsed.type.name())){
            damageMultiplier *= .5;
        } else if (defendiMonster.getMovesType().containsTypes(defendiMonster.type.inmune, moveUsed.type.name())) {
            damageMultiplier = 0;
        }else if (moveUsed.type.containsTypes(moveUsed.type.advantage,defendiMonster.type.name())) {
            damageMultiplier *= 2;
        }
        return damageMultiplier;
    }

    public double getFinalDamageMultiplier(Monster defendiMonster) {
        return getSTAB()*getTypeMultiplier(defendiMonster);
    }

    public double calculateDamage(Monster defendiMonster){
        return moveUsed.calculateDamage(getFinalDamageMultiplier(defendiMonster));
    }
}
