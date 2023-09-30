package patterns;

public class Swastik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,mid=n/2+1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==mid ||j==mid   || (j==n && i>=mid) || (j==1 && i<=mid) || (i==n && j<=mid) || (i==1 && j>=mid) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
