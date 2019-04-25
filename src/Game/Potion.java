package Game;

public class Potion
{
    private String name;
    private int stm;
    public Potion(String namepotion,int statusitem){
        name = namepotion;
        stm = statusitem;
    }

    public String getName(){
        return name;
    }
    public int getStatus(){
        return stm;
    }
}
