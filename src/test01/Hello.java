/*
 * 소스파일 : hello.java 
 */

package test01;

public class Hello {
	
	public static int sum(int n, int m) {
		return n + m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		int s;
		char a;
		
		s = sum(i,10);//sum 함수를 호출
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
				
	}

}
