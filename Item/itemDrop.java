package Item;

public class itemDrop extends item{






    public itemDrop(String classT, String name, int dmgs) {
        this.classT = classT;
        this.name = name;
        this.dmgs = dmgs;


    }

    public void Drop_W(){
        itemDrop[] itemList = new itemDrop[3];
        itemList[0] = new itemDrop("Warrior", "LongSword", 50);
        itemList[1] = new itemDrop("mage", "Wand", 50);

        for(int i = 0; i < itemList.length; i++){
            System.out.println(itemList[0]);
            System.out.println(itemList[1]);
        }


    }

    public static void maint(String[] args){
        item items = new item();

        items.showItemInfo();
    }




    
}
