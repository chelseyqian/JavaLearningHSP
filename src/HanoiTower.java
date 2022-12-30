public class HanoiTower {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(5, 'A', 'B', 'C');
    }
}

class Tower {
    //num表示要移动的盘的个数，a，b，c是三个塔
    public void move(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            //如果有多个盘，可以看成两个，最下面的和上面的num-1
            //先借助c，把上面的盘移到b
            move(num-1, a, c, b);
            //把最下面的盘移到c
            System.out.println(a + "->" + c);
            //再借助a把b塔的所有盘移到c
            move(num-1, b, a, c);
        }
    }
}
