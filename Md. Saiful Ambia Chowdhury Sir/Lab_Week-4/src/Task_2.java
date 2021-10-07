
public class Task_2 {

	public static void main(String[] args) {
		SeriesPrinter myPrinter = new SeriesPrinter();

		// startIndex = 10
		System.out.print("1st Print: ");
		myPrinter.printSeries(10);

		// startIndex = 10,endIndex = 20
		System.out.print("2nd Print: ");
		myPrinter.printSeries(10, 20);

		// startIndex = 10,endIndex = 29, interval = 5
		System.out.print("3rd Print: ");
		myPrinter.printSeries(10, 29, 5);

	}

}


