/*
 * Name: Aftar Ahmad Sami
 * ID: 2012020335
 * Section: 5(G)
 * Email: cse_2012020335@lus.ac.bd
 * Date: 15 September 2021
 * IDE: Eclipse
 */

package sami;

public class Main {

	public static void main(String[] args) {
		Player player = new Player("Shakib",75);
		Cricket cricket = new Cricket("International",20,player);
		cricket.display();
		
		System.out.println("");
		Football football = new Football();
	}
}
