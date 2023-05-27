package commerce;



public class UserDetails {
	private String Name;
	private String Username;
	private String Password;
	private long phone;
	private int age;
	private String city;
	
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return Name;
	}
	public String getUsername() {
		return Username;
	}
	public String getPassword() {
		return Password;
	}
	public long getPhone() {
		return phone;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	UserDetails(){
		
		
	}
	
	UserDetails(String name,String username,String password,String city,int age,long phone){
		this.Name=name;
		this.Password=password;
		this.age=age;
		this.phone=phone;
		this.Username=username;
		this.city=city;
		
		
	}

}
