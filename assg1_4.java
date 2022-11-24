class Products{
	int pid;
	String pname;
	float price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	public Products(int pid, String pname, float price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
}
class Furniture extends Products{
	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Furniture(int pid, String pname, float price, String color) {
		super(pid, pname, price);
		this.color=color;
	}

	@Override
	public String toString() {
		return "Furniture [color=" + color + "]\t"+super.toString();
	}
	
}
class Clothing extends Products{
	String category;

	public String getCategory() {
		return category;
	}

	public Clothing(int pid, String pname, float price, String category) {
		super(pid, pname, price);
		this.category=category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Clothing [category=" + category + "]\t"+super.toString();
	}
}
public class assg1_4 {
	static Products arr[] = new Products[4];		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr[0]=new Products(1,"P1",12.4f);
		arr[1]=new Furniture(2,"P2",14.3f,"Green");
		arr[2]=new Products(3,"P3",17.7f);
		arr[3]=new Clothing(4,"P4",1.41f,"Kids");
		
		for(Products prod:arr) {
			System.out.println(prod.toString());
		}
	}
}
