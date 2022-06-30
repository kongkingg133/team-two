package Monster;

import java.util.ArrayList;


public class gorillaM extends Monster {

    public gorillaM(String name, int hp, int mp, int hit, int amor) {
        super(name, hp, mp, amor);
        this.hp = hp * 30;
    }

    // 몬스터 상태창
    @Override
    public void showInfo() {
        System.out.println("_______" + this.name + "_______");
        System.out.println("HP : " + this.hp);
        System.out.println("MP : " + this.mp);
        System.out.println("AMOR : " + this.amor);

    }

    @Override
    public void dmg(int dmg) {
        int am_dm = this.amor - dmg;
        if (amor > dmg) {
            System.out.println(this.name + "은 " + "miss");
        } else if (dmg > amor) {
            this.hp = this.hp - Math.abs(am_dm);
            System.out.println(this.name + "은 " + Math.abs(am_dm) + "의 공격을 받았습니다.");
        }
    }

    @Override
    public int att() {
        double random = Math.random();
        int intValue = (int) (random * 201) + 100;
        if (intValue > 120) {
            System.out.println(intValue + "공격에 성공했습니다.");
        } else {
            System.out.println("공격에 실패했습니다.");
            intValue = 0;
        }

        return intValue;
    }

    @Override
    public void create(){
 
        ArrayList<String> name_G = new ArrayList<>();
        name_G.add("노란 고릴라");
        name_G.add("빨간 고릴라");
        name_G.add("파랑 고릴라");
        name_G.add("초록 고릴라");
        name_G.add("검은 고릴라");
        int index_G = (int)(Math.random() * (name_G.size()-1));

    }
    

}
