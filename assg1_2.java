import java.util.ArrayList;

class Demo1{
	static Demo1 obj=null;
	static Demo1 create() {
		obj=new Demo1();
		return obj;
	}
}
public class assg1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Demo1> arr= new ArrayList<Demo1>(3);
		int k=0;
		System.out.println("Entered");
		for(int i=0;i<8;i++){			
			if(i<3){
				Demo1 obj=Demo1.create();
				arr.add(obj);
				System.out.println(arr.get(i));
			}
			else {				
				if(k<3){
					System.out.println(arr.get(k));
					k=k+1;					
				}
				else
					k=0;				
			}
		}		
	}
}
