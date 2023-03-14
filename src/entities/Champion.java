package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.attack = damage;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void takeDamage(Champion other) {
		if (this.armor > other.attack) {
			this.life -= 1;
		} else {
			int damage = other.attack - armor;
			this.life -= damage;
			if (this.life < 0) {
				this.life = 0;
			}

		}
	}

	public String Status() {
		if (getLife() == 0) {
			return getName() + ": " + getLife() + " " + "de vida (morreu)";
		} else {
			return getName() + ": " + getLife() + " " + "de vida";
		}

	}

}
