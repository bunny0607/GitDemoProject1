import java.util.HashMap;
import java.util.Map;
public class ArrayPairSum {

	public static void main(String[] args) {        

	    int []a = {2,45,7,3,-7,5,1,8,17,9,5};
	    printSumPairs(a,10);        

	}

	public static void printSumPairs(int []input, int k){
	    Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
	   
	    for(int i=0;i<input.length;i++){

	        if(pairs.containsKey(input[i]))
	            System.out.println(input[i] +", "+ pairs.get(input[i]));
	        else
	            pairs.put(k-input[i], input[i]);
	    }

	}
}


