package Game;



public class Berserk extends NOVICS
{
    String berserk = "Berserk";
    String[] Skill = {"AuraBlade","SpiralPierce","JusticeBlade","BerserkBlade"};
    int valuedamageSkill;
    int Hp;
    int Mana;
    int Exp;
    int Level;
    int novicofattack;
    int novicofarmor;
    String mycareer;
    String skillname;

    public Berserk()
    {
        super("Berserk");
        Hp = 1500;
        Mana = 200;
        Exp = 0;
        Level = 10;
        novicofattack = 500;
        novicofarmor = 400;
        skillname = "";
        valuedamageSkill = 0;
    }


    public void useBerserkskill(int indexofskill)
    {
        mycareer = berserk;
        if(indexofskill == 0)
        {
            skillname = Skill[indexofskill];
            valuedamageSkill = 100;
            listMonster.Hpmonster -= valuedamageSkill;
        }

        else if(indexofskill == 1)
        {
            skillname = Skill[indexofskill];
            valuedamageSkill = 150;
            listMonster.Hpmonster -= valuedamageSkill;
        }

        else if(indexofskill == 2)
        {
            skillname = Skill[indexofskill];
            valuedamageSkill = 200;
            listMonster.Hpmonster -= valuedamageSkill;
        }

        else if(indexofskill == 3)
        {
            skillname = Skill[indexofskill];
            valuedamageSkill = 300;
            listMonster.Hpmonster -= valuedamageSkill;
        }
    }
    @Override
    public void Armordestroyed()
    {
        novicofarmor = novicofarmor - listMonster.Attackmonster;
        if(novicofarmor <= 0)
        {
            Hp = Hp - listMonster.Attackmonster;
            novicofarmor = 0;
        }
    }

    @Override
    public void getExp()
    {
        if(listMonster.Hpmonster <=0)
        {
            Exp = Exp + 200;
            bag.putItemIntoBag();
        }
    }

    @Override
    public void getLevel()
    {
        if(Exp >=150)
        {
            Level++;
            novicofattack += 20;
            novicofarmor += 20;
            Mana += 20;
            Exp = 0;
        }
    }

    @Override
    public void increseHp()
    {
        if(Level >= 1 && Exp == 0)
        {
            Hp = Hp + 100;
        }
    }

    public int hpofberserk()
    {
        if(Hp <= 0)
        {
            int hpberserk = 0;
            return hpberserk;
        }
        return Hp;
    }

    @Override
    public void usePotionnovic()
    {
        int totalPotion = bag.getPotion();

        if(totalPotion >0)
        {
            for (Item item : bag.items){
                if(item.NameItem.equals("Potion")){
                    Hp = Hp + item.value;
                    bag.usePotion();
                    break;
                }
            }
        }
        else
        {
            System.out.println("------------------------");
            System.out.println("Not enough Potion");
            System.out.println("------------------------");
        }
    }

    @Override
    public void useSwordnovic()
    {
        int totalSword = bag.getSword();

        if(totalSword >0)
        {
            for (Item item : bag.items){
                if(item.NameItem.equals("Sword")){
                    novicofattack = novicofattack + item.value;
                    bag.useSword();
                    break;
                }
            }
        }
        else
        {
            System.out.println("------------------------");
            System.out.println("Not enough Sword");
            System.out.println("------------------------");
        }
    }

    @Override
    public void useArmornovic()
    {
        int totalArmor = bag.getArmor();

        if(totalArmor >0)
        {
            for (Item item : bag.items){
                if(item.NameItem.equals("Armor")){
                    novicofarmor = novicofarmor + item.value;
                    bag.useArmor();
                    break;
                }
            }
        }
        else
        {
            System.out.println("------------------------");
            System.out.println("Not enough Armor");
            System.out.println("------------------------");
        }
    }

    @Override
    public void useMananovic()
    {
        int totalMana = bag.getBloodyRing();

        if(totalMana >0)
        {
            for (Item item : bag.items){
                if(item.NameItem.equals("BloodyRing")){
                    Mana = Mana + item.value;
                    bag.useBloodyRing();
                    break;
                }
            }
        }
        else
        {
            System.out.println("------------------------");
            System.out.println("Not enough BloodyRing");
            System.out.println("------------------------");
        }
    }
}

