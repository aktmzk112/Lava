package test01;

public class Info {

	String id;
	String pass;
	String name;
	String phone;
	String email;
	
	public Info() {
		
	}
	
	public Info(String id, String pw, String name , String phone , String email) {
		this.id = id;
		this.pass = pw;
		this.name = name;
		this.phone = phone;
		this.email = email;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
