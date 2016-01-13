package com.lzw.learn._02AbstractClass;


/**
 * ���󷽷���ʹ��
 * 
 * @author mysti_000
 *
 */
// ����һ�������� ��
abstract class Person {
	// �����˵Ļ�����������
	private String name;
	private int age;

	// ���һ�����췽�����ڴ�����
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	// GET/SET����
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// ����һ�����󷽷�
	public abstract void show();

}

// ����һ��ѧ���࣬�̳�����
class Student extends Person {
	// ��Ϊѧ�����ɼ��������е�����
	private int score;

	// ����̳��˸���preson ���������й��췽�������������Ҫ�й��췽��
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	// get/set
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// ʵ��show����
	public void show() {
		System.out.println("������" + getName() + " ���䣺" + getAge() + " �ɼ���" + getScore());
	}

}
//����һ�������� Ҳ�̳���person��
class Worker extends Person{
	//���幤�����е�����
	private int money ;
	//�������й��췽����������ҲҪ��
	public Worker(String name,int age,int money){
		super(name, age);
		this.money=money;
	}
	//get/set
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	//����������ʾ�����еĳ��󷽷�
	public void show() {
		System.out.println("������"+getName()+" ����:"+getAge()+" ����:"+getMoney());
	}
}
public class AbstractClass01 {

	public static void main(String[] args) {
		//ʵ����ѧ��
		Student s =new Student("��־ΰ", 24, 10000);
		s.show();
		//ʵ��������
		Worker w=new Worker("��ˬ", 23, 8000);
		w.show();
	}

}
