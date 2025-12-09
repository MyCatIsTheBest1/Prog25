package bookpack;

class Book {
	private String title;
	private String author;
	private int pubDate;

	Book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}

	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);

		System.out.println();
	}
}
class Pr020 {
	public static void main(String[] args) {
		Book[] books = new Book[5];
		books[0] = new Book("Портрет Дориана Грея", "О. Уайлд", 1890);
		books[1] = new Book("Мартин Иден", "Д. Лондон", 1923);
		books[2] = new Book("Мастер и Маргарит", "М.А. Булгаков", 1981);
		books[3] = new Book("Оно", "С. Кинг", 1986);
		books[4] = new Book("Преступление и наказание", "Ф.М. Достоевский", 1971);
		for(int i=0; i < books.length; i++)
			books[i].show();
	}
}
