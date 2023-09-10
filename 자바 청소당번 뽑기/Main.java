package s21202;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("반 인원은 몇명인가요?");
        
        int all = sc.nextInt();
        System.out.println("뽑을 인원을 입력하세요.");
        int len = sc.nextInt(); // 인원 (명) 최대 23명 (반 인원수)
        
        int arr[]= new int[len];
        int temp=0; // 정렬을 위한 임시변수
        
        System.out.println("몇일동안 할까요?");
        
        int re = sc.nextInt(); // 몇일 치를 뽑을건지 입력
        
        for(int i=0; i<re;i++) { //월~금 까지 반복
            for (int j = 0; j < arr.length; j++) { // 뽑는 인원만큼 반복
                arr[j] = rd.nextInt(all) + 1; // 1~23번까지 랜덤값 배열에 넣기
                for (int k = 0; k < j; k++) {
                    if (arr[j] == arr[k]) { // 배열에 중복값이 없도록 있으면 다시 값을 넣음
                        j--;
                        break;
                    }
                }
            }
            for(int l=0; l< arr.length;l++) { // 정렬 오름차순
                for (int n =l+1; n < arr.length; n++) {
                    if (arr[l] > arr[n]) { // 수업시간에 배운 내용
                        temp = arr[l];
                        arr[l] = arr[n];
                        arr[n] = temp;
                    }
                }
            }
            
            for(int l =0;l< arr.length;l++){ // 출력
                System.out.print(arr[l]+" ");
            }
            System.out.println("\n청소반장: "+arr[rd.nextInt(5)]); // 출력 청소걸린 번호중 랜덤값을 추출해 청소반장 선정
            System.out.println();
        }
    }
}
  