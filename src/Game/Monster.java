package Game;


public class Monster
{
    int Hpmonster;
    int Attackmonster;
    String Namemonster;

    public Monster()
    {
        Hpmonster = 0;
        Attackmonster = 0;
    }

    public void initialMonster(int indexofmonster)
    {
        if(indexofmonster == 0)
        {
            Namemonster = "Exnologear";
            Hpmonster = 1000;
            Attackmonster = 200;
        }
        else if(indexofmonster == 1)
        {
            Namemonster = "Madusa";
            Hpmonster = 900;
            Attackmonster = 150;
        }
        else if(indexofmonster == 2)
        {
            Namemonster = "Kraken";
            Hpmonster = 800;
            Attackmonster = 130;
        }
        else if(indexofmonster == 3)
        {
            Namemonster = "Chimara";
            Hpmonster = 700;
            Attackmonster = 100;
        }
    }

    public void RandMonsters()
    {
        int idofmonster;
        idofmonster = (int)(Math.random()*4);
        initialMonster(idofmonster);
    }

    public int hpofMonster()
    {
        if(Hpmonster <= 0)
        {
            int hpmonster = 0;
            return hpmonster;
        }
        return Hpmonster;
    }
}