	
	public class Task_2 {
	
		public static void main(String[] args) {
			Book book1 = new Book();
			Book book2 = new Book();
			Book book3 = new Book();
			
			// Putting Information
			book1.title_of_book = "JAVA for Beginners";
			book1.edition_of_book = "3rd Edition";
			book1.author_of_book = "Prof. David";
			book1.no_of_pages = 537;
			book1.price_of_book = 299;
			book1.publication_of_book = "Easy Coding Publication";
			
			book2.title_of_book = "Omega Point";
			book2.edition_of_book = "12th Edition";
			book2.author_of_book = "Humayun Ahmed";
			book2.no_of_pages = 122;
			book2.price_of_book = 128;
			book2.publication_of_book = "Shomoy Prokashoni";
			
			book3.title_of_book = "Digital Fortress";
			book3.edition_of_book = "5th Edition";
			book3.author_of_book = "Dan Brown";
			book3.no_of_pages = 356;
			book3.price_of_book = 520;
			book3.publication_of_book = "St. Martin Press";
			
			// Calling showInfo() method for all books;
			System.out.println("\n***Book1 Information***\n");
			book1.showInfo();
			System.out.println("\n***Book2 Information***\n");
			book2.showInfo();
			System.out.println("\n***Book3 Information***\n");
			book3.showInfo();
			
			// Printing Memory Address of all objects
			System.out.println("\nMemory Address of Book1 = "+ book1);
			System.out.println("Memory Address of Book2 = "+ book2);
			System.out.println("Memory Address of Book3 = "+ book3);
			
			// Setting book1 = book3 and editing book1.edition_of_book
			book1 = book3;
			book1.edition_of_book = "1st Edition";
			
			// Calling showInfo()
			System.out.println("\n\t\t---Setting book1 = book3 Memory Address---\n");
			book3.showInfo();
			
			// Printing Memory Address of all objects
			System.out.println("\nMemory Address of Book1 = "+ book1);
			System.out.println("Memory Address of Book2 = "+ book2);
			System.out.println("Memory Address of Book3 = "+ book3);
		}
	
	}

	