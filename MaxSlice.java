import java.util.Arrays;

public class MaxSlice{

    // Maximum slice

    public static void main(String [] args ){
    
        int[] A = {-5,5,2,7,-8,1000};

        System.out.println("Array: " + Arrays.toString(A) + " maxS " + solution(A));
    } 
    
    // Functions
    public static int solution(int [] A){
        
        // Constant sand variables
        int iSlice = 0;
        int iMaxSlice = 0;
    
        for(int x : A){
            iSlice = Math.max(0, (iSlice + x));
            iMaxSlice = Math.max(iSlice, iMaxSlice);
        }
        
    return iMaxSlice;
    }

}