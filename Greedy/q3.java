import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class q3 {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("the notes /  coins used " +ans+  "and the number of notes used" +countOfCoins);

    }
}
