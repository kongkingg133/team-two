package Monster;

import java.util.ArrayList;

import java.util.ArrayList;

public class birdM extends Monster{

    public birdM(String name, int hp, int mp, int hit, int amor){
        super(name, hp, mp, amor);
        this.hp = hp*20;
    }


      //몬스터 상태창 
      @Override
      public void showInfo(){
        System.out.println("_______" + this.name + "_______");
        System.out.println("HP : "  + this.hp);
        System.out.println("MP : "  + this.mp);
        System.out.println("AMOR : "  + this.amor);

    }

    
    @Override
    public void dmg(int dmg) {
        int am_dm = this.amor - dmg;
        if(amor > dmg){
            System.out.println(this.name + "은 " + "miss");
        }else if (dmg > amor){
            this.hp = this.hp - Math.abs(am_dm);
            System.out.println(this.name + "은 " + Math.abs(am_dm) + "의 공격을 받았습니다.");
        }
    }


    @Override
    public int att() {
        double random = Math.random();
        int intValue = (int) (random * 101) + 50;
        if (intValue > 60) {
            System.out.println(intValue + "공격에 성공했습니다.");
        } else {
            System.out.println("공격에 실패했습니다.");
            intValue = 0;
        }

        return intValue;
    }

    @Override
    public void create(){
        ArrayList<String> name_B = new ArrayList<>();
        name_B.add("노란 새");
        name_B.add("빨간 새");
        name_B.add("파랑 새");
        name_B.add("초록 새");
        name_B.add("검은 새");
        int index_B = (int)(Math.random() * (name_B.size()-1));

    }
    
    
}
