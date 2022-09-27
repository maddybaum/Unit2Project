import java.util.ArrayList;
import java.util.Arrays;
public class Sep26Challenge {

    public int[] numbers = new int[8];
    int index = 0;
    public void add(int newNum){

        if(numbers.length < 8){
            numbers[index] = newNum;
            index++;
        }

    }
    public int[] returnArray(){
        System.out.println(numbers);
    }
}
