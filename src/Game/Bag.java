package Game;

import java.util.*;
public class Bag
{
    public int slotUse;
    public int fullslot;
    public ArrayList<Item> items = new ArrayList<Item>();
    public Item dare = new Item();
    public Expplus gate = new Expplus();
    public Slotplus face = new Slotplus();
    public Bag()
    {
        slotUse = 0;
        fullslot = 50;
    }

    public void putItemIntoBag()
    {
        int randomIndexOfItem = (int)(Math.random()*4);
        Item dropItem = new Item();
        dropItem.initialItem(randomIndexOfItem);
        if(slotUse < fullslot)
        {
            items.add(dropItem);
            slotUse++;
        }
        else
        {
            System.out.println("You Bag is Full ,You can't add item");
        }
    }

    public int getPotion()
    {
        int potion = 0;
        for(Item i : items)
        {
            if(i.NameItem.equals("Potion"))
            {potion++;}
        }
        return potion;
    }

    public int getSword()
    {
        int sword = 0;
        for(Item i : items)
        {
            if(i.NameItem.equals("Sword"))
            {sword++;}
        }
        return sword;
    }

    public int getArmor()
    {
        int armor = 0;
        for(Item i : items)
        {
            if(i.NameItem.equals("Armor"))
            {
                armor++;}
        }
        return armor;
    }

    public int getBloodyRing()
    {
        int bloodyring = 0;
        for(Item i : items)
        {
            if(i.NameItem.equals("BloodyRing"))
            {bloodyring++;}

        }

        return bloodyring;
    }

    public void usePotion()
    {
        int indexOfPotionUsed;

        for(int i = 0; i < items.size(); i++)
        {
            indexOfPotionUsed = items.get(i).NameItem.indexOf("Potion");
            if(items.get(i).NameItem.equals("Potion"))
            {
                items.remove(indexOfPotionUsed);
                break;
            }
        }
        slotUse--;
    }

    public void useSword()
    {
        int indexOfSwordUsed;

        for(int i = 0; i < items.size(); i++)
        {
            indexOfSwordUsed = items.get(i).NameItem.indexOf("Sword");
            if(items.get(i).NameItem.equals("Sword"))
            {
                items.remove(indexOfSwordUsed);
                break;
            }
        }
        slotUse--;
    }

    public void useArmor()
    {
        int indexOfArmorUsed;

        for(int i = 0; i < items.size(); i++)
        {
            indexOfArmorUsed = items.get(i).NameItem.indexOf("Armor");
            if(items.get(i).NameItem.equals("Armor"))
            {
                items.remove(indexOfArmorUsed);
                break;
            }
        }
        slotUse--;
    }

    public void useBloodyRing()
    {
        int indexOfBloodyRingUsed;

        for(int i = 0; i < items.size(); i++)
        {
            indexOfBloodyRingUsed = items.get(i).NameItem.indexOf("BloodyRing");
            if(items.get(i).NameItem.equals("BloodyRing"))
            {
                items.remove(indexOfBloodyRingUsed);
                break;
            }
        }
        slotUse--;
    }

    public void putexpplusIntobag()
    {
        if(slotUse<fullslot)
        {
            items.add(gate);
            slotUse ++;
            System.out.println("" + gate.expplus);
            System.out.println("Total your Exppotion : " + gate.valueexpplus);
        }
        else
        {
            System.out.println("You Bag is Full ,You can't add item");
        }
    }

    public void putslotplusIntobag()
    {
        if(slotUse<fullslot)
        {
            items.add(face);
            slotUse ++;
            System.out.println("" + face.slotplus);
            System.out.println("Total your Slotpotion : " + face.valueofslotplus);
        }
        else
        {
            System.out.println("You Bag is Full ,You can't add item");
        }
    }
}