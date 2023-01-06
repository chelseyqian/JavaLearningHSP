package Project.RentHouse.View;

import Project.RentHouse.Domain.House;
import Project.RentHouse.Service.HouseService;
import Project.RentHouse.Utils.Utility;

/**
 * 1. 显示界面
 * 2. 接收用户输入
 * 3. 调用HouseService类完成对房屋信息的操作
 */

public class HouseView {
    private boolean loop =true; //控制显示菜单
    private char key = ' '; //接收用户输入
    private HouseService houseService = new HouseService(10); //设置数组大小为10

    //接收输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("--------房屋列表--------");
        System.out.print("姓名");
        String name = Utility.readString(8);
        System.out.print("电话");
        String phone = Utility.readString(12);
        System.out.print("地址");
        String address = Utility.readString(20);
        System.out.print("月租");
        int rent = Utility.readInt();
        System.out.print("状态");
        String state = Utility.readString(3);

        //创建一个新的House对象，id为系统分配，不能输入
        House house = new House(0, name, phone, address, rent, state);
    }

    //显示房屋列表的方法
    public void listHouses() {
        System.out.println("--------房屋列表--------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = houseService.list(); //得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                System.out.println(houses[i]);
            }
        }
        System.out.println();
    }

    //主菜单
    public void mainMenu() {
        do {
            System.out.println("--------房屋出租系统菜单--------");
            System.out.println("1 新增房源");
            System.out.println("2 查找房屋");
            System.out.println("3 删除房屋");
            System.out.println("4 修改房屋信息");
            System.out.println("5 房屋列表");
            System.out.println("6 退出");
            System.out.println("请输入你的选择（1-6）：");
            key = Utility.readChar();//工具类的方法

            switch (key) {
                case '1' :
                    System.out.println();
                    break;
                case '2' :
                    System.out.println();
                    break;
                case '3' :
                    System.out.println();
                    break;
                case '4' :
                    System.out.println();
                    break;
                case '5' :
                    listHouses();
                    break;
                case '6' :
                    System.out.println();
                    loop = false;
                    break;
            }

        } while (loop);
    }
}
