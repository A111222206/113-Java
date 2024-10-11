public class XY {
    public static void main(String[] args) {
        int[][] cords = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for(var x = 0; x < cords.length; x++) {            //巡行二維陣列 , x 是列數
            for(var y = 0; y < cords[x].length; y++) {     //巡行二維陣列 , y 是行數 , cords[x] 是第x列的陣列
                System.out.printf("%2d", cords[x][y]);
            }
            System.out.println();
        }
    }
} 
