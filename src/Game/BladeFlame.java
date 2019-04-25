package Game;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BladeFlame
{

//    public static void main(String[] args)
//    {
//        NOVICS novice1 = new NOVICS();
//        Scanner sc = new Scanner(System.in);
//        novice1.showHpNovic();
//        novice1.showExpNovic();
//        novice1.showLevelNovic();
//        novice1.fightstatusofnovic();
//        novice1.haveexpAndslotinbag();
//        while(novice1.getLvnovic() < 10)
//        {
//            if(novice1.gethpnovic() <=0)
//            {
//                break;
//            }
//            novice1.foundMonster();
//            while(novice1.listMonster.Hpmonster > 0)
//            {
//                if(novice1.listMonster.Hpmonster <=0)
//                {
//                    break;
//                }
//                novice1.novicAttackmonster();
//                novice1.showhpnovicandmonster();
//                if(novice1.gethpnovic() <=0)
//                {
//                    break;
//                }
//                System.out.println("-----What do you want to do------");
//                System.out.println("Used Any items please insert 1");
//                System.out.println("Show items into bag please insert 2");
//                System.out.println("Discard plese insert eachNumber");
//                System.out.println("------------------------------------");
//                int scan = sc.nextInt();
//                switch(scan)
//                {
//                    case 1:
//                        System.out.println("------------------------------------");
//                        System.out.println("insert1 if you want used Sword");
//                        System.out.println("insert2 if you want used Armor");
//                        System.out.println("insert3 if you want used Potion");
//                        System.out.println("insert4 if you want used BloodyRing");
//                        System.out.println("------------------------------------");
//                        int asd = sc.nextInt();
//                        switch(asd)
//                        {
//                            case 1:
//                                novice1.useSwordnovic();
//                                break;
//                            case 2:
//                                novice1.useArmornovic();
//                                break;
//                            case 3:
//                                novice1.usePotionnovic();
//                                break;
//                            case 4:
//                                novice1.useMananovic();
//                                break;
//                            default:
//                                System.out.println("--------------------");
//                                System.out.println("You don't use items");
//                                System.out.println("--------------------");
//                        }
//                        break;
//                    case 2:
//                        if(novice1.bag.slotUse > 0)
//                        {
//                            System.out.println("Insert your item watch: ");
//                            System.out.println("-------------------------");
//                            System.out.println("Insert 1 is Sword");
//                            System.out.println("Insert 2 is Armor");
//                            System.out.println("Insert 3 is Potion");
//                            System.out.println("Insert 4 is BloodyRing");
//                            System.out.println("Insert eachNumber will exit!");
//                            System.out.println("-------------------------");
//
//                            int showItem = sc.nextInt();
//                            switch(showItem)
//                            {
//                                case 1:
//                                    System.out.println("------------------------");
//                                    System.out.println("Total Your Sword is : " + novice1.bag.getSword());
//                                    System.out.println("Slot remain : "+ (novice1.bag.fullslot-novice1.bag.slotUse));
//                                    System.out.println("------------------------");
//                                    break;
//                                case 2:
//                                    System.out.println("------------------------");
//                                    System.out.println("Total Your Armor is : " + novice1.bag.getArmor());
//                                    System.out.println("Slot remain : "+ (novice1.bag.fullslot-novice1.bag.slotUse));
//                                    System.out.println("------------------------");
//                                    break;
//                                case 3:
//                                    System.out.println("------------------------");
//                                    System.out.println("Total Your Potion is : " + novice1.bag.getPotion());
//                                    System.out.println("Slot remain : "+ (novice1.bag.fullslot-novice1.bag.slotUse));
//                                    System.out.println("------------------------");
//                                    break;
//                                case 4:
//                                    System.out.println("------------------------");
//                                    System.out.println("Total Your BloodyRing is : " + novice1.bag.getBloodyRing());
//                                    System.out.println("Slot remain : "+ (novice1.bag.fullslot-novice1.bag.slotUse));
//                                    System.out.println("------------------------");
//                                    break;
//                                default:
//                            }
//                        }
//                        break;
//                    default:
//                }
//            }
//        }
//        if(novice1.getLvnovic() == 10 && novice1.gethpnovic() > 0)
//        {
//            System.out.println("------------------------------------------------------");
//            System.out.println("Do you want select career ?");
//            System.out.println("------------------------------------------------------");
//            System.out.println("Insert 1 if you want select career");
//            System.out.println("Insert 2 or eachNumber if you don't want select career");
//            System.out.println("------------------------------------------------------");
//            int career = sc.nextInt();
//            switch(career)
//            {
//                case 1:
//                    System.out.println("You want select career Berserk or Wizard");
//                    System.out.println("------------------------------------------");
//                    System.out.println("Insert 1 if you want select career Berserk");
//                    System.out.println("Insert 2 if you want select career Wizard");
//                    System.out.println("-----------------------------------------");
//                    int select = sc.nextInt();
//                    switch(select)
//                    {
//                        case 1:
//                            Berserk berserk = new Berserk();
//                            System.out.println("------------------------------------------------------------");
//                            System.out.println("You select career Berserk");
//                            System.out.println("------------------------------------------------------------");
//                            System.out.println("Do you want fight with Monster ?");
//                            System.out.println("------------------------------------------------------------");
//                            System.out.println("Plese insert 1 if you want fight with monster");
//                            System.out.println("Plese insert eachNumber if you don't want fight with monster");
//                            System.out.println("------------------------------------------------------------");
//                            int a = sc.nextInt();
//                            switch(a)
//                            {
//                                case 1:
//                                    System.out.println("------------------------------------");
//                                    System.out.println("Your career is : " + berserk.berserk);
//                                    System.out.println("Your Hp has : " + berserk.Hp);
//                                    System.out.println("Your Mana has : " + berserk.Mana);
//                                    System.out.println("Your Attack has : " + berserk.novicofattack);
//                                    System.out.println("Your Armor has : " + berserk.novicofarmor);
//                                    System.out.println("Your Level has : " + berserk.Level);
//                                    System.out.println("Your Exp has : " + berserk.Exp);
//                                    System.out.println("------------------------------------");
//                                    do
//                                    {    berserk.foundMonster();
//                                        while(berserk.listMonster.Hpmonster > 0)
//                                        {
//                                            if(berserk.Hp <= 0)
//                                            {
//                                                break;
//                                            }
//                                            berserk.listMonster.Hpmonster -= berserk.novicofattack;
//                                            berserk.Armordestroyed();
//                                            if(berserk.listMonster.Hpmonster >0)
//                                            {
//                                                System.out.println("------------------------------------");
//                                                System.out.println("If your want used skill");
//                                                System.out.println("------------------------------------");
//                                                System.out.println("Insert 0 used skill AuraBlade");
//                                                System.out.println("Insert 1 used skill SpiralPierce");
//                                                System.out.println("Insert 2 used skill JusticeBlade");
//                                                System.out.println("Insert 3 used skill BerserkBlade");
//                                                System.out.println("Insert 4 used items in Bag");
//                                                System.out.println("Insert 5 show items in Bag");
//                                                System.out.println("------------------------------------");
//                                                int useskill = sc.nextInt();
//                                                switch(useskill)
//                                                {
//                                                    case 0:
//                                                        berserk.useBerserkskill(useskill);
//                                                        System.out.println("----------------------");
//                                                        System.out.println("Name skill is :" + berserk.skillname);
//                                                        System.out.println("Damage of skill is :" + berserk.valuedamageSkill);
//                                                        System.out.println("----------------------");
//                                                        break;
//                                                    case 1:
//                                                        berserk.useBerserkskill(useskill);
//                                                        System.out.println("----------------------");
//                                                        System.out.println("Name skill is :" + berserk.skillname);
//                                                        System.out.println("Damage of skill is :" + berserk.valuedamageSkill);
//                                                        System.out.println("----------------------");
//                                                        break;
//                                                    case 2:
//                                                        berserk.useBerserkskill(useskill);
//                                                        System.out.println("----------------------");
//                                                        System.out.println("Name skill is :" + berserk.skillname);
//                                                        System.out.println("Damage of skill is :" + berserk.valuedamageSkill);
//                                                        System.out.println("----------------------");
//                                                        break;
//                                                    case 3:
//                                                        berserk.useBerserkskill(useskill);
//                                                        System.out.println("----------------------");
//                                                        System.out.println("Name skill is :" + berserk.skillname);
//                                                        System.out.println("Damage of skill is :" + berserk.valuedamageSkill);
//                                                        System.out.println("----------------------");
//                                                        break;
//                                                    case 4:
//                                                        System.out.println("------------------------------------");
//                                                        System.out.println("insert1 if you want used Sword");
//                                                        System.out.println("insert2 if you want used Armor");
//                                                        System.out.println("insert3 if you want used Potion");
//                                                        System.out.println("insert4 if you want used BloodyRing");
//                                                        System.out.println("------------------------------------");
//                                                        int asdf = sc.nextInt();
//                                                        switch(asdf)
//                                                        {
//                                                            case 1:
//                                                                berserk.useSwordnovic();
//                                                                break;
//                                                            case 2:
//                                                                berserk.useArmornovic();
//                                                                break;
//                                                            case 3:
//                                                                berserk.usePotionnovic();
//                                                                break;
//                                                            case 4:
//                                                                berserk.useMananovic();
//                                                                break;
//                                                            default:
//                                                                System.out.println("--------------------");
//                                                                System.out.println("You don't use items");
//                                                                System.out.println("--------------------");
//                                                        }
//                                                        break;
//                                                    case 5:
//                                                        if(berserk.bag.slotUse > 0)
//                                                        {
//                                                            System.out.println("Insert your item watch: ");
//                                                            System.out.println("-------------------------");
//                                                            System.out.println("Insert 1 is Sword");
//                                                            System.out.println("Insert 2 is Armor");
//                                                            System.out.println("Insert 3 is Potion");
//                                                            System.out.println("Insert 4 is BloodyRing");
//                                                            System.out.println("Insert eachNumber will exit!");
//                                                            System.out.println("-------------------------");
//
//                                                            int f = sc.nextInt();
//                                                            switch(f)
//                                                            {
//                                                                case 1:
//                                                                    System.out.println("------------------------");
//                                                                    System.out.println("Total Your Sword is : " + berserk.bag.getSword());
//                                                                    System.out.println("Slot remain : "+ (berserk.bag.fullslot-berserk.bag.slotUse));
//                                                                    System.out.println("------------------------");
//                                                                    break;
//                                                                case 2:
//                                                                    System.out.println("------------------------");
//                                                                    System.out.println("Total Your Armor is : " + berserk.bag.getArmor());
//                                                                    System.out.println("Slot remain : "+ (berserk.bag.fullslot-berserk.bag.slotUse));
//                                                                    System.out.println("------------------------");
//                                                                    break;
//                                                                case 3:
//                                                                    System.out.println("------------------------");
//                                                                    System.out.println("Total Your Potion is : " + berserk.bag.getPotion());
//                                                                    System.out.println("Slot remain : "+ (berserk.bag.fullslot-berserk.bag.slotUse));
//                                                                    System.out.println("------------------------");
//                                                                    break;
//                                                                case 4:
//                                                                    System.out.println("------------------------");
//                                                                    System.out.println("Total Your BloodyRing is : " + berserk.bag.getBloodyRing());
//                                                                    System.out.println("Slot remain : "+ (berserk.bag.fullslot-berserk.bag.slotUse));
//                                                                    System.out.println("------------------------");
//                                                                    break;
//                                                                default:
//                                                            }
//                                                        }
//                                                        break;
//                                                    default:
//                                                }
//                                            }
//                                            berserk.getExp();
//                                            berserk.getLevel();
//                                            berserk.increseHp();
//                                            System.out.println("------------------------");
//                                            System.out.println("Your career is : " + berserk.berserk);
//                                            System.out.println("Your Hp has : " + berserk.hpofberserk());
//                                            System.out.println("Your Mana has : " + berserk.Mana);
//                                            System.out.println("Your Attack has : " + berserk.novicofattack);
//                                            System.out.println("Your Armor has : " + berserk.novicofarmor);
//                                            System.out.println("Your Level has : " + berserk.Level);
//                                            System.out.println("Your Exp has : " + berserk.Exp);
//                                            System.out.println("------------------------");
//                                            System.out.println("------------------------");
//                                            System.out.println("Monster name : "+ berserk.listMonster.Namemonster);
//                                            System.out.println(berserk.listMonster.Namemonster + " hp has : " + berserk.listMonster.hpofMonster());
//                                            System.out.println(berserk.listMonster.Namemonster + " attack has : " + berserk.listMonster.Attackmonster);
//                                            System.out.println("------------------------");
//                                            if(berserk.listMonster.hpofMonster() == 0)
//                                            {
//                                                System.out.println("-------------------------");
//                                                System.out.println("Monster Name : " + berserk.listMonster.Namemonster);
//                                                System.out.println("It died so,You Win");
//                                                System.out.println("------------------------");
//                                            }
//                                        }
//                                    } while(berserk.hpofberserk() > 0);
//                                    System.out.println("Berserk is died see you again ^_^");
//                                    System.out.println("---------------------------------");
//                                    break;
//                                default:
//                                    System.out.println("------------------------------------");
//                                    System.out.println("Your career is : " + berserk.berserk);
//                                    System.out.println("Your Hp has : " + berserk.hpofberserk());
//                                    System.out.println("Your Mana has : " + berserk.Mana);
//                                    System.out.println("Your Attack has : " + berserk.novicofattack);
//                                    System.out.println("Your Armor has : " + berserk.novicofarmor);
//                                    System.out.println("Your Level has : " + berserk.Level);
//                                    System.out.println("Your Exp has : " + berserk.Exp);
//                                    System.out.println("Berserk has powerful");
//                                    System.out.println("------------------------------------");
//                            }
//                            break;
//                        case 2:
//                            Wizard wizard = new Wizard();
//                            System.out.println("------------------------------------------------------------");
//                            System.out.println("You select career Wizard");
//                            System.out.println("------------------------------------------------------------");
//                            System.out.println("Do you want fight with Monster ?");
//                            System.out.println("------------------------------------------------------------");
//                            System.out.println("Plese insert 1 if you want fight with monster");
//                            System.out.println("Plese insert eachNumber if you don't want fight with monster");
//                            System.out.println("------------------------------------------------------------");
//                            int b = sc.nextInt();
//                            switch(b)
//                            {
//                                case 1:
//                                    System.out.println("------------------------------------");
//                                    System.out.println("Your career is : " + wizard.wizard);
//                                    System.out.println("Your Hp has : " + wizard.hpofwizard());
//                                    System.out.println("Your Mana has : " + wizard.Mana);
//                                    System.out.println("Your Attack has : " + wizard.novicofattack);
//                                    System.out.println("Your Armor has : " + wizard.novicofarmor);
//                                    System.out.println("Your Level has : " + wizard.Level);
//                                    System.out.println("Your Exp has : " + wizard.Exp);
//                                    System.out.println("------------------------------------");
//                                    do
//                                    {    wizard.foundMonster();
//                                        while(wizard.listMonster.Hpmonster > 0)
//                                        {
//                                            if(wizard.listMonster.Hpmonster <=0)
//                                            {
//                                                break;
//                                            }
//                                            wizard.listMonster.Hpmonster -= wizard.novicofattack;
//                                            wizard.Armordestroyed();
//                                            if(wizard.listMonster.Hpmonster >0)
//                                            {
//                                                System.out.println("-----------------------------");
//                                                System.out.println("If your want used skill");
//                                                System.out.println("-----------------------------");
//                                                System.out.println("Insert 0 used skill StormGust");
//                                                System.out.println("Insert 1 used skill FrostNova");
//                                                System.out.println("Insert 2 used skill JupitelThunder");
//                                                System.out.println("Insert 3 used skill LordofVermillion");
//                                                System.out.println("Insert 4 used items in Bag");
//                                                System.out.println("Insert 5 show items in Bag");
//                                                System.out.println("------------------------------------");
//                                                int useskillwizard = sc.nextInt();
//                                                switch(useskillwizard)
//                                                {
//                                                    case 0:
//                                                        wizard.useWizardskill(useskillwizard);
//                                                        System.out.println("----------------------");
//                                                        System.out.println("Name skill is :" + wizard.skillname);
//                                                        System.out.println("Damage of skill is :" + wizard.valuedamageSkill);
//                                                        System.out.println("Manaused of skill is : " + wizard.manaUsed);
//                                                        System.out.println("----------------------");
//                                                        break;
//                                                    case 1:
//                                                        wizard.useWizardskill(useskillwizard);
//                                                        System.out.println("----------------------");
//                                                        System.out.println("Name skill is :" + wizard.skillname);
//                                                        System.out.println("Damage of skill is :" + wizard.valuedamageSkill);
//                                                        System.out.println("Manaused of skill is : " + wizard.manaUsed);
//                                                        System.out.println("----------------------");
//                                                        break;
//                                                    case 2:
//                                                        wizard.useWizardskill(useskillwizard);
//                                                        System.out.println("----------------------");
//                                                        System.out.println("Name skill is :" + wizard.skillname);
//                                                        System.out.println("Damage of skill is :" + wizard.valuedamageSkill);
//                                                        System.out.println("Manaused of skill is : " + wizard.manaUsed);
//                                                        System.out.println("----------------------");
//                                                        break;
//                                                    case 3:
//                                                        wizard.useWizardskill(useskillwizard);
//                                                        System.out.println("----------------------");
//                                                        System.out.println("Name skill is :" + wizard.skillname);
//                                                        System.out.println("Damage of skill is :" + wizard.valuedamageSkill);
//                                                        System.out.println("Manaused of skill is : " + wizard.manaUsed);
//                                                        System.out.println("----------------------");
//                                                        break;
//                                                    case 4:
//                                                        System.out.println("------------------------------------");
//                                                        System.out.println("insert1 if you want used Sword");
//                                                        System.out.println("insert2 if you want used Armor");
//                                                        System.out.println("insert3 if you want used Potion");
//                                                        System.out.println("insert4 if you want used BloodyRing");
//                                                        System.out.println("------------------------------------");
//                                                        int g = sc.nextInt();
//                                                        switch(g)
//                                                        {
//                                                            case 1:
//                                                                wizard.useSwordnovic();
//                                                                break;
//                                                            case 2:
//                                                                wizard.useArmornovic();
//                                                                break;
//                                                            case 3:
//                                                                wizard.usePotionnovic();
//                                                                break;
//                                                            case 4:
//                                                                wizard.useMananovic();
//                                                                break;
//                                                            default:
//                                                                System.out.println("--------------------");
//                                                                System.out.println("You don't use items");
//                                                                System.out.println("--------------------");
//                                                        }
//                                                        break;
//                                                    case 5:
//                                                        if(wizard.bag.slotUse > 0)
//                                                        {
//                                                            System.out.println("Insert your item watch: ");
//                                                            System.out.println("-------------------------");
//                                                            System.out.println("Insert 1 is Sword");
//                                                            System.out.println("Insert 2 is Armor");
//                                                            System.out.println("Insert 3 is Potion");
//                                                            System.out.println("Insert 4 is BloodyRing");
//                                                            System.out.println("Insert eachNumber will exit!");
//                                                            System.out.println("-------------------------");
//
//                                                            int fd = sc.nextInt();
//                                                            switch(fd)
//                                                            {
//                                                                case 1:
//                                                                    System.out.println("------------------------");
//                                                                    System.out.println("Total Your Sword is : " + wizard.bag.getSword());
//                                                                    System.out.println("Slot remain : "+ (wizard.bag.fullslot-wizard.bag.slotUse));
//                                                                    System.out.println("------------------------");
//                                                                    break;
//                                                                case 2:
//                                                                    System.out.println("------------------------");
//                                                                    System.out.println("Total Your Armor is : " + wizard.bag.getArmor());
//                                                                    System.out.println("Slot remain : "+ (wizard.bag.fullslot-wizard.bag.slotUse));
//                                                                    System.out.println("------------------------");
//                                                                    break;
//                                                                case 3:
//                                                                    System.out.println("------------------------");
//                                                                    System.out.println("Total Your Potion is : " + wizard.bag.getPotion());
//                                                                    System.out.println("Slot remain : "+ (wizard.bag.fullslot-wizard.bag.slotUse));
//                                                                    System.out.println("------------------------");
//                                                                    break;
//                                                                case 4:
//                                                                    System.out.println("------------------------");
//                                                                    System.out.println("Total Your BloodyRing is : " + wizard.bag.getBloodyRing());
//                                                                    System.out.println("Slot remain : "+ (wizard.bag.fullslot-wizard.bag.slotUse));
//                                                                    System.out.println("------------------------");
//                                                                    break;
//                                                                default:
//                                                            }
//                                                        }
//                                                        break;
//                                                    default:
//                                                }
//                                            }
//                                            wizard.getExp();
//                                            wizard.getLevel();
//                                            wizard.increseHp();
//                                            System.out.println("------------------------");
//                                            System.out.println("Your career is : " + wizard.wizard);
//                                            System.out.println("Your Hp has : " + wizard.hpofwizard());
//                                            System.out.println("Your Mana has : " + wizard.Mana);
//                                            System.out.println("Your Attack has : " + wizard.novicofattack);
//                                            System.out.println("Your Armor has : " + wizard.novicofarmor);
//                                            System.out.println("Your Level has : " + wizard.Level);
//                                            System.out.println("Your Exp has : " + wizard.Exp);
//                                            System.out.println("------------------------");
//                                            System.out.println("------------------------");
//                                            System.out.println("Monster name : "+ wizard.listMonster.Namemonster);
//                                            System.out.println(wizard.listMonster.Namemonster + " hp has : " + wizard.listMonster.hpofMonster());
//                                            System.out.println(wizard.listMonster.Namemonster + " attack has : " + wizard.listMonster.Attackmonster);
//                                            System.out.println("------------------------");
//                                            if(wizard.listMonster.hpofMonster() == 0)
//                                            {
//                                                System.out.println("Monster Name : " + wizard.listMonster.Namemonster);
//                                                System.out.println("It died so,You Win");
//                                                System.out.println("------------------------");
//                                            }
//                                        }
//                                    } while(wizard.hpofwizard() > 0);
//                                    System.out.println("Wizard is died see you again ^_^");
//                                    System.out.println("--------------------------------");
//                                    break;
//                                default:
//                                    System.out.println("------------------------------------");
//                                    System.out.println("Your career is : " + wizard.wizard);
//                                    System.out.println("Your Hp has : " + wizard.hpofwizard());
//                                    System.out.println("Your Mana has : " + wizard.Mana);
//                                    System.out.println("Your Attack has : " + wizard.novicofattack);
//                                    System.out.println("Your Armor has : " + wizard.novicofarmor);
//                                    System.out.println("Your Level has : " + wizard.Level);
//                                    System.out.println("Your Exp has : " + wizard.Exp);
//                                    System.out.println("Wizard has hugemana");
//                                    System.out.println("------------------------------------");
//                            }
//                    }
//                    break;
//                case 2:
//                    System.out.println("------------------------------------------------------------");
//                    System.out.println("You don't select career");
//                    System.out.println("End the game See your again");
//                    System.out.println("------------------------------------------------------------");
//                    break;
//                default:
//                    System.out.println("------------------------------------------------------------");
//                    System.out.println("You don't select career");
//                    System.out.println("End the game See your again");
//                    System.out.println("------------------------------------------------------------");
//            }
//        }
//    }
}

