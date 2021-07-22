import java.util.Scanner;    // Scanner�� ����ϱ� ���� �߰�

class Ex2_scanner { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine(); // nextLine() ��Ʈ������ �Է�, nextInt() �����Է�, nextFloat() �Ǽ� �Է� 
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ

		System.out.println("�Է³��� :"+input); // println ������ٹٲ� 
		System.out.printf("num=%d%n", num); // %d ���ø����(10����), printf �����ڷ� ���, 
	}  // end of main
} // end of class 
