import java.util.ArrayList;
import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> my_list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            my_list.add(i, rand.nextInt(30));
        }
        System.out.println(my_list);
        int max = my_list.get(0);
        int min = my_list.get(0);
        Double sum = 0.0;
        for (int i = 0; i < my_list.size(); i++) {
            sum += my_list.get(i);
            if(my_list.get(i) > max){
                max = my_list.get(i);
            }
            if(my_list.get(i) < min){
                min = my_list.get(i);
            }
            
            
        }
        Double sredne = sum/my_list.size();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное число: "+ max);
        System.out.println("Среднее арифметическое из списка: " + sredne);

    }
}
