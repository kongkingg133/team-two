package slimeLand.Item;

public class MpPotion extends item{
    private int hp;
    
    public MpPotion(String name, int price,int hp) {
        super(name, price);
        this.hp = hp;
        //TODO Auto-generated constructor stub
    }

   public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}