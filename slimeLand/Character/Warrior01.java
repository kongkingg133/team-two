package slimeLand.Character;


import slimeLand.Item.item;

public class Warrior01 extends Character {
    
  
    public Warrior01(String name, int hp, int mp, int input_level, int input_exp){
        this.name = name;
        this.maxhp = hp;
        this.maxmp = mp;
        this.hp = this.maxhp;
	    this.mp = this.maxmp;
        this.level= 1; 
        this.exp = 0;
        this.money = 200;
        this.items = new item[5];
        this.eitems = new item[5];
    }
   
    
    //캐릭터정보//
    public void info(){
        System.out.println("---------------------" + name + "----------------------");
        System.out.println("직업 =" + this.name);
        System.out.println("레벨 =" + level + "(" + exp + "/100)");
        System.out.println("HP = "+ this.hp);
        System.out.println("MP = "+ this.mp);
     
         for(int i = 0; i <eitems.length;i++){
            if(eitems[i] != null){
                System.out.println(eitems[i]);
            }
            else if(eitems[i] == null) { 
                System.out.println("획득한 아이템이 없습니다.");
            }
        }
        System.out.println("-----------------------------------------------");
    
    }
    public void inventory(){
        System.out.println("---------------아이템---------------");
        for(int i = 0; i <items.length;i++){
            if(items[i] != null){
                System.out.println(items[i]);
                break;
            }
            else if(items[i] == null) {
                System.out.println("획득한 아이템이 없습니다.");
                
            }
        }
        System.out.println("--------------------------------------");
    }
    //경험치 획득,레벨업//
    public void getExp(int exp) {
        System.out.println(exp + "의 경험치를 획득하였습니다.");
	    this.exp += exp;
	    while(100 <= this.exp){
		levelUp();
		this.exp -= 100;
       }
    }
    public void levelUp(){
	level++;
	maxhp += 10;
	maxmp += 5;
	hp = maxhp;
	mp = maxmp;
	System.out.println("LEVEL UP!!");
    info();
    }
    //아이템 획득//
    public void getitem(item item){
       for(int i = 0; i < items.length; i++){
            if(items[i] == null){
                System.out.println(item.name + "을 획득하였습니다.");
                items[i] = item;
            break;   
            }
        }
      
        
    }
    public void getPotion(item item) {
        
        for(int i = 0; i < items.length; i++){
             if(items[i] != null) {
                System.out.println("장착할 장비가 없습니다");
                eitems[i] = items[i]; 
                System.out.println(item.name);
                items[i] = null;
                System.out.println(item.name + "장착 하였습니다.");
                System.out.println(eitems[i].name);
                break; 
            } 
             else if(items[i] == null) {
                System.out.println("장착할 장비가 없습니다");
                break;
             }       
        }
        hp += item.hp;
        hp += item.mp;
     }
    public void getEquip(item item) {
        
        for(int i = 0; i < items.length; i++){
             if(items[i] != null) {
                System.out.println("장착할 장비가 없습니다");
                eitems[i] = items[i]; 
                System.out.println(item.name);
                items[i] = null;
                System.out.println(item.name + "장착 하였습니다.");
                System.out.println(eitems[i].name);
                break; 
            } 
             else if(items[i] == null) {
                System.out.println("장착할 장비가 없습니다");
                break;
             }       
        }
        hp += item.hp;
        hp += item.mp;
     }
     public void EquipStaus() {
        System.out.print(eitems);
     }
  
//공격 스킬 
    
   

    public void dmg(int input_dmg){
        this.hp = this.hp - input_dmg;
        System.out.println(this.name + "은 " + input_dmg + " 공격을 받았습니다");
    }

    public int BasicAttack() {
        System.out.println("-------------------!!!WarriorAttack!!!------------------");
        System.out.println(this.name + " 은 " +10+ " 공격을 했습니다!");
        return 10;
    }

    public int Slash(){
    double RandomAttack = Math.random();
    int SkillAttack = (int)(RandomAttack * 60) + 30;
    System.out.println(this.name +"은 슬래쉬을 사용해 " + SkillAttack + " 공격 했습니다!");
   
    return SkillAttack;
}
   
         
}

    

    
