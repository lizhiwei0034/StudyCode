package com.lzw.learn._01Abstract;
/**
 * �ӿڵĶ�ʵ��
 * @author ־ΰ
 *
 */
//������ӿ�
interface inter1{
	//�����ȫ�־�̬����(��ס ͨ��ȫ�ֱ����ô�Щ������)
	public static final int AGE=10;
	//����һ�����󷽷�
	public abstract void tell();
}
//������ӿ�
interface inter2{
	//�����ȫ�־�̬����(��ס ͨ��ȫ�ֱ����ô�Щ������)
	public static final String  Name="lizhiwei";
	//����һ�����󷽷�
	public abstract void say();
}
//�����������
abstract class absclass{
 public	abstract  void absvoid();
}

//ֻ��ͨ������ȥʵ��
 class people implements inter1{
	 //�����б�����д�ӿ��ж���ĳ��󷽷�
	 @Override
	public void tell() {
		
	}
 }
 //һ���������ʵ�ֶ���ӿ�
 class students implements inter1,inter2{
	 //�ӿڵĶ�ʵ�֣����뽫����ӿ��ж���ĳ��󷽷���д
	 @Override
	public void tell() {
		 System.out.println("������д��tell����");	
	}
	 @Override
	public void say() {
		 System.out.println("������д��say����");
	}
 }
 //һ����ȼ̳г����ࡢ��ʵ�ֽӿ�
 class abs_inter extends absclass implements inter1{
	 //��д�ӿ�inter1�еķ���
	@Override
	public void tell() {
		
	} 
	//��дabsclass�еĳ��󷽷�
	@Override
	public void absvoid() {
		
	}
 }
 //5 �ӿڲ��ܼ̳г�����
 //interface newinter extends absclass{}
 //����ȴ����ͨ��extends �̳ж���ӿڣ�ʵ�ֶ�ӿڵĶ�̳�
 interface inters extends inter1,inter2{
	 //����һ���µĳ��󷽷�
	 public abstract void newAbsVoid();
 }
 //����һ���µ�������ʵ��������Ľӿ�
 class sonClsssImpl implements inters{
	 //��дinter1�еķ��� tell()
	 @Override
		public void tell() {
			System.out.println("����ͨ����ӿ�sonClsssImpl�̳��Խӿ�inter1�еĳ��󷽷�tell��������д����");
		}
	 //��дinter2�еķ���
	 @Override
	public void say() {
		 System.out.println("����ͨ����ӿڼ̳��Խӿ�inter2�еĳ��󷽷�say��������д����");

	}
	 //��дinters�еķ���
	 @Override
	public void newAbsVoid() {
		System.out.println("���ǽӿ�sonClsssImpl���¶���ĳ��󷽷�newAbsVoid9()���ط���");
	}
 } 
public class Abstract02 {

	public static void main(String[] args) {
		//1�� �ӿڲ��ܱ�ʵ����,����ͨ��ʵ��������ȥʹ��
		//inter1 i=new inter1();
		students s=new students();
		//ʹ����������д�ķ���
		s.tell();
		s.say();
		//����ʹ�ýӿ��ж����ȫ�ֱ���������ֱ��ʹ�ýӿ�ȥ���øñ��� inter1.AGE 
		System.out.println(inter1.AGE);
		
		//ʵ����һ���µ�����
		sonClsssImpl son=new sonClsssImpl();
		son.tell();
		son.say();
		son.newAbsVoid();
	}

}
