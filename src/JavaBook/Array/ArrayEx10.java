package JavaBook.Array;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[5];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random()*5));
        }
        System.out.println();

        for (int i = 0; i < numArr.length -1; i++) { //버블 정렬 알고리즘의 반복 횟수를 결정하는 부분
            //버블 정렬에서는 매 반복마다 가장 큰 요소가 배열의 마지막으로 이동하기 때문에, 매 반복마다 비교할 요소의 개수를 하나씩 줄여줌
//          // numArr.length - 1 : 마지막 요소는 이전 반복에서 이미 가장 큰 값을 가지게 되므로 비교할 필요가 없음
            boolean changed = false; // 자리 바꿈 생겼는지 체크

            for (int j = 0; j < numArr.length -1 -i; j++) { // numArr.length - 1 - i는 각 단계마다 비교해야 할 요소의 개수
//                i는 현재 단계의 인덱스를 나타내며, 이를 이용하여 비교해야 할 요소의 개수를 조정
                if (numArr[j] > numArr[j+1]) { //현재 요소가 다음 요소보다 크다면
                    int temp = numArr[j]; //다음 요소를 서로 교환하기 위해 임시 변수 temp : 현재 요소를 임시 변수 temp에 저장
                    numArr[j] = numArr[j+1]; // 다음 요소를 현재 요소로 대입
                    numArr[j+1]=temp; //  임시 변수 temp에 저장된 값을 다음 요소로 대입
                    changed=true; //정렬이 진행되었음을 표시
                } // 이를 통해 정렬이 진행되며, 큰 요소들이 배열의 뒷부분으로 이동
            }
            if(!changed) break;
            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
//                System.out.println();
            }

        }
    }
}
