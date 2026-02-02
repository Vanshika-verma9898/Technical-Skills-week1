package TechnicalSkills;
import java.util.Scanner;

public class Eqilibrium_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,-1,2,-1,1,2,1};
        int N = arr.length;
        int pf[] = new int[arr.length];
        
        // create prefix array
        pf[0] = arr[0];
        
        for(int i=1; i<N; i++){
            pf[i] = arr[i] + pf[i-1];
        }
        
        // create a counter to count Equilibrium index
        int count = 0;
        
        int leftSum, rightSum = 0;
        for(int i=0; i<pf.length; i++){
            if(i == 0){
                leftSum = 0;
            }else{
                leftSum = pf[i-1];
            }
            
            rightSum = pf[N-1] - pf[i];
            
            if(leftSum == rightSum){
                count++;
            }
        }
        System.out.println("Total Equilibrium Index = "+count);
    }
}
