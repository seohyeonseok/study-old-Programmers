import java.util.ArrayList;
import java.util.List;

public class sort_q2 {
    
    public static void main(String[] args) {
        
        
        System.out.println("정렬 2번 문제 : 1번 예시");
        int[] numbers_1 = {6,10,2};
        System.out.println(solution(numbers_1));
        
        System.out.println("정렬 2번 문제 : 2번 예시");
        int[] numbers_2 = {3,30,34,5,9};
        System.out.println(solution(numbers_2));

    }

    private static String solution(int[] numbers) {
        List<String> strings = new ArrayList<String>();
         for(int index=0; index < numbers.length; index++) {
             strings.add(String.valueOf(numbers[index]));
         }
 
         strings.sort((val1,val2) -> (val2 + val1).compareTo(val1 + val2));
         
         String rv = String.join("", strings);
         if(rv.startsWith("0")) {
             return "0";
         } else {
             return rv;
         }
         
     }
}
