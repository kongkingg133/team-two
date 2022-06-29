package Item;

public class LongSword extends item{

    LongSword(){
        this.classT = "Warrior";
        this.name = "LongSword";
        this.dmgs = 50;
    }
    @Override
    public void showItemInfo() {
        System.out.println("무기 타입 : " + this.classT);
        System.out.println("이름 : " + this.name);
        System.out.println("공격력 : " + this.dmgs);

    }

       @Override
    public int hit() {
        double r = Math.random();
        int dmg = (int) (r * 20) + 1;
        if (dmg > 1) {
            System.out.println(dmg + "공격에 성공했습니다.");
        } else {
            System.out.println("공격에 실패했습니다.");
            dmg = 0;
        }
        return dmg;
    }




    
}
