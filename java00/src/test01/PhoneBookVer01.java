package test01;

class PhoneInfo
{
	String name;
	String phoneNumber;
	String birth;
	
	public PhoneInfo(String name , String num , String birth) {
		this.name = name;
		phoneNumber = num;
		this.birth = birth;
	}
	
	public PhoneInfo(String name, String num) {
		this.name = name;
		phoneNumber = num;
		birth = null;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화 번호 : " + phoneNumber);
		if(birth != null) {
			System.out.println("생년월일 : " + birth);
		}
		System.out.println("");
	}
}

public class PhoneBookVer01 {

 public static void main(String[] args) {
	PhoneInfo pinfo = new PhoneInfo("최두용 반장님", "010-4444-7874" ,"1988-05-74");
	PhoneInfo pinfo2 = new PhoneInfo("정우송 형님","010-3294-3023");
	
	pinfo.showInfo();
	pinfo2.showInfo();
}
}
