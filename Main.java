public class Main {
    public static void main(String[] args) {
        
        int[][] example1 = {
            {10, 50, 40},
            {20, 40, 20},
            {30, 50, 30}
        };
        Data data1 = new Data(example1);
        System.out.println(data1.countIncreasingCols());
        
        
        
        int[][] example2 = {
            {10, 540, 440, 440},
            {220, 450, 440, 190}
        };
        Data data2 = new Data(example2);
        System.out.println(data2.countIncreasingCols());
        
        
        
        Data data3 = new Data(3, 4);
        data3.repopulate();
        
        System.out.println(data3);
    }
}