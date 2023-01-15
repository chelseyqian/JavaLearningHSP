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
    private int idCounter = 0; //记录当前的id

    public HouseService (int size) { //创建数组的时候指定大小
        houses = new House[size];
    }

    //add方法，添加新对象，返回Boolean
    public boolean add(House newHouse) {
        if (houseNums == houses.length) {
            //数组扩容
            House[] temp = new House[houseNums+1];
            for (int i = 0; i < houseNums; i++) {
                temp[i] = houses[i];
            }
            houses = temp;
        }
        //加入newHouse信息
        houses[houseNums++] = newHouse;
        //设置id自增机制
        newHouse.setId(++idCounter);
        return true;
    }

    public boolean del(int id) {
        //要先找到id对应的下标，因为下标是从0开始的
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (id == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = 0; i < houseNums - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[houseNums-1] = null;
        houseNums--;
        //前面两行可以合并成houses[--houseNums] = null;
        return true;
    }

    //根据id查找房屋
    public House findById(int id) {
        for (int i = 0; i < houseNums; i++) {
            if (id == houses[i].getId()) {
                return houses[i];
            }
        }
        //如果没有查找到
        return null;
    }

    //返回房屋信息的方法
    public House[] list() {
        return houses;
    }
}
