package Game;



public class Wizard extends NOVICS
{

    String[] Skill = {"StormGust","FrostNova","JupitelThunder","LordofVermillion"};
    int Hp;
    int Mana;
    int Exp;
    int Level;
    int novicofattack;
    int novicofarmor;
    String mycareer;
    String skillname;
    int valuedamageSkill;
    int manaUsed;

    public Wizard()
    {
        super("Wizard");
        Hp = 1200;
        Mana = 800;
        Exp = 0;
        Level = 10;
        novicofattack = 650;
        novicofarmor = 300;
        mycareer = "Wizard";
        skillname = "";
        valuedamageSkill = 0;
        manaUsed = 0;
    }

    public void useWizardskill(int indexofskill)
    {

        if(indexofskill == 0)
        {
            skillname = Skill[indexofskill];
            manaUsed = 50;
            valuedamageSkill = 150;
            listMonster.Hpmonster -= valuedamageSkill;
            Mana -= manaUsed;
        }

        else if(indexofskill == 1)
        {
            skillname = Skill[indexofskill];
            manaUsed = 100;
            valuedamageSkill = 200;
            listMonster.Hpmonster -= valuedamageSkill;
            Mana -= manaUsed;
        }

        else if(indexofskill == 2)
        {
            skillname = Skill[indexofskill];
            manaUsed = 150;
            valuedamageSkill = 250;
            listMonster.Hpmonster -= valuedamageSkill;
            Mana -= manaUsed;
        }

        else if(indexofskill == 3)
        {
            skillname = Skill[indexofskill];
            manaUsed = 200;
            valuedamageSkill = 350;
            listMonster.Hpmonster -= valuedamageSkill;
            Mana -= manaUsed;
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

    public String getMycareer() {
        return mycareer;
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

    public int hpofwizard()
    {
        if(Hp <= 0)
        {
            int hpofwizard = 0;
            return hpofwizard;
        }
        return Hp;
    }
}

