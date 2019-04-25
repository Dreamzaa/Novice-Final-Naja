package Game;

public class Monster1 {
    private String nm;
    private int level;
    private int Hp;
    public Monster1(String nameMons,int Level,int hp){
        nm = nameMons;
        level = Level;
        Hp = hp;
    }

    public String getNameMons(){
        return nm;
    }
    public int getLevel(){
        return level;
    }
    public int getHp(){
        return Hp;
    }
}