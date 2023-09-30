package patterns;

public class Star5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int star=3;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			if(i<3) {
				star--;
			}else {
				star++;
			}
			System.out.println();
		}

	}

}
