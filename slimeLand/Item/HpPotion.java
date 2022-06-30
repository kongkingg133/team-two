package slimeLand.Item;

public class HpPotion extends item{
    private double hp;
    public HpPotion(String name, int price,int hp) {
        super(name, price);
        this.hp = hp;
        //TODO Auto-generated constructor stub
    }
    
        public double getHp() {
            return hp;
        }
    
        public void setHp(double hp) {
            this.hp = hp;
        }
    }
