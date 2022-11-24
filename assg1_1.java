class Demo{
	//null object to be
	static Demo obj=null;
	static Demo create() {
		if(obj!=null) {
			return obj;
		}
		obj=new Demo();
		return obj;
	}
}
public class assg1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<3;i++){
			Demo obj4=Demo.create();
			System.out.println(obj4.toString());
		}
		Demo obj1=Demo.create();
		System.out.println(obj1.toString());
		Demo obj2=Demo.create();
		System.out.println(obj2.toString());
		Demo obj3=Demo.create();
		System.out.println(obj3.toString());		
	}
}

/*
 class Demo{
	
	Demo obj=null;
	Demo create() {
		if(obj!=null) {
			return obj;
		}
		obj=new Demo();
		return obj;
	}
}
public class assg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<3;i++){
			Demo obj1=new Demo();
			obj1.create();
			System.out.println(obj1.toString());
		}
	}

}

 */
