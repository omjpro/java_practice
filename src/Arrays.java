class Arrays {

	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		int[] score = {10, 20, 30, 40, 50};
			
		for (int i=0;i< score.length;i++) {
			sum += score[i];
		} // end of for
		average = sum / (float)score.length;
		
		System.out.println("스코어 총합은="+sum);
		System.out.println("스코어 평균은="+average);
				
	} // end of main

} // end of class
