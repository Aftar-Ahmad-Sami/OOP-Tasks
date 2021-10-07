
public class Smartphone {
	int battery_life, ram;
	String chipset;

	Smartphone() {
		battery_life = 5000;
		ram = 8;
		chipset = "MediaTek MT6833 Dimensity 700 5G (7 nm)";
	}

	Smartphone(int battery_life, int ram, String chipset) {
		this.battery_life = battery_life;
		this.ram = ram;
		this.chipset = chipset;
	}
}


