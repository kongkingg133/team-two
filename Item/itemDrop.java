package Item;

import java.util.Arrays;

public class itemDrop extends item{




    @Override
    public void itemList(){
       item_F[] itemList = new item_F[3];
       itemList[0] = new item_F(1, "Warrior", "LongSword", 50);
        

 

        for(int i = 0; i<itemList.length; i++){
            System.out.println(Arrays.toString(itemList));
        }




    }


    public static void main(String[] args){
        itemDrop itemdrop = new itemDrop();
        itemdrop.itemList();
    }
    
}
