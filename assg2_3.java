import java.util.TreeSet;

class User1{
	private int id;
	private String Username;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User1 [id=" + id + ", Username=" + Username + ", email=" + email + "]";
	}
	public User1(int id, String Username, String email) {
		super();
		this.id = id;
		this.Username = Username;
		this.email = email;
	}
	/*public int compareTo(User1 s1) {
		// TODO Auto-generated method stub
		if(this.Username.equals(s1.Username))
			return 0;
		return 1;
	}*/
}
public class assg2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Descending:");
		TreeSet<User1> ts = new TreeSet<User1>((s1,s2)->s2.getUsername().compareTo(s1.getUsername()));		
		ts.add(new User1(1,"shivangi","shivangi.pandey@gmail.com"));
		ts.add(new User1(2,"shivani","shivani.sharma@gmail.com"));
		ts.add(new User1(3,"mangal","mangal.gavas@gmail.com"));
		ts.add(new User1(4,"abhilasha","abhilasha.saste@gmail.com"));
		ts.add(new User1(5,"nikita","nikita.more@gmail.com"));
		System.out.println(ts);
		System.out.println("Ascending:");
		TreeSet<User1> ts1 = new TreeSet<User1>((s1,s2)->s1.getUsername().compareTo(s2.getUsername()));
		ts1.addAll(ts);
		System.out.println(ts1);
	}

}
