public class Shift {
    public static void main(String[] args) {
        int number = 1; 
        System.out.printf( "2 的 0 次方: %d%n", number); 
        System.out.printf( "2 的 1 次方: %d%n", number << 1); 
        System.out.printf( "2 的 2 次方: %d%n", number << 2); 
        System.out.printf( "2 的 3 次方: %d%n", number << 3); 
    }
}

// 2 -> 00000010
// 2 << 1 -> 00000100 =4
//往左一個位元等於原本的數字X2
//往左幾個位元就是乘上2的幾次方