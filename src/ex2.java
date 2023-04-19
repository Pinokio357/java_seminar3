import java.util.ArrayList;
import java.util.Random;

public class ex2 {
    public static void main(String[] args){
        ArrayList<Integer> my_list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            my_list.add(i, rand.nextInt(30));

        }
        System.out.println(my_list);
        for (int i = 0; i < my_list.size(); i++) {
            if(my_list.get(i)%2==0){
                my_list.remove(i);
                i--;

            }

        }
        System.out.println(my_list);
    }
}
