package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int k =0 ;
		int l = 1;
		int sum = 0;

		System.out.println(k);
		System.out.println(l);
		for (int i = 2; i <11; i++) {
			sum = k+l;
			k=l;
			l=sum;
			System.out.println(sum);
		}

	}

}
