package test01;

import java.util.*;

public class Diamond {

	public static void main(String[] args) {
        /* ������ �׸��� */    
	    
        System.out.println("���ڸ� �Է����ּ���.");
        Scanner input = new Scanner(System.in);
        
        int answer;                    // �Է¹��� ����
        int center;                    // ��� ��
        
        // ��ĳ�ʷ� ���� �Է� �ޱ�
        answer = input.nextInt();   
        
        // �Է¹��� ������ �����Ͽ� ������ �׷��� ����, ���� ���� ���ϱ�
        answer = answer * 2 + 1;
        
        // ��� �� ��ġ ����
        center = answer/2;
        
        // ������ ������ �迭 ������ ���
        char[][] dia = new char[answer][answer]; 
        
        int start = center;    // ���� ���� ���� ����
        int end = center;      // ���� ���� ���� ����
        
        // ������ ����
        for(int a=0 ; a < answer ; a++){
            for(int b=0 ; b < answer ; b++){
                if(start <= b && b <= end) {
                    dia[a][b] = '*';
                }else {
                    dia[a][b] = ' ';
                }
            }
            
            // �߰����� �� ��� ��ġ ����
            if(a < center) {
                start--;
                end++;
            }else {
                start++;
                end--;
            }
        }
        
        // ������ �迭 ���
        for(int a=0 ; a < answer ; a++){
            for(int b=0 ; b < answer ; b++){
                System.out.print(dia[a][b]);
            }
            System.out.println();
        }
	}

}
