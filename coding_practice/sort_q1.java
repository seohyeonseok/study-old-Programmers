import java.lang.reflect.Array;
import java.util.*;

public class sort_q1 {

    public static void main(String[] args) {
    
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println("정렬 1번 문제");
        System.out.println(Arrays.toString(solution(array,commands)));

    }

    private static int[] solution(int[] array, int[][] commands) {

        int[] answers = new int[commands.length];
    
        for(int index=0; index<commands.length; index++) {
            
            int i = commands[index][0];
            int j = commands[index][1];
            int k = commands[index][2];

            int[] split = Arrays.copyOfRange(array,i-1,j);
            Arrays.sort(split);
            int answer = (int) Array.get(split, k-1);
            
            answers[index] = answer;
        }
        
        return answers;
    }

}