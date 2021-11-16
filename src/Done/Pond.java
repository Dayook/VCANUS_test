package Done;

public class Pond {

	int[][] pond;
	int size;
	boolean[][] measured;

	public Pond() {
		this.pond = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 }, { 0, 1, 1, 1, 1, 1, 1, 0, 0, 0 }, { 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, { 0, 0, 1, 1, 1, 1, 1, 1, 0, 0 }, { 0, 0, 0, 1, 1, 1, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		this.size = pond.length;
		this.measured = new boolean[size][size];

	}

	private boolean allMeasured() {
		// 측정되지 않은 셀이 있다면 false 반환
		for (boolean[] bool : measured) {
			for (boolean b : bool) {
				if (!b)
					return false;
			}
		}
		return true;
	}

	private void measure(int i, int j) {

		if (pond[i][j] == 0) {
			measured[i][j] = true;
		} else if (!measured[i][j]) {
			// 조건만족 시 깊이 ++
			if (pond[i][j] <= pond[i + 1][j] && pond[i][j] <= pond[i][j + 1] && pond[i][j] <= pond[i - 1][j]
					&& pond[i][j] <= pond[i][j - 1]) {
				pond[i][j]++;
			} else {
				// 조건 만족하지 않는 경우 - 측정 완료
				measured[i][j] = true;
			}
		}
	}

	public void checkDepth(int[][] arr) {

		// 모든 셀 측정완료할 때까지 반복
		while (!allMeasured()) {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (!measured[i][j]) {
						measure(i, j);
					}
				}
			}
		}

	}

	public static void main(String[] args) {

		Pond newPond = new Pond();
		newPond.checkDepth(newPond.pond);

		int sum = 0;
		// 출력
		for (int[] depth : newPond.pond) {
			for (int d : depth) {
				System.out.print(d + " ");
				sum += d;
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		System.out.println("연못 물 깊이의 총 합: " + sum);

	}

}
