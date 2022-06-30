package slimeLand;
import slimeLand.Item.Armor;
import slimeLand.Item.HpPotion;
import slimeLand.Item.MpPotion;
import slimeLand.Item.Weapon;

import java.util.ArrayList;

public class Shop {
    
    private ArrayList<HpPotion> hpPotions;
	private ArrayList<MpPotion> mpPotions;

    public Shop(ArrayList<HpPotion> hpPotions, ArrayList<MpPotion> mpPotions) {
	    this.hpPotions = hpPotions;
		this.mpPotions = mpPotions;
	}
    public ArrayList<HpPotion> getHpPotions() {
		return hpPotions;
	}

	public void setHpPotions(ArrayList<HpPotion> hpPotions) {
		this.hpPotions = hpPotions;
	}

	public ArrayList<MpPotion> getMpPotions() {
		return mpPotions;
	}

	public void setMpPotions(ArrayList<MpPotion> mpPotions) {
		this.mpPotions = mpPotions;
	}

    public void Shopmenu(ArrayList<HpPotion> hpPotions ,ArrayList <MpPotion> mpPotions) {

    }
}
	
