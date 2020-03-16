package test01;

import java.util.*;

public class Diamond {

	public static void main(String[] args) {
        /* 마름모 그리기 */    
	    
        System.out.println("숫자를 입력해주세요.");
        Scanner input = new Scanner(System.in);
        
        int answer;                    // 입력받은 정수
        int center;                    // 가운데 행
        
        // 스캐너로 정수 입력 받기
        answer = input.nextInt();   
        
        // 입력받은 정수를 가공하여 마름모가 그려질 가로, 세로 길이 구하기
        answer = answer * 2 + 1;
        
        // 가운데 행 위치 지정
        center = answer/2;
        
        // 가공한 정수를 배열 생성에 사용
        char[][] dia = new char[answer][answer]; 
        
        int start = center;    // 점을 찍을 시작 지점
        int end = center;      // 점을 찍을 종료 지점
        
        // 마름모 생성
        for(int a=0 ; a < answer ; a++){
            for(int b=0 ; b < answer ; b++){
                if(start <= b && b <= end) {
                    dia[a][b] = '*';
                }else {
                    dia[a][b] = ' ';
                }
            }
            
            // 중간에서 점 찍는 위치 반전
            if(a < center) {
                start--;
                end++;
            }else {
                start++;
                end--;
            }
        }
        
        // 마름모 배열 출력
        for(int a=0 ; a < answer ; a++){
            for(int b=0 ; b < answer ; b++){
                System.out.print(dia[a][b]);
            }
            System.out.println();
        }
	}

}
