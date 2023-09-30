package patterns;

public class NumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=2,num=1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}int k=1;
			for(int j=1;j<=num;j++) {
				if(j<(num/2)+1) {
					System.out.print(k++);
				}else {
					System.out.print(k--);;
				}
			}
			System.out.println();
			space--;num+=2;
		}

	}

}
