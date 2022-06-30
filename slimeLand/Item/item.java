package slimeLand.Item;


public class item {
    
    public String name;    //이름
    public int hp;         //체력
    public int mp;         //마나
    public int max_hp;      //최대 hp
    public int max_mp;      //최대 mp
    public int str; // 힘(힘증가시 데미지 증가)
    public int def; //방어력
    protected int price;


 
    public item(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
