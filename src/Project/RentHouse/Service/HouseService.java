package Project.RentHouse.Service;

import Project.RentHouse.Domain.House;


/**
 * 定义House[], 保存House对象
 * 响应HouseView的调用
 * 完成对房屋信息的操作（增删改查）
 */

public class HouseService {
    private House[] houses;
    private int houseNums = 0; //记录当前房屋数量

    public HouseService (int size) { //创建数组的时候指定大小
        houses = new House[size];
    }

    //add方法，添加新对象，返回Boolean
    public boolean add(House newHouse) {
        if (houseNums > houses.length) {
            System.out.println("数组已满，不能再添加");
            return false;
        }
        //加入newHouse信息
        houses[houseNums++] = newHouse;
        //设置id自增机制
        newHouse.setId(++idCounter);
        return true;
    }

    //返回房屋信息的方法
    public House[] list() {
        return houses;
    }
}
