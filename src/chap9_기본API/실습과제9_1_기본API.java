package chap9_기본API;
//Book 클래스

class Book extends Object{
	private String title;
	private String author;
	private int publicationYear;
	private String isbn;
	
	@Override //annotation = 코드 주석 달기: 자바 컴파일
	public String toString() {
		return "도셔명: "+title + author +publicationYear + isbn;
	}
	
	void show() {
		
	}

}
/*
//Library 클래스

class Library {
	static final int CAPACITY = 20;
	private Book[] books;
	private int top;
	public void printBooks(String msg) {
		System.out.println(msg + " 도서숫자 = " + top);
//System.out.println(books[i].toString());
	}

	public void sortBooksByTitle() {
//String의 compareTo() 사용
		Arrays.sort(books, 0, top, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));// 9.3.3 Arrays 클래스
	}

	public void sortBooksByISBN() {

	}

	public Book searchBookByTitle(String title) {

	}

}
*/
public class 실습과제9_1_기본API {
	public static void main(String[] args) {
		Object obj = new Book();
		System.out.println(obj.hashCode());
		System.out.println(obj);
		System.out.println(obj.toString());
		
		Book bk = new Book();
		System.out.println(bk.toString());
		
//		Library library = new Library(5);
		// 5개의 Book 객체 초기화
//		Book book1 = new Book("자바", "강감찬", 1995, "1234567890");
//		Book book2 = new Book("파이썬", "이순신", 2008, "1234567891");
//		Book book3 = new Book("자바스크립트", "을지문덕", 2008, "1234567892");
//		Book book4 = new Book("자료구조", "연개소문", 1994, "1234567893");
//		Book book5 = new Book("리액트", "김춘추", 1999, "1234567894");
		// 책 추가
//		library.addBook(book1);
//		library.addBook(book2);
//		library.addBook(book3);
//		library.addBook(book4);
//		library.addBook(book5);
//
//		library.printBooks(); // 도서 목록 출력
//		library.sortBooksByTitle(); // 도서 목록 정렬
//		library.printBooks(); // 정렬된 도서 목록 출력
//
		// 특정 제목으로 도서 검색
//		String searchTitle = "자바";
//		Book foundBook = library.searchBookByTitle(searchTitle);
	}

}
