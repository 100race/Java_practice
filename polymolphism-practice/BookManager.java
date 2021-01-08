package com.encore.manager;

import com.encore.parent.Book;


public class BookManager {
	public static final int MAX_SIZE=10;
	private Book[] books; //DB라고 가정
	int index;
	
	public BookManager() {
		books = new Book[MAX_SIZE];//10
	}
	/**책을 추가하는 메소드
	 * 
	 * @param b DB에 입력할 책을 받는다
 	 * 
	 */
	public void addBook(Book b){
		if(index == MAX_SIZE) {
			System.out.println("error01 : 한도를 초과했습니다.");
		}else if( b == null){
			System.out.println("error02 : 넣을 수 있는 책이 없습니다.");
		}else {
			books[index++] = b; 
		}
	}
	
	/**책을 삭제하는 메소드
	 * 
	 * @param ibsn ibsn으로 삭제할 책을 찾는다
	 */
	public void deleteBook(String ibsn){
		for(int i=0; i<index; i++) {
			if(books[i] != null && books[i].getIbsn() == ibsn) {
				if(i <index-1) {
					for(int j=i; j<index-1; j++) {
						books[j] = books[j+1];
				}}
				books[i] = null;
				index--;
			}
		}
		
	}
	
	/**책을 ibsn으로 찾는 메소드
	 * 
	 * @param ibsn ibsn으로 책을 찾는다
	 * @return 찾은 책을 돌려준다
	 */
	public Book findBookByIbsn(String ibsn) {
		Book book = null;
		for(Book b : books) {
			if(b==null) continue;
			if(b.getIbsn()==ibsn) {
				book = b;
			}
		}
		return book;
	}
	
	/**책을 제목으로 찾는 메소드
	 * 
	 * @param title 책제목으로 책을 찾는다
	 * @return 찾은 책을 돌려준다
	 */
	public Book findBookByTitle(String title) {
		Book book = null;
		for(Book b : books) {
			if(b==null) continue;
			if(b.getTitle()==title) {
				book = b;
			}
		}
		return book;
	}
	
	/**책을 찾아 가격을 변경하는 메소드
	 * 
	 * @param ibsn ibsn으로 가격 변경해 줄 책을 찾는다
	 * @param price 변경할 가격을 입력한다
	 */
	public void updateBookPrice(String ibsn,double price) {
		for(Book b : books) {
			if(b==null) continue;
			if(b.getIbsn()==ibsn) {
				b.setPrice(price);
			}
		}
	}
	
	/**저장된 모든 책을 반환하는 메소드
	 * 
	 * @return 저장된 모든 책을 return한다.
	 */
	public Book[] getAllBooks(){
		return books;
	}
	
}
