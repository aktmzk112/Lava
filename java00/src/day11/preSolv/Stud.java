package day11.preSolv;

/**
 *  이 클래스는 학생 한명의 이름과 과목 점수를 저장할 용도의 클래스
 * @author 유태희
 * @since 2020.03.23
 * 
 *
 */
public class Stud {
	//이 클래스는 학생 한명의 데이터이므로
	// 이름이 있어야한다
	String name;
	
	//과목 점수를 저장할 목적으로 변수 생성
	
	int kor,eng,math, phys, cod;
	
	//이 클래스가 인스턴스가 되는 순간
	//해당 인스턴스의 소유주를 기억시겨 놓으면 좋을것 같다.
	//맴버의 초기화 역할을 하는 함수가 생성자 함수 이므로 
	//생성자 함수에서 입력되는 이름으로 초기화 한다
	//this란 현재 실행된고 있는 객체의 자기자신을 뜻하는 예약어 이다.
	public Stud() {
		//아무데이터도 입력하지 않으면 "우현우"라는 학생의데이터로 초기화
//		this.kor = 100; => this() 함수 이전에 명령이 오면 에러가 난다.
//		this("우현우");
		
		setSubj();
	}
	
	public Stud(String name) {
		this();
		this.name = name;
	}
	// 과목 점수 입력해주는 함수
	// 우리는 랜덤하게 입력하자
	public void setSubj() {
		kor = (int) (Math.random()*41+60);
		eng = (int) (Math.random()*41+60);
		math = (int) (Math.random()*41+60);
		phys= (int) (Math.random()*41+60);
		cod= (int) (Math.random()*41+60);
	}
	
	//총점구하는 함수 . 총점을 담을 변수가 없다.
	//이함수가 실행되면 총점을 할려주자 
	
	public int getSum() {
		//총점계산후 반환
		
		return kor+eng+ math+ phys+cod;
		
	}
	
	//평균 구해주는 함수 
	public double getAvg() {
		return getSum() / 5.;
	}
	
	public void toPrint() {
		System.out.printf("%4s : %3d | %3d | %3d | %3d | %3d | %4d | %5.3f\n",name,kor,eng,math,phys,cod, getSum(), getAvg());
	}
}
