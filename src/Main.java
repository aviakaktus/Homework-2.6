import java.util.*;

public class Main {

    private static List<Integer> nums = new ArrayList<>(List.of(1,1,2,3,4,4,5,5,6,7));

    private static List<String> words = new ArrayList<>(List.of(
            "AUDI", "KIA", "RENAULT", "SUBARU", "OPEL", "AUDI","LADA","NISSAN","HYUNDAI","KIA"));


    public static void main(String[] args) {
    /* Задача 1
    Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
    Код должен работать с любой последовательностью и объемом списка чисел.*/
        for (int num: nums) {
            if (num%2 != 0){
                System.out.print(num+ " ");
            }
        }
        System.out.println();

    /* Задача 2
    Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
     */
        Collections.sort(nums);
        int predNum = Integer.MIN_VALUE;
        for (int num: nums) {
            if (num%2 == 0 && num != predNum){
                System.out.print(num + " ");
                predNum = num;
            }
        }
        System.out.println();
    /* Задача 3
    Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
     */
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);

    /* Задача 4
    Напишите код, который выводит в консоль все количество дублей из списка слов.
     */
        Set<String> uniqueWords2 = new HashSet<>(words);
        System.out.println(words.size()-uniqueWords2.size());
    }
}