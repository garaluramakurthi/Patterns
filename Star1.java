package patterns;

public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=3,star=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star++;space--;
		}

	}

}
