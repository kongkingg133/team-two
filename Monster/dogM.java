package Monster;

import java.util.ArrayList;

public class dogM extends Monster{

    public dogM(String name, int hp, int mp, int hit, int amor){
        super(name, hp, mp, amor);
        this.hp = hp*10;
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
    public void dmg(int dmg){
        int am_dm = this.amor - dmg;
        if(amor > dmg){
            
            System.out.println(this.name + "은 " + "miss");
        }else if (dmg > amor){
            this.hp = this.hp - Math.abs(am_dm);
            System.out.println(this.name + "은 " + Math.abs(am_dm) + "의 공격을 받았습니다.");
        }
    }

    @Override
    public int att(){
      double random = Math.random();
                            //(이게 랜덤 공격 * 숫자 = 데미지는 늘려주지 최대, 최소값 바뀜) + 0 (최소값)
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
    public void create() {
        ArrayList<String> name_D = new ArrayList<>();
        name_D.add("노란 개");
        name_D.add("빨간 개");
        name_D.add("파랑 개");
        name_D.add("초록 개");
        name_D.add("검은 개");

        int index_D = (int)(Math.random() * (name_D.size()-1));


    }

    
}
