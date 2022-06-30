package slimeLand.Character;

import java.util.Random;

import slimeLand.Item.item;

public class monster {
    //필드값 (슬라임의 hp, mp...)

    public String name;
    public int hp;
    public int mp;
    public static item[] items;  //보유아이템
    public static Object item;
    
    
    //생성값 (슬라임 클래스를 인스턴스로 만들 때 매개변수로 받아서 객체 만들기)
    public monster() {
        this.name = "평범한 슬라임";
        this.hp = 10;
        this.mp = 0;
        
      
    }
    public monster(String input_name, int input_hp, int input_mp ) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
        monster.items = new item[5];
    }
    public void monsteritem(){

    }

    public void dmg(int dmg) {
        this.hp = this.hp - dmg;
        System.out.println(this.name + "은(는) " + dmg + " 공격을 받았습니다.");
    }

    public int att() {
        Random attack = new Random();
        int a = attack.nextInt(30);
        System.out.println("-------------------!!!MonsterAttack!!!-----------------");
        System.out.println(this.name + "은(는) " + a + " 공격을 했습니다!");
        return a;
    }

    public void info() {
        System.out.println("___________________" + name + "____________________");
        System.out.println("hp = " + hp);
        System.out.println("mp = " + mp);
    }

    public void death() {
        System.out.println(this.name + "는(은) 쓰러졌다!");
    }
        item itemDrop(item item2){
        return items[(int)(Math.random() * items.length)];
    }

    
}