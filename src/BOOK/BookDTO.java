package BOOK;

public class BookDTO {
private Long id;  //도서번호
private String bookTitle; //책의 이름
private String bookwrte;	// 작가이름  
private String bookDate; //책의 출판일
private int money; //책 가격
private int tits = 1; 
BookDTO(){
	
}

public BookDTO(Long id, String bookTitle, String bookwrte, String bookDate, int money) {

	this.id = id;
	this.bookTitle = bookTitle;
	this.bookwrte = bookwrte;
	this.bookDate = bookDate;
	this.money = money;
}

public int getTits() {
	return tits;
}

public void setTits(int tits) {
	this.tits = tits;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getBookTitle() {
	return bookTitle;
}

public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}

public String getBookwrte() {
	return bookwrte;
}

public void setBookwrte(String bookwrte) {
	this.bookwrte = bookwrte;
}

public String getBookDate() {
	return bookDate;
}

public void setBookDate(String bookDate) {
	this.bookDate = bookDate;
}

public int getMoney() {
	return money;
}

public void setMoney(int money) {
	this.money = money;
}

@Override
public String toString() {
	return "BookDTO [id=" + id + ", bookTitle=" + bookTitle + ", bookwrte=" + bookwrte + ", bookDate=" + bookDate
			+ ", money=" + money + "]";
}

public BookDTO(Long id, String bookTitle, String bookwrte, String bookDate, int money, int tits) {

	this.id = id;
	this.bookTitle = bookTitle;
	this.bookwrte = bookwrte;
	this.bookDate = bookDate;
	this.money = money;
	this.tits = tits;
}





}