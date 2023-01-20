package Chapter10.InterfaceIntroduce;

public class Computer {
    //计算机工作的方法
    public void work(UsbInterface usbInterface) {
        usbInterface.start();
        usbInterface.stop();
    }
}
