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
		// �������� ���� ���� �ִٸ� false ��ȯ
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
		}
		// ���̰�, �� �����ڸ��� �ƴ�
		if (pond[i][j] >= 1 && pond[i + 1][j] != 0 && pond[i][j + 1] != 0 && pond[i - 1][j] != 0
				&& pond[i][j - 1] != 0) {
			// ���Ǹ��� �� ���� ++
			if (pond[i][j] <= pond[i + 1][j] && pond[i][j] <= pond[i][j + 1] && pond[i][j] <= pond[i - 1][j]
					&& pond[i][j] <= pond[i][j - 1]) {
				pond[i][j]++;
			} else {
				// ���� �������� �ʴ� ��� - ���� �Ϸ�
				measured[i][j] = true;
			}
		} else {
			measured[i][j] = true;
		}
	}

	public void checkDepth(int[][] arr) {

		// ��� �� �����Ϸ��� ������ �ݺ�
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
		// ���
		for (int[] depth : newPond.pond) {
			for (int d : depth) {
				System.out.print(d + " ");
				sum += d;
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		System.out.println("���� �� ������ �� ��: " + sum);

	}

}
