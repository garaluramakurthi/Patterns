package patterns;

public class Star7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=2,star=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			if(i<3) {
				star+=2;space--;
			}else {
				space++;star-=2;
			}
			System.out.println();
		}

	}

}
