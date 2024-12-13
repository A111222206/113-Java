```java
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Print the ArrayList
        System.out.println("ArrayList: " + list);

        // 取得 ArrayList 的大小
        String fruit = list.get(1);
        System.out.println("Element at index 1: " + fruit);

        //取得特定元素
        int index = list.indexOf("Banana");
        System.out.println("Index of Banana: " + index);

        // 檢查 ArrayList 是否包含某個元素
        boolean hasMango = list.contains("Mango");
        System.out.println("ArrayList contains Mango: " + hasMango);

        // 修改 ArrayList 的元素
        list.set(1, "Mango");
        System.out.println("ArrayList after modification: " + list);

        // 刪除 ArrayList 的元素
        list.remove("Banana");
        System.out.println("ArrayList after removal: " + list);

        // Iterate over the ArrayList
        System.out.println("Iterating over ArrayList:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
