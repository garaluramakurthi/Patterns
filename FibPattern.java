package patterns;

public class FibPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,res=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.printf("%3d",res);
				a=b;b=res;res=a+b;
			}
			System.out.println();
		}

	}

}
