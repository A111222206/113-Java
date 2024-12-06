public class UncheckedException {
    public static void main(String[] args) {
        int[] mumbers = {1, 2, 3};
        try{
            System.out.println(mumbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("處理未檢例外：" + e.getMessage());
        }
    }
}
