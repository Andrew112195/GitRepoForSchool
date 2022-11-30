

public class Weapon {
	
	Weapon(int type){
		this.weaponType = weaponChoices[type];
	}
	private String weaponType;
	
	public String[] weaponChoices = {"Rock", "Paper", "Scissors", "Saw"};
	

	public void setWeaponType(int choice) {
		this.weaponType = weaponChoices[choice];
	}
	
	public String getWeaponType() {
		return this.weaponType;
	}
	
		
}

