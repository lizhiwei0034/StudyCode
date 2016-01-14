package com.lzw.learn._01Abstract;
/**
 * 接口的多实现
 * @author 志伟
 *
 */
//定义个接口
interface inter1{
	//定义个全局静态变量(记住 通常全局变量用大些来命名)
	public static final int AGE=10;
	//定义一个抽象方法
	public abstract void tell();
}
//定义个接口
interface inter2{
	//定义个全局静态变量(记住 通常全局变量用大些来命名)
	public static final String  Name="lizhiwei";
	//定义一个抽象方法
	public abstract void say();
}
//定义个抽象类
abstract class absclass{
 public	abstract  void absvoid();
}

//只能通过子类去实现
 class people implements inter1{
	 //子类中必须重写接口中定义的抽象方法
	 @Override
	public void tell() {
		
	}
 }
 //一个子类可以实现多个接口
 class students implements inter1,inter2{
	 //接口的多实现：必须将多个接口中定义的抽象方法重写
	 @Override
	public void tell() {
		 System.out.println("这里重写了tell方法");	
	}
	 @Override
	public void say() {
		 System.out.println("这里重写了say方法");
	}
 }
 //一个类既继承抽象类、又实现接口
 class abs_inter extends absclass implements inter1{
	 //重写接口inter1中的方法
	@Override
	public void tell() {
		
	} 
	//重写absclass中的抽象方法
	@Override
	public void absvoid() {
		
	}
 }
 //5 接口不能继承抽象类
 //interface newinter extends absclass{}
 //但是却可以通过extends 继承多个接口，实现多接口的多继承
 interface inters extends inter1,inter2{
	 //定义一个新的抽象方法
	 public abstract void newAbsVoid();
 }
 //定义一个新的子类来实现上上面的接口
 class sonClsssImpl implements inters{
	 //重写inter1中的方法 tell()
	 @Override
		public void tell() {
			System.out.println("我是通过多接口sonClsssImpl继承自接口inter1中的抽象方法tell（）的重写方法");
		}
	 //重写inter2中的方法
	 @Override
	public void say() {
		 System.out.println("我是通过多接口继承自接口inter2中的抽象方法say（）的重写方法");

	}
	 //重写inters中的方法
	 @Override
	public void newAbsVoid() {
		System.out.println("我是接口sonClsssImpl中新定义的抽象方法newAbsVoid9()的重方法");
	}
 } 
public class Abstract02 {

	public static void main(String[] args) {
		//1： 接口不能被实例化,必须通过实例化子类去使用
		//inter1 i=new inter1();
		students s=new students();
		//使用子类中重写的方法
		s.tell();
		s.say();
		//这里使用接口中定义的全局变量，可以直接使用接口去调用该变量 inter1.AGE 
		System.out.println(inter1.AGE);
		
		//实例化一个新的子类
		sonClsssImpl son=new sonClsssImpl();
		son.tell();
		son.say();
		son.newAbsVoid();
	}

}
