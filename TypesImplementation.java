import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TypesImplementation {
    NORMAL(new ArrayList<>(),new ArrayList<>(),Arrays.asList(Types.GHOST)),
    FIRE(Arrays.asList(Types.GRASS,Types.STEEL,Types.ICE,Types.BUG),Arrays.asList(Types.FIRE,Types.GRASS,Types.ICE,Types.STEEL,Types.FAIRY),new ArrayList<>()),
    WATER(Arrays.asList(Types.FIRE,Types.GROUND,Types.ROCK),Arrays.asList(Types.FIRE,Types.WATER),new ArrayList<>()),
    GRASS(Arrays.asList(Types.WATER,Types.GROUND,Types.ROCK),Arrays.asList(Types.WATER,Types.GRASS,Types.ELECTRIC,Types.GROUND),new ArrayList<>()),
    GHOST(Arrays.asList(Types.GHOST,Types.PSY),Arrays.asList(Types.POISON,Types.BUG),Arrays.asList(Types.NORMAL,Types.FIGHTING)),
    DARK(Arrays.asList(Types.PSY,Types.GHOST),Arrays.asList(Types.GHOST,Types.DARK),Arrays.asList(Types.PSY)),
    PSY(Arrays.asList(Types.FIGHTING,Types.POISON),Arrays.asList(Types.FIGHTING,Types.PSY),new ArrayList<>()),
    GROUND(Arrays.asList(Types.FIRE,Types.ELECTRIC,Types.POISON,Types.ROCK,Types.STEEL),Arrays.asList(Types.POISON,Types.ROCK),Arrays.asList(Types.ELECTRIC)),
    ROCK(Arrays.asList(Types.FIRE,Types.ICE,Types.FLYING,Types.BUG),Arrays.asList(Types.NORMAL,Types.FIRE,Types.POISON,Types.FLYING),new ArrayList<>()),
    FLYING(Arrays.asList(Types.FIGHTING,Types.GRASS,Types.BUG),Arrays.asList(Types.FIGHTING,Types.GRASS,Types.BUG),Arrays.asList(Types.GROUND)),
    STEEL(Arrays.asList(Types.ICE,Types.ROCK,Types.FAIRY),Arrays.asList(Types.NORMAL,Types.GRASS,Types.ICE,Types.FLYING,Types.PSY,Types.BUG,Types.ROCK,Types.FAIRY,Types.STEEL,Types.DRAGON),Arrays.asList(Types.POISON)),
    POISON(Arrays.asList(Types.GRASS,Types.FAIRY),Arrays.asList(Types.GRASS,Types.FIGHTING,Types.POISON,Types.BUG,Types.FAIRY),new ArrayList<>()),
    FAIRY(Arrays.asList(Types.DRAGON,Types.FIGHTING,Types.DARK),Arrays.asList(Types.FIGHTING,Types.BUG,Types.DARK),Arrays.asList(Types.DRAGON)),
    ICE(Arrays.asList(Types.GRASS,Types.FLYING,Types.GROUND,Types.DRAGON),Arrays.asList(Types.ICE),new ArrayList<>()),
    FIGHTING(Arrays.asList(Types.NORMAL,Types.ROCK,Types.ICE,Types.STEEL,Types.DARK),Arrays.asList(Types.DARK,Types.BUG,Types.ROCK),new ArrayList<>()),
    BUG(Arrays.asList(Types.GRASS,Types.PSY,Types.DARK),Arrays.asList(Types.GRASS,Types.FIGHTING,Types.GROUND),new ArrayList<>()),
    DRAGON(Arrays.asList(Types.DRAGON),Arrays.asList(Types.FIRE,Types.WATER,Types.GRASS,Types.ELECTRIC),new ArrayList<>()),
    ELECTRIC(Arrays.asList(Types.WATER,Types.FLYING),Arrays.asList(Types.ELECTRIC,Types.FLYING,Types.STEEL),new ArrayList<>()),
    NOTYPE(new ArrayList<>(),new ArrayList<>(),new ArrayList<>());

    public List<Types> advantage;

    public List<Types> resist;

    public List<Types> inmune;

    private TypesImplementation(List<Types> adv,List<Types> resist, List<Types> inmune){
        this.advantage = adv;
        this.resist = resist;
        this.inmune = inmune;
    }

    public boolean containsTypes(List<Types> list,String typeName){
        for (Types type : list) {
            if (type.name().equals(typeName))
                return true;
        }
        return false;
    }
}
