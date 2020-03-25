package day12;

import day05.Solv10;

/*
 * 	���� 1]
 * 		5���� �л��� java,db,html,javascript,spring,sum,avg
 * 		������ ������ �迭�� ����� 
 * 		������ ����� ���ؼ� ����ϼ���..
 * 
 * 		��, ���� ������ ��յ� ���� �迭���� ���� 
 * 		
 */
public class Ex01 {

	public static void main(String[] args) {
		double[][] score = new double[7][7];
//		int sum=0;

		// ������ ���� ���ϴ� for��
		for (int i = 0; i < score.length - 2; i++) {
			for (int j = 0; j < score[i].length - 2; j++) {
				// ���� ���� �ϰ� �ֱ�
				score[i][j] = (int) (Math.random() * 41 + 60);
			}

			// ���� ��÷ ���ϱ�
			for (int j = 0; j < score[i].length - 2; j++) {
				score[i][5] += score[i][j];
			}

		}

		// ��������&�� ���ϴ� for��
		for (int i = 0; i < score.length; i++) {
			// ��� ���ϱ�
			score[i][6] = score[i][5] / 5;

			for (int j = 0; j < score[i].length - 2; j++) {
				// ���� ��÷ ���ϱ�
				score[5][i] += score[j][i];

			}
			// ������� ���ϱ�
			score[6][i] = score[5][i] / 5;
		}

		// ����� �̶� ���� ���
		System.out.printf("���� :\t\tjava\tdb\thtml\tjs\tspring\t����\t���\n");
		System.out.println("----------------------------------------------------------------------------");
		for (int i = 0; i < score.length - 2; i++) {
			System.out.printf("�л�%d : ", i + 1);
			System.out.print("\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%.1f\t", score[i][j]);
			}
			System.out.println("");
		}
		System.out.println("----------------------------------------------------------------------------");

		// �������� ���
		System.out.print("���� ���� : ");
		System.out.print("\t");
		for (int i = 0; i < score.length; i++) {

			System.out.printf("%.1f\t", score[5][i]);

		}
		System.out.println();

		// ������� ���
		System.out.print("���� ��� : ");
		System.out.print("\t");
		for (int i = 0; i < score.length; i++) {

			System.out.printf("%.1f\t", score[6][i]);

		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
	}

}
