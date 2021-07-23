class lotto {

	public static void main(String[] args) {
		
		int[] ball = new int[45];
		
		for (int i=0;i<45;i++) {
			ball[i] = i+1;
		} //end of for 
		
		int tmp = 0;
		int j = 0;
		
		for (int i=0;i<6;i++) {
			j = (int)(Math.random()*45); // j=3이라 가정 
			
			tmp = ball[i];  //0번자리의 (1번공)을 tmp(1)에 복사  {1, 2, 3, 4, ..} tmp =1
			ball[i] = ball[j]; // 0번자리에 (1번공)을 빼고 (4번공)을 넣기  {4, 2, 3, 4, 5, 6, ...}  tmp=1 
			ball[j] = tmp; // 3번자리에 (4번공)을 빼고 tmp에 복사된 (1번공)을 넣기  {4, 2, 3, 1, 5, 6, ...} tmp=1
			// 단순히 0~5번 어레이 값의 위치를 1:1 교환방식으로 바꾸는 것으로 중복 픽 문제가 없으나 픽 순서대로 배치되진 않을 수 있음.
		} // end of for 
		
		for (int i=0;i<6;i++) { 
			System.out.printf("ball[%d] = %d%n", i, ball[i]);
		} // end of for
	} // end of main

} // end of class 
