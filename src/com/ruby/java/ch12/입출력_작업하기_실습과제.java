package com.ruby.java.ch12;
//Book 클래스

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

class Book extends Object implements Serializable {
	
	private static final long serialVersionUID = 1L;
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

class Library implements Serializable{
	
	private static final long serialVersionUID = 1L;
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


}

public class 입출력_작업하기_실습과제 {

	//파일 저장
	private static void saveLibrary(Library library, String filename) {

		try (ObjectOutputStream out 
				= new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(library);
//            System.out.println(filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	//파일 출력
	private static Library loadLibrary(String string) {
		
		try (ObjectInput in = 
			new ObjectInputStream(new FileInputStream(string))) {
            Library library = (Library) in.readObject();
//            System.out.println(string);
            return library;
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return null;
	}
	
	public static void main(String[] args) {

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
		
		 // 파일에 Library 저장
		saveLibrary(library, "library.dat");
		
		System.out.println("-".repeat(80));
		
		// 파일로부터 Library 로드
		Library lib = loadLibrary("library.dat");
		
		
		lib.printBooks("\n 파일에서 로드된 도서목록");
        
		
        
        


		
	

	}

}
