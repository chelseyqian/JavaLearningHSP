public class EightQueen {
    public static void main(String[] args) {
        //生成棋盘，用0表示每个位置的初始值
        int[][] map = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                map[i][j] = 0;
            }
            System.out.println();
        }
    }
}

class Queen {
    //用i表示行，用j表示列，用num表示已经下的棋子数
    public boolean assign(int[][] map, int i, int j, int num) {
        if (num == 8) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 1;
                i++;
                num+=1;

            }
        }
    }
}
