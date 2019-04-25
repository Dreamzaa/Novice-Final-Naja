package Game;


public class NOVICS {
    protected int Exp;
    protected int Level;
    protected int Hp;
    protected int Mana;
    protected int novicofattack;
    protected int novicofarmor;
    public int killmons;
    private String name;
    public Monster listMonster = new Monster();
    public Bag bag = new Bag();

    public NOVICS(String name) {
        this.name = name;
        Exp = 0;
        Hp = 1500;
        Mana = 500;
        Level = 1;
        novicofattack = 200;
        novicofarmor = 200;
    }

    public String getName() {
        return name;
    }

    public void foundMonster() {
        listMonster.RandMonsters();
    }

    public void novicAttackmonster() {
        listMonster.Hpmonster -= novicofattack;
        Armordestroyed();
        getExp();
        getLevel();
        increseHp();
    }

    public void fightmonster() {
        Hp = Hp - (10 * Level);
        Exp = Exp + (40 * Level);
        killmons = killmons + 1;
        if (Exp >= 100) {
            Level = Level + 1;
            Exp = 0;
            Hp = Hp + 50;
            Mana = Mana + 60;
            novicofattack += 100;
            novicofarmor += 80;
        }
    }

    public int getKillmons() {
        return killmons;
    }

    public void getExp() {
        if (listMonster.Hpmonster <= 0) {
            Exp = Exp + 200;
            bag.putItemIntoBag();
        }
    }

    public void getLevel() {
        if (Exp >= 150) {
            Level++;
            novicofattack += 20;
            novicofarmor += 20;
            Mana += 20;
            Exp = 0;
        }
    }

    public void increseHp() {
        if (Level >= 1 && Exp == 0) {
            Hp = Hp + 100;
        }
    }

    public void Armordestroyed() {
        novicofarmor = novicofarmor - listMonster.Attackmonster;
        if (novicofarmor <= 0) {
            Hp = Hp - listMonster.Attackmonster;
            novicofarmor = 0;
        }
    }

    public void showHpNovic() {
        if (Hp > 0) {
            System.out.println("My Novic Hp has: " + Hp);
        } else {
            System.out.println("Novic is died");
            System.out.println("End the Game");
            System.out.println("See you Again ^_^");
        }
    }

    public void showExpNovic() {
        System.out.println("My Novic Exp has: " + Exp);
    }

    public void showLevelNovic() {
        System.out.println("My Novic Level has: " + Level);
    }

    public void haveexpAndslotinbag() {
        bag.putexpplusIntobag();
        bag.putslotplusIntobag();
    }

    public void fightstatusofnovic() {
        System.out.println("My Novic Attack has: " + novicofattack);
        System.out.println("My Novic Armor has: " + novicofarmor);
        System.out.println("My Novic Mana has: " + Mana);
    }

    public void showhpnovicandmonster() {

        System.out.println("-------Novic------------");
        showHpNovic();
        showExpNovic();
        showLevelNovic();
        fightstatusofnovic();
        System.out.println("------------------------");
        System.out.println("Monster name : " + listMonster.Namemonster);
        System.out.println(listMonster.Namemonster + " hp has : " + listMonster.hpofMonster());
        System.out.println(listMonster.Namemonster + " attack has : " + listMonster.Attackmonster);
        System.out.println("------------------------");
        if (listMonster.hpofMonster() == 0) {
            System.out.println("Monster Name : " + listMonster.Namemonster);
            System.out.println("It died so,You Win");
            System.out.println("------------------------");
        }
    }

    public int gethpnovic() {
        return Hp;
    }

    public int getLvnovic() {
        return Level;
    }

    public int getMananovic() {
        return Mana;
    }

    public int getNovicofattack() {
        return novicofattack;
    }

    public int getNovicofarmor()
    {
        return novicofarmor;
    }

    public void sethpnovic(int hp) {
        Hp = hp;
    }

    public void usePotionnovic() {
        int totalPotion = bag.getPotion();

        if (totalPotion > 0) {
            for (Item item : bag.items) {
                if (item.NameItem.equals("Potion")) {
                    Hp = Hp + item.value;
                    bag.usePotion();
                    break;
                }
            }
        } else {
            System.out.println("------------------------");
            System.out.println("Not enough Potion");
            System.out.println("------------------------");
        }
    }

    public void useSwordnovic() {
        int totalSword = bag.getSword();

        if (totalSword > 0) {
            for (Item item : bag.items) {
                if (item.NameItem.equals("Sword")) {
                    novicofattack = novicofattack + item.value;
                    bag.useSword();
                    break;
                }
            }
        } else {
            System.out.println("------------------------");
            System.out.println("Not enough Sword");
            System.out.println("------------------------");
        }
    }

    public void useArmornovic() {
        int totalArmor = bag.getArmor();

        if (totalArmor > 0) {
            for (Item item : bag.items) {
                if (item.NameItem.equals("Armor")) {
                    novicofarmor = novicofarmor + item.value;
                    bag.useArmor();
                    break;
                }
            }
        } else {
            System.out.println("------------------------");
            System.out.println("Not enough Armor");
            System.out.println("------------------------");
        }
    }

    public void useMananovic() {
        int totalMana = bag.getBloodyRing();

        if (totalMana > 0) {
            for (Item item : bag.items) {
                if (item.NameItem.equals("BloodyRing")) {
                    Mana = Mana + item.value;
                    bag.useBloodyRing();
                    break;
                }
            }
        } else {
            System.out.println("------------------------");
            System.out.println("Not enough BloodyRing");
            System.out.println("------------------------");
        }
    }
}

