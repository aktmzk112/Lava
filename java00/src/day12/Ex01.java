package day12;

import day05.Solv10;

/*
 * 	문제 1]
 * 		5명의 학생의 java,db,html,javascript,spring,sum,avg
 * 		점수를 관리할 배열을 만들고 
 * 		총점과 평균을 구해서 출력하세요..
 * 
 * 		단, 과목별 총점과 평균도 같이 배열에서 관리 
 * 		
 */
public class Ex01 {

	public static void main(String[] args) {
		double[][] score = new double[7][7];
//		int sum=0;

		// 점수와 총점 구하는 for문
		for (int i = 0; i < score.length - 2; i++) {
			for (int j = 0; j < score[i].length - 2; j++) {
				// 점수 랜덤 하게 넣기
				score[i][j] = (int) (Math.random() * 41 + 60);
			}

			// 과목 총첨 구하기
			for (int j = 0; j < score[i].length - 2; j++) {
				score[i][5] += score[i][j];
			}

		}

		// 과목총점&평군 구하는 for문
		for (int i = 0; i < score.length; i++) {
			// 평균 구하기
			score[i][6] = score[i][5] / 5;

			for (int j = 0; j < score[i].length - 2; j++) {
				// 과목 종첨 구하기
				score[5][i] += score[j][i];

			}
			// 과목평균 구하기
			score[6][i] = score[5][i] / 5;
		}

		// 과목명 이랑 점수 출력
		System.out.printf("구분 :\t\tjava\tdb\thtml\tjs\tspring\t총점\t평균\n");
		System.out.println("----------------------------------------------------------------------------");
		for (int i = 0; i < score.length - 2; i++) {
			System.out.printf("학생%d : ", i + 1);
			System.out.print("\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%.1f\t", score[i][j]);
			}
			System.out.println("");
		}
		System.out.println("----------------------------------------------------------------------------");

		// 과목총점 출력
		System.out.print("과목 총점 : ");
		System.out.print("\t");
		for (int i = 0; i < score.length; i++) {

			System.out.printf("%.1f\t", score[5][i]);

		}
		System.out.println();

		// 과목평균 출력
		System.out.print("과목 평균 : ");
		System.out.print("\t");
		for (int i = 0; i < score.length; i++) {

			System.out.printf("%.1f\t", score[6][i]);

		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
	}

}
