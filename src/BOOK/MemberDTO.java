package BOOK;

public class MemberDTO {
String memberId;
String passWord;
String name;
int age;
MemberDTO(){
	
}
public MemberDTO(String memberId, String passWord, String name, int age) {
	super();
	this.memberId = memberId;
	this.passWord = passWord;
	this.name = name;
	this.age = age;
}

public String getMemberId() {
	return memberId;
}
public void setMemberId(String memberId) {
	this.memberId = memberId;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "MemberDTO [memberId=" + memberId + ", passWord=" + passWord + ", name=" + name + ", age=" + age + "]";
}


}
