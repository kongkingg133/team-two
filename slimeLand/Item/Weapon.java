package slimeLand.Item;

public class Weapon extends item{
    public String name; 
    public int str;
    public int durablity;
    
     
  
    public Weapon(String name , int price, int durablity ,int str){
        super(name, price);
        this.str = str;
        this.durablity = durablity;
    }
    public int getStr() {
        return str;

    }
    public void setStr(int str) {
        this.str= str;
    } 
    
    public void Equip(){
        System.out.println("무기" + this.name + "을 장착합니다");
    
    }
    public void EquipChange(){
        System.out.println(this.name + "으로 교체 되었습니다.");
    }
    public void durablity(){
           durablity = durablity - 10;
    }


}
