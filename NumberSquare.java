package patterns;

public class NumberSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j || (i+j==6)) {
					System.out.print(i);
				}else {
					System.out.print("0");
				}
					
			}
			System.out.println();
		}

	}

}
