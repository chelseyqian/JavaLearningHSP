public class MiGong {
    public static void main(String[] args) {

        //创建一个八行七列的迷宫，用0表示可以走的路，1表示障碍物
        int[][] map = new int[8][7];
        //把第一行和最后一行设为障碍物
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //把第一列和最后一列设为障碍物
        for (int j = 0; j < 8; j++) {
            map[j][0] = 1;
            map[j][6] = 1;
        }

        //把第三行的第一和第二个0设为障碍物
        map[3][1] = 1;
        map[3][2] = 1;

        //输出地图
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        Go go = new Go();
        go.findWay(map, 1, 1);

        System.out.println("找到路的地图如下：");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}

class Go {

    /*
    找路的方法
    找到就返回true，反之返回false
    用i，j表示老鼠的位置，初始值为1，1
    0表示路，1表示障碍，2表示可以走痛，3表示走不通
    当位置为6，5时，说明到出口，结束
    确定找路的策略：下右上左
     */
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                //假定能走通
                map[i][j] = 2;
                //按照下右上左，判断是否真的能走
                if (findWay(map, i+1, j)) {
                    return true;
                } else if (findWay(map, i, j+1)) {
                    return true;
                } else if (findWay(map, i-1, j)) {
                    return true;
                } else if (findWay(map, i, j-1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }

            } else {
                return false;
            }
        }
    }

}
