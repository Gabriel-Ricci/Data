import java.util.Random;

public class Data {
    public static final int MAX = 1000; 
    private int[][] grid;
    
    
    public Data(int rows, int cols) {
        grid = new int[rows][cols];
    }
    
    
    public Data(int[][] initialGrid) {
        grid = initialGrid;
    }
    
    
    public void repopulate() {
        Random rand = new Random();
        
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                
                
                int value;
                do {
                    
                    value = (rand.nextInt(MAX / 10) + 1) * 10;
                } while (value % 100 == 0);
                
                grid[r][c] = value;
            }
        }
    }
    
    
    public int countIncreasingCols() {
        int count = 0;
        
        for (int c = 0; c < grid[0].length; c++) {
            boolean isIncreasing = true;
            
            for (int r = 1; r < grid.length; r++) {
                if (grid[r][c] < grid[r-1][c]) {
                    isIncreasing = false;
                    break;
                }
            }
            
            if (isIncreasing) {
                count++;
            }
        }
        
        return count;
    }
    
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                sb.append(grid[r][c] + "\t");
            }
            sb.append("\n");
        }
        
        return sb.toString();
    }
}

