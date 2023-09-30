package patterns;

public class NumPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=2,n=1;
		for(int i=1;i<=3;i++) {
			
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			int k=i;
			for(int j=1;j<=n;j++) {
				if(j<(n/2)+1) {
					System.out.print(k--);
				}else {
					System.out.print(k++);
				}
				
			}
			System.out.println();
			space--;n+=2;
		}

	}

}
