package Item;

public class item {
    public int no;
    public String name;
    public int dmgs;
    public String classT;

    public item() {

    }

    public item(int no, String name, int dmgs, String classT) {
        this.no = no;
        this.name = name;
        this.dmgs = dmgs;
        this.classT = classT;

    }

    public int hit(){

        return 0;
    }

    public void showItemInfo() {
        System.out.println("무기 타입 : " + this.classT);
        System.out.println("이름 : " + this.name);
        System.out.println("공격력 : " + this.dmgs);

    }

}
