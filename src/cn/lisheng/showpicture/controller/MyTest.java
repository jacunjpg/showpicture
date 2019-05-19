package cn.lisheng.showpicture.controller;

public class MyTest extends MyAbstractClass{
	public static void changeStr(String str) {
		str = "he";
	}	
	
	public static void main(String[] args) {
		
		MyAbstractClass ab = new MyAbstractClass() {
			
			@Override
			void mytest1() {
				// TODO Auto-generated method stub
				
			}
		};
		
		String str = "she";
		changeStr(str);
		System.out.println(str);
	}

	
	@Override
	void mytest1() {
		// TODO Auto-generated method stub
		
	}

}
