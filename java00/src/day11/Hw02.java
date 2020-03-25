package day11;

public class Hw02 {

	public static void main(String[] args) {
		int[][] no1 = new int[5][5];
//		int[][] no2 = new int[2][5];
		int num1 = 1;
		int num2 = 101;
//�汝鶬� 轎溘
		for (int i = 0; i < no1[i].length - 2; i++) {
			for (int j = 0; j < no1[i].length; j++) {
				no1[i + i][j] = num1++;

			}

		}
// 礎熱還 轎溘
		for (int i = 0; i < no1.length; i++) {
			for (int j = 0; j < no1[i].length; j++) {
				if (no1[i][j] == 5 || no1[i][j] == 10) {
					for (int k = 0; k < no1[i].length; k++) {
						no1[i + 1][k] = num2++;
					}
				}
			}
		}

		System.out.println(num1);
		for (int i = 0; i < no1.length; i++) {
			for (int j = 0; j < no1[i].length; j++) {
				System.out.print(no1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
