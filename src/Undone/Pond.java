package Undone;

public class Pond {
	
	public static int[][] pondShape 
							= new int[][] { {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										    {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
										    {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
										    {0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
										    {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
											{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
											{0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
											{0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
											{0, 0, 0, 0, 1, 0 ,0, 0, 0, 0},
											{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}   
										   };
							   
	public static boolean[][] visited;
								
//	public static int checkDepth() {
//		
//	}
	// 5¹ø
	public static int pond(int[][] arr) {
		
		int size = pondShape.length;	
		visited = new boolean[size][size];
		
		// 연못 깊이를 지속적으로 검사하는 순환문과 순환문을 종료하는 코드 
		boolean[][] visited = new boolean[size][size];
		for(int i = 0 ; i < size; i++) {
			for(int j = 0; j < size; j++)
				// 상하좌우를 검사하는 코드가 필요
				if(pondShape[i][j] == 1) {
					// »óÇÏÁÂ¿ì depth È®ÀÎ
					
					
				}
				

			}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		
	}

}
