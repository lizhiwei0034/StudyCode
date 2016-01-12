package com.lzw.learn.AbstractClass;

//定义一个接口（其实是相当于一个操作规范，里面有一定的抽象方法）
interface USB {
	// 抽象方法1：开始方法
	void start();

	// 抽象方法2：结束方法
	void end();
}

// 定义一个U盘类，实现usb的使用
class UsebDisk implements USB {

	@Override
	public void start() {
		System.out.println("优盘开始工作");
	}

	@Override
	public void end() {
		System.out.println("优盘停止工作");
	}

}
//定义一个打印机
class Printer implements USB{
	@Override
	public void start() {
		System.out.println("开始打印");
	}
	@Override
	public void end() {
		System.out.println("停止打印");
	}
}
//定义一个计算机 
class Computer{
	//定义一个方法  参数为匿名对象（实现自接口USB的子类都可以）
	public static void work(USB u) {
		u.start();
		System.out.println("正在工作中。。。。。。");
		u.end();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		//实例化计算机		
		Computer.work(new UsebDisk());
		Computer.work(new Printer());
			
	}

}
