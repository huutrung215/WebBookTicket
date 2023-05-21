package bean;

public class users {
	private long Id;
	private String name;
	private String email;
	private String password;
	
	public users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public users(long Id, String name, String email, String password) {
		super();
		this.Id = Id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return Id;
	}
	
	public void setId(long Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String isPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
