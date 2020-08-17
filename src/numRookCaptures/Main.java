package numRookCaptures;

public class Main {
    public static void main(String[] args){
        char[] one = {'.','.','.','.','.','.','.','.'};
        char[] two = {'p','.','.','p','.','.','.','p'};
        char[] three = {'p','p','.','.','.','.','p','p'};
        char[] four = {'p','p','p','.','R','p','p','p'};
        char[] five = {'p','p','.','.','.','.','p','p'};
        char[] six = {'p','.','.','p','.','.','.','p'};
        char[] seven = {'.','.','.','.','.','.','.','.'};
        char[] eight = {'.','.','.','.','.','.','.','.'};
        char[][] board = new char[8][8];
        board[0]=one;
        board[1]=two;
        board[2]=three;
        board[3]=four;
        board[4]=five;
        board[5]=six;
        board[6]=seven;
        board[7]=eight;

        int i = new Solution().numRookCaptures(board);
        System.out.println(i);
    }
}