package com.encore.test;

import com.encore.child.Magazine;
import com.encore.manager.BookManager;
import com.encore.parent.Book;

/**
 * 
 * @author Kyoungju Baek
 * @since JDK 1.8.27
 * @see AAA Paper
 * @version BookTest version1
 *
 */
public class BookTest {

	public static void main(String[] args) {
		Book[] books = {
				new Book("11-11", "자연을 찾아서", "김영남", "오리엔탈북", 23000.0, "자연"),
				new Magazine("22-22", "보그 12월호", "보그", "보그스튜디오", 50000.0, "패션", 2020, 12),
				new Book("33-33", "고대유물", "김석자", "오리엔탈북", 25000.0, "역사"),
				new Magazine("44-44", "보그 1월호", "보그", "보그스튜디오", 50000.0, "패션", 2021, 1),
				new Book("55-55", "풍납토성", "한감", "사이북", 13000.0, "역사"),
				new Magazine("66-66", "엘르 4월호", "엘르", "엘르스튜디오", 30000.0, "패션", 2019, 4),
				new Book("77-77", "그리운 그녀", "삼삼", "피플조이", 12000.0, "소설"),
				new Magazine("88-88", "마음그리기", "마음", "마음돌봄", 10000.0, "문집", 2020, 1),
		};
		BookManager manager = new BookManager();
		
		
		//1.addBook
		for(Book b : books) 
			manager.addBook(b);
		
		showAllBooks(manager.getAllBooks());
		
		//2.deleteBook
		manager.deleteBook("66-66");
		
		
		//3.updateBook
		manager.updateBookPrice("33-33",99999.0);
		
		showAllBooks(manager.getAllBooks());
		
		//4.findBook
		showFindBook();
		
		
//	((Manager) m).changeDept("교육부");
	}
	
	public static void showAllBooks(Book[] books) {
		System.out.println("================= 책 목록 출력 ================");
		if(books == null) {
			System.out.println("출력할 책이 없습니다.");
			return;
		}
		for(Book b : books) {
			if(b == null) continue;
			if(b instanceof Magazine) 
				System.out.println((Magazine)b);  //toString이 알아서 출력해줌
			else
				System.out.println(b);
		}
	}
	
	public static void showFindBook() {
		BookManager manager = new BookManager();
		System.out.println("================= 책 검색 결과================");
		System.out.println(manager.findBookByIbsn("11-11"));
		System.out.println(manager.findBookByTitle("보그 1월호"));
		
	}

}
