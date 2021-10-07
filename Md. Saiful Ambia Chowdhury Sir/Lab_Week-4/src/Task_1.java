
public class Task_1 {

	public static void main(String[] args) {
		System.out.println("\t\t--Experimental Phone: Oppo A93s 5G--\n");

		// -----------------------1st Phone------------------------//

		Smartphone mobilePhone1 = new Smartphone(); /// Default Values to Each Three Attributes
		System.out.println("*1st Phone: Default Values*");
		System.out.println("Battery Life: " + mobilePhone1.battery_life + " mAh");
		System.out.println("RAM: " + mobilePhone1.ram + "GB");
		System.out.println("Chipset: " + mobilePhone1.chipset);

		// -----------------------2nd Phone------------------------//

		Smartphone mobilePhone2 = new Smartphone(4000, 4, "Qualcomm SM6115 Snapdragon 662 (11 nm)");
		System.out.println("\n\n*2nd Phone: Customized Values 1*");
		System.out.println("Battery Life: " + mobilePhone2.battery_life + " mAh");
		System.out.println("RAM: " + mobilePhone2.ram + "GB");
		System.out.println("Chipset: " + mobilePhone2.chipset);

		// -----------------------3rd Phone------------------------//

		Smartphone mobilePhone3 = new Smartphone(5500, 6, "Spreadtrum SC7731");
		System.out.println("\n\n*3rd Phone: Customized Values 2*");
		System.out.println("Battery Life: " + mobilePhone3.battery_life + " mAh");
		System.out.println("RAM: " + mobilePhone3.ram + "GB");
		System.out.println("Chipset: " + mobilePhone3.chipset);
	}
}


