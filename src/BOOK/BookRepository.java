package BOOK;

import java.util.*;
import java.util.ArrayList;
import java.util.List;



public class BookRepository {
	static List<BookDTO> bookList = new ArrayList<>();
	static List<MemberDTO> memberList = new ArrayList<>();

	public boolean checkbook(Long id) {
		boolean checkbook = false; // 부정으로 선언해서 부정으로 반전에 반전을 줌
		for (int i = 0; i < bookList.size(); i++) {
			if (id.equals(bookList.get(i).getId())) {
				checkbook = true;
			}
		}
		return checkbook;
	}

	public boolean save(BookDTO newBook) {

		return bookList.add(newBook);
	}

	public List<BookDTO> findAll() {

		return bookList;
	}

	public BookDTO findById(Long findid) { // void아님 선언해줘야함
		BookDTO book = null;
		for (int i = 0; i < bookList.size(); i++) {
			if (findid.equals(bookList.get(i).getId())) {
				book = bookList.get(i);
			}
		}

		return book;
	}

	public BookDTO findByBookTitle(String bookTitle) { // void아님 선언해줘야함
		BookDTO book = null;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookTitle.equals(bookList.get(i).getBookTitle())) {
				book = bookList.get(i);
			}
		}

		return book;
	}

	public void remove(Long removeId) {
		for (int i = 0; i < bookList.size(); i++) {
			if (removeId.equals(bookList.get(i).getId())) {
				bookList.remove(i);
			}
		}

	}

	public Long checkB(Long id, String bookTitle) { // 글번호 제목
		Long checkUp = null;
		for (int i = 0; i < bookList.size(); i++) {
			if (id.equals(bookList.get(i).getId()) && bookTitle.equals(bookList.get(i).getBookTitle())) {
				checkUp = bookList.get(i).getId();
			}

		}
		return checkUp;

	}
						//이름과 제목
	public BookDTO update(Long checkUp, String bookTitle, int money) {
		BookDTO updatebook = null;
		for (int i = 0; i < bookList.size(); i++) {
			if (checkUp.equals(bookList.get(i).getId())) {
				bookList.get(i).setBookTitle(bookTitle);
				bookList.get(i).setMoney(money);
				updatebook = bookList.get(i);
			}
		}
		return updatebook;

	}

	public boolean msave(MemberDTO newMember) {

		return memberList.add(newMember);
	}

	public boolean login(String memberId, String passWord) {
		boolean result = false;
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())
					&& passWord.equals(memberList.get(i).getPassWord())) {
			}
			result = true;
		}
		return result;
	}

	public boolean checkmemberId(String memberId, String passWord) {
		boolean checkLogin = false;
		for (int i = 0; i < bookList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())
					&& passWord.equals(memberList.get(i).getPassWord())) {
				checkLogin = true;
			}
		}
		return checkLogin;
	}

	public BookDTO rental(Long id) {
		BookDTO result = null;
		for (int i = 0; i < bookList.size(); i++) {
			if (id.equals(bookList.get(i).getId())) {
				bookList.get(i).getTits();
					result = bookList.get(i); 
			}
		}
		return result;
	}

	public BookDTO  give(Long id) {
		BookDTO result = null ;
		for (int i = 0; i < bookList.size(); i++) {
			if (id.equals(bookList.get(i).getId())){
					bookList.get(i).setTits(0);
			result = bookList.get(i); 		
			
			
		}
		
	}
		return result;
		





	
	

	



	

    	

	 
	
	}	
	
}