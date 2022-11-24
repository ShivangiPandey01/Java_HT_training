import java.util.*;
class User{
	private int id;
	private String username;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + "]";
	}
	public User(int id, String username, String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}
}
public class assg2_2{
	public static void main(String args[]){
		ArrayList<User> aluser=new ArrayList<User>();
		aluser.add(new User(4, "uname4", "uname4@abc.com"));
		aluser.add(new User(2, "uname2", "uname2@abc.com"));
		aluser.add(new User(3, "uname3", "uname3@abc.com"));
		aluser.add(new User(1, "uname1", "uname1@abc.com"));
		show(aluser);
		Collections.reverse(aluser);
		System.out.println("Reversed:");
		show(aluser);
		/*
		Iterator<User> itr = aluser.iterator();
		while(itr.hasNext()) {
			System.out.println("--"+itr.next());
		}
		HashSet<User> hs = new HashSet<User>(aluser);
		for(Object usr:hs) {
			System.out.println(".."+usr);
		}*/
	}
	static void show(ArrayList<User> aluser) {
		Iterator<User> itr = aluser.iterator();
		while(itr.hasNext()) {
			System.out.println("--"+itr.next());
		}
	}
}

