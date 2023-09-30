package patterns;

public class Star6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=0,star=3;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			if(i<3) {
				star--;space++;
			}else {
				star++;space--;
			}
			System.out.println();
		}

	}

}
