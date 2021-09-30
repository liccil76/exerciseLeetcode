package rotate;

public class Solution2 {
    /**
     * 48. 旋转图像
     * @param matrix
     */
    //水平翻转 & 主对角线（左上到右下）翻转
    public void rotate(int[][] matrix) {
        int a = 0;
        int b = matrix.length-1;
        int len = matrix[0].length;
        //水平翻转
        while(a<b){
            for (int i = 0; i < len; i++) {
                matrix[a][i]=matrix[a][i]^matrix[b][i];
                matrix[b][i]=matrix[b][i]^matrix[a][i];
                matrix[a][i]=matrix[a][i]^matrix[b][i];
            }
            a++;
            b--;
        }
        //主对角线（左上到右下）翻转
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                int x = i;
                int y = len-j-1;
                matrix[x][y]=matrix[x][y]^matrix[y][x];
                matrix[y][x]=matrix[y][x]^matrix[x][y];
                matrix[x][y]=matrix[x][y]^matrix[y][x];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        new Solution2().rotate(matrix);
    }
}
