
class Product{
	int pid;
	String pname;
	float price;
	public Product(int pid, String pname, float price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
}
public class assg1_3 {
	static Product arr[] = new Product[4];		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr[0]=new Product(1,"P1",12.4f);
		arr[1]=new Product(2,"P2",14.3f);
		arr[2]=new Product(3,"P3",17.7f);
		arr[3]=new Product(4,"P4",1.41f);
		reverse(arr,0,arr.length-1);
		for(Product prod:arr) {
			System.out.println(prod.toString());
		}
	}
	
	static Product[] reverse(Product arr[],int first,int last) {
		if(first<last) {
			Product temp=arr[first];
			arr[first]=arr[last];
			arr[last]=temp;
			reverse(arr,first+1,last-1);
		}
		return arr;
	}
	
}
