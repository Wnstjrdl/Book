package BOOK;
import java.util.Scanner;


public class BookMain {
//  1.도서등록 2.도서조회 3.  도서목록  4.도서반납및대여 5.도서삭제 6.도서수정 7.종료
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Long id = 0L;
		int selctNum = 0;
		boolean run = true;
		BookSurvice bs = new BookSurvice();
		while (run) {
			System.out.println("=========================================================================================");
			System.out.println("|1.도서등록| 2.도서목록|3.도서조회 |4.회원가입|5. 로그인| 6.도서수정|7.도서삭제|8.도서대여|9.도서반납|10.종료|");
			System.out.println("=========================================================================================");
			System.out.println("목록을 선택하세요 >>");
			selctNum = scan.nextInt();
			if (selctNum == 1) {
				bs.save(); // 도서등록
			} else if (selctNum == 2) {
				bs.findAll(); // 도서목록
			} else if (selctNum == 3) {
				bs.findById(); // 도서조회
			} else if (selctNum == 4) {
					bs.msave();			//회원가입
			} else if (selctNum == 5) {
					bs.login();		//로그인	
			} else if (selctNum == 6) {
				 bs.update(); //도서수정
			} else if (selctNum == 7) {
				bs.remove(); //도서삭제
			}else if  (selctNum == 8) {
				bs.rental();				//도서대여
			}else if  (selctNum == 9) {
						bs.give();		//도서반납
			}else if  (selctNum == 10) {
				run = false;
			}

		}

	}

}