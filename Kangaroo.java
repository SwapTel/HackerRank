import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Kangaroo {
public static class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        String yes = "YES";
        String no = "NO";
        int pos1=x1;
        int pos2=x2;
        int flag=-1;

        while(pos1<=1000000000 && pos2<=1000000000){
            if(pos1==pos2){
                flag=1;
                break;

            }
                
            else{
                pos1=pos1+v1;
                pos2=pos2+v2;
            }
    
        }
       
        /*int flag = -1;
        if(x2>x1 && v2>v1){
            flag=0;
        }
            
        else if((x2+v2)%(x1+v1)==0)
           flag=1;*/

        if(flag==1)
            return "YES";
        else
            return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

}