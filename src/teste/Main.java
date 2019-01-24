package teste;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int solution(int N) {
        List<Integer> list = new ArrayList<>();

        while (N > 0) {
            list.add(N % 2);
            N /= 2;
        }

        int ans = 0;
        int count = 0;

        boolean check = false;

        for ( int i = list.size() - 1; i >= 1; i--) {
            if (list.get(i) == 1) {
                if( list.get(i - 1) == 0 ){
                    check = true;
                    ans = Math.max(ans, count);
                }
                count = 0;
            }else{
                count++;
            }
        }
        if(check)
            return  ans;
        else return 0;
    }
    public static  void main(String[] args){
        System.out.println(solution(1041));


    }

}




