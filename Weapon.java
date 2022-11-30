

public class Weapon {
    
        private String weaponType;
	
	public String[] weaponChoices = {"Rock", "Paper", "Scissors", "Saw"};
	
	Weapon(int type){
		this.weaponType = weaponChoices[type];
	}
	
	
	public void setWeaponType(int choice) {
		this.weaponType = weaponChoices[choice];
	}
	
	public String getWeaponType() {
		return this.weaponType;
	}
	
		
}

