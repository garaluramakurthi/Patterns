package patterns;

public class Star4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=1;
		int n=5,mid=n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			if(i<mid) {
				star++;
			}else {
				star--;
			}System.out.println();
		}

	}

}
