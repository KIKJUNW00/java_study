package chap9_기본API;
//Book 클래스

import java.util.Arrays;

class Book extends Object {
	private String title;
	private String author;
	private int publicationYear;
	private String isbn;

	public Book(String title, String author, int publicationYear, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override // annotation = 코드 주석 달기: 자바 컴파일
	public String toString() {
		return "도셔명: " + title 
				+ ", 저자: " + author
				+ ", 출판연도: " + publicationYear 
				+ ", ISBN: " + isbn;
	}

	void show() {
		System.out.println(toString());
	}

}

//Library 클래스

class Library {
	static final int CAPACITY = 20;
	private Book[] books;
	private int top;

	public Library(int top) {
		super();
		this.books = new Book[CAPACITY];
		this.top = top;
	}

	public void addBook(Book book) {
		if (top <= CAPACITY) {
			books[top] = book;
			top++;
		} else {
			System.out.println("도서관 만실");
		}
	}

	public void printBooks(String msg) {
		System.out.println(msg + " 도서숫자 = " + top);
			for (int i = 0; i < top; i++) {				
				System.out.println(books[i]);
			}
			System.out.println("=".repeat(100));
		}
	
	public Book searchBookByTitle(String title) {
		for (int i = 0; i < top; i++) {
            if (books[i].getTitle().equals(title)) {
            	return books[i];
            }
        }
        return null; // 해당 제목의 책이 없으면 null 반환
	}



	public void sortBooksByTitle() {
//String의 compareTo() 사용
		Arrays.sort(books, 0, top, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));// 9.3.3 Arrays 클래스
	}

	public void sortBooksByISBN() {// 바코드 정렬
		Arrays.sort(books, 0, top, (b1, b2) -> b1.getIsbn().compareTo(b2.getIsbn()));
	}

//	public Book searchBookByTitle(String title) {//제목찾기
//		
//	}

}

public class 실습과제9_1_기본API {
	public static void main(String[] args) {
//		Object obj = new Book();				실습이었음
//		System.out.println(obj.hashCode());
//		System.out.println(obj);
//		System.out.println(obj.toString());
//		
//		Book bk = new Book();
//		System.out.println(bk.toString());
		
		
		Library library = new Library(0);
//		 5개의 Book 객체 초기화
		Book book1 = new Book("자바", "강감찬", 1995, "1234567890");
		Book book2 = new Book("파이썬", "이순신", 2008, "1234567891");
		Book book3 = new Book("자바스크립트", "을지문덕", 2008, "1234567892");
		Book book4 = new Book("자료구조", "연개소문", 1994, "1234567893");
		Book book5 = new Book("리액트", "김춘추", 1999, "1234567894");
		
//		 책 추가
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);

		// 도서 목록 출력
		library.printBooks("\n제목정렬전");
		
		// 도서 목록 정렬
		library.sortBooksByTitle();
		
		// 정렬된 도서 목록 출력
		library.printBooks("\n제목정렬후");
		
		// 특정 제목으로 도서 검색
		library.printBooks("\nISBN정렬전");
		
		// 도서 목록 정렬
		library.sortBooksByISBN();
		
		// 정렬된 도서 목록 출력
		library.printBooks("\nISBN정렬후");
		
		// 특정 제목으로 도서 검색
		String searchTitle = "자바";
		Book foundBook = library.searchBookByTitle(searchTitle);
		
		if (foundBook == null) {
		System.out.println("\n자바 책이 없다");
		}else
		System.out.println("\n도서명으로 검색한 도서" + foundBook.toString());
	

	}

}
