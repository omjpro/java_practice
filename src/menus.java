import java.util.*;

class menus {

	public static void main(String[] args) {
		
		int menu =0, num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer :
		while (true) {
			System.out.println("[1] square");
			System.out.println("[2] square root");
			System.out.println("[3] log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요(종료 0) >");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if (menu == 0);{
				System.out.println("프로그램을 종료합니다.");
				break;
						
			} else if (!(menu>=1 && menu<=3)); {
					System.out.println("메뉴를 잘못 선택함 (종료 0)");
				continue;
			}
			
			for (;;) {					
				System.out.println("계산값을 입력해 주세요>");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				if (num==0)
					break;
				if (num==99)
					break outer;
				
				switch (menu) {
					case 1:
						System.out.println("계산결과는"+ num*num +"입니다.");
						break;
					case 2:
						System.out.println("계산결과는"+Math.sqrt(num)+"입니다.");
						break;
					case 3: 
						System.out.println("계산결과는"+Math.log(num)+"입니다.");
						break;
							
					} // end if switch 

				} // end of if
				
			} // end of while
		
	} // end of main

} //end of class 
