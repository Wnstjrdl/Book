package BOOK;

import java.util.*;

import java.util.Scanner;





public class BookSurvice {
	Scanner scan = new Scanner(System.in);
	static Long id = 0L;
	BookRepository br = new BookRepository();

	public void save() {
		System.out.print("도서번호를 입력하세요");
		Long id = scan.nextLong();
		System.out.print("책의 이름을 입력하세요:");
		String bookTitle = scan.next();
		System.out.print("책의 가격을 입력하세요");
		int money = scan.nextInt();
		System.out.print("책의 출판일을 입력하세요:");
		String bookDate = scan.next();
		System.out.print("작가 이름을 입력하세요:");
		String bookWrte = scan.next();

		if (!checkbook(id)) {
			BookDTO newBook = new BookDTO(id, bookTitle, bookWrte, bookDate, money);
			boolean saveResult = br.save(newBook);
			if (saveResult) {
				System.out.println("신규 도서 등록 완료");
			} else {
				System.out.println("도서 등록 실패");
			}
		} else {
			System.out.println("중복된 도서 번호입니다!!!");
		}

	}

	private boolean checkbook(Long id) {

		return br.checkbook(id);
	}

	public void findAll() {
		List<BookDTO> bookList = br.findAll();
		for (BookDTO b : bookList) {
			System.out.println(b);
		}
	}

	public void findById() {
		findAll();
		System.out.println("1.아이디 조회 | 2. 책제목 조회");
		System.out.print("선택>");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.println("조회할 도서번호를 입력하세요");
			Long findid = scan.nextLong(); // findid: 글번호로조회하기위해 지정한 변수
			BookDTO book = br.findById(findid); // book:BookDTO의Repositoryd의 findid
			if (book == null) {
				System.out.println("찾을수 없습니다");
			} else {
				System.out.println(book); // findid가아니라 책을 조회해야하니 book을 넣어야함
			}

		} else if (select == 2) {
			System.out.println("조회할 도서제목를 입력하세요");
			String bookTitle = scan.next(); // findid: 글번호로조회하기위해 지정한 변수
			BookDTO book = br.findByBookTitle(bookTitle); // book:BookDTO의Repositoryd의 findid
			if (book == null) {
				System.out.println("찾을수 없습니다");
			} else {
				System.out.println(book); // findid가아니라 책을 조회해야하니 book을 넣어야함
			}
		}

	}

	public void remove() {
		findAll();
		System.out.println("삭제할 도서입력:");
		Long removeId = scan.nextLong();
		br.remove(removeId);
		findAll();
	}

	public void update() {
		System.out.println("도서번호를 입력해주세요");
		Long id = scan.nextLong();
		System.out.println("도서제목을 입력해주세요");
		String bookTitle = scan.next();
		Long checkUp = br.checkB(id, bookTitle);
		// 글번호 제목 체크

		// 수정
		if (checkUp != null) {
			System.out.println("변경할 제목을 입력하세요");
			bookTitle = scan.next();
			System.out.println("변경할 가격을 입력하세요");
			int money = scan.nextInt();
			BookDTO updatbook = br.update(checkUp, bookTitle, money);
			System.out.println(updatbook);
		} else {
			System.out.println("일치하지않습니다");

		}

	}
	public void msave() {
		
		System.out.println("아이디를 입력해주세요");
		String memberId = scan.next();
		System.out.println("비밀번호를 입력해주세요");
		String passWord = scan.next();
		System.out.println("이름을 입력해주세요");
		String name = scan.next();
		System.out.println("나이를 입력해주세요");
		int age = scan.nextInt();
		MemberDTO newMember =new MemberDTO(memberId, passWord, name, age);
		boolean saveLog = br.msave(newMember);
		if (saveLog) {
			System.out.println("가입이 성공하였습니다");
		} else {
			System.out.println("가입이 실패하였습니다");
		}

	}

	public void login() {
		System.out.println("아이디를 입력해주세요");
		String memberId = scan.next();
		System.out.println("비밀번호를 입력해주세요");
		String passWord = scan.next();
		boolean loginResult = br.login(memberId, passWord);
		if (loginResult) {
			System.out.println("로그인성공!!");
		} else {
			System.out.println("정보가 일치하지않습니다");
		}
	}

	public void rental() {
		System.out.println("아이디를 입력해주세요");
		String memberId = scan.next();
		System.out.println("비밀번호를 입력해주세요");
		String passWord = scan.next();
		if (br.checkmemberId(memberId, passWord)) {
			System.out.println("도서번호를 입력하세요");
			Long id = scan.nextLong();

			if (br.rental(id) != null) {
				System.out.println("도서를 대여하였습니다");
			}

			else {
				System.out.println("도서가 없습니다");
			}

		} else {
			System.out.println("정보가 일치하지않습니다");
		}

	}

	private boolean checkmemberId(String memberId, String passWord) {
		return br.checkmemberId(memberId, passWord);
	}

	public void give() {
		System.out.println("아이디를 입력해주세요");
		String memberId = scan.next();
		System.out.println("비밀번호를 입력해주세요");
		String passWord = scan.next();
		if (br.checkmemberId(memberId, passWord)) {
			System.out.println("반납할 도서 번호를 입력하세요");
			Long id = scan.nextLong();
			if (br.give(id) != null) {
				{
					System.out.println("도서를 반납하였습니다");
				}
			} else {
				System.out.println("도서를 반납하지않았습니다.");
			}

		} else {
			System.out.println("정보가 일치하지않습니다");
		}

	}

}