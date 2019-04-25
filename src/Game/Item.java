package Game;


public class Item
{
    String NameItem;
    int value;

    public Item()
    {
        value = 0;
        NameItem = "";
    }
    public void initialItem(int indexofitem)
    {
        if(indexofitem == 0)
        {
            NameItem = "Sword";
            value = 150;
        }
        else if(indexofitem == 1)
        {
            NameItem = "Armor";
            value = 100;
        }
        else if(indexofitem == 2)
        {
            NameItem = "Potion";
            value = 200;
        }
        else if(indexofitem == 3)
        {
            NameItem = "BloodyRing";
            value = 200;
        }
    }
}
