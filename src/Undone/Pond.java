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
	// 5번
	public static int pond(int[][] arr) {
		
		int size = pondShape.length;	
		visited = new boolean[size][size];
		
		boolean[][] visited = new boolean[size][size];
		for(int i = 0 ; i < size; i++) {
			for(int j = 0; j < size; j++)
				if(pondShape[i][j] == 1) {
					// 상하좌우 depth 확인
					
					
				}
				

			}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		
	}

}
