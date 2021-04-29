import java.util.Arrays;

public class sort_q3 {
    
    /*
        문제 설명
            H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.
            어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.
            어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.
        
        제한사항
            과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
            논문별 인용 횟수는 0회 이상 10,000회 이하입니다.

        입출력 예
            citations	        return
            [3, 0, 6, 1, 5]	    3

        입출력 예 설명
        이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.
    */

    public static void main(String[] args) {
        
        int[] citations = {3,0,6,1,5};
        System.out.println(solution(citations));
    }

    private static int solution(int[] citations) {
        Arrays.sort(citations);

        for(int n = 0; n < citations.length; n++) {
            int h = citations.length - n; // citations를 정렬했으므로 h는 n번째 논문 인용횟수 이상 되는 개수가 된다. -> 최초값 나머지 논문 개수의 최대값 start
            if(h <= citations[n]) { // n번째 논문의 인용횟수(=h) 이상인 인용횟수를 가지는 논문 개수 <= n번째 논문의 인용횟수 -> h-index를 만족하는 최초 조건 return
                return h;
            }
        }
        
        return 0;
    }
}
