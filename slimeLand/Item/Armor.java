package slimeLand.Item;

public class Armor extends item{
    private int def;

    public Armor(String name, int price , int def){
        super(name, price);
        this.def = def;
    }
    public int getdef() {
        return def;

    }
    public void setdef(int def) {
        this.def = def; 
    }
}
