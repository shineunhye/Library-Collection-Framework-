/*
 * �÷��� �����ӿ�ũ (Collection Framework)
 * 
 * -�迭 ������
 * 	: 1) ������ �� �ִ� ��ü���� �迭�� ������ �� ������. 
 * 		��Ư�� �ټ��� ��ü�� �����ϱ⿡�� ������ ��.
 * 	  2) ��ü �������� �� �ش� �ε����� ��Ե�.
 * 		��ü�����Ϸ��� ��� ����ִ��� Ȯ���ؾ���.
 * 
 * -�÷��� �����ӿ�ũ
 * 	: ��ü���� ȿ�������� �߰�,����,�˻��� �� �ֵ��� �����Ǵ� �÷��� ���̺귯��.
 * 		�������̽��� ���ؼ� ����ȭ�� ������� �پ��� �÷��� Ŭ���� �̿�.
 * 	-�÷����� ���׸�(Generic)������� ������.
 * 	-���׸� : Ư�� Ÿ�Ը� �ٷ��� �ʰ�, ���� ������ Ÿ������ ������ �� �ֵ��� Ŭ������ �޼ҵ带 �Ϲ�ȭ��Ű�� ���.
 * 			- <E>,<K>,<V> : Ÿ�� �Ű� ����(��� Ÿ���� �Ϲ�ȭ�� Ÿ��)
 * 			-��) ���׸� ���� : Vector<E>
 * 					E�� Ư�� Ÿ������ ��üȭ, 
 * 					������ �ٷ�� ���� Vector<Integer>
 * 					���ڿ��� �ٷ�� ���� Vector<String>
 * 	
 * 	-�÷��� Ŭ����
 * 		List	set		Map ==> �������̽�
 * 		List => ArrayList,Vector,LinkedList,Que,Stack
 * 				================
 * 			=������ �����ϰ� �ִ�.(�� �����͸��� index�� ������ ����)
 * 			=�ߺ�����Ѵ�.
 * 			=�����ͺ��̽� ���α׷�.
 * 
 * 		Set	=> TreeSet, HashSet
 * 			=������ ����.
 * 			=�ߺ�������� �ʴ´�.
 * 			=XML ���α׷�.
 * 
 * 		Map => Hashtable, HashMap
 * 			=������ �ִ�.
 * 			=�ߺ����(Value), �ߺ�������� ����(Key)
 * 			=Key,Value�� ���ÿ� ����
 * 			=Ŭ���� ����, �����ȣ...(Spring)
 * 			=������(MapReduce)
 * 			 ��==>
 * 				a.jsp ==> b.jsp : id,pwd
 * 				b.jsp?id=aaa&pwd=1234
 * 				�Ϲ� ���α׷�=> �����͸� �����Ҷ� �޼ҵ��� �Ű�����
 * 
 * 	-ArrayList => Ŭ������ ������ ����.(����� ����,���̺귯��)
 * 		=add(��ü��) ����(�ڿ� �ٴ´�)
 * 		 add(index,��ü��) (���ϴ� ��ġ�� ����)
 * 		 INSERT INTO ~~
 * 			insert()
 * 		=remove(intdex) => ������ ����
 * 		 DELETE ~ SET
 * 			delete()
 * 		=set(index,��ü��) => ������ ����
 * 		 UPDATE ~ SET
 * 			update()
 * 		=get(index) => ������ �˻�
 * 		 SELECT ~ FROM
 * 			find()
 * 		=size() => ����Ǿ��ִ� ������ ����
 * 		 SELECT COUNT(*) FROM ~
 * 			count()
 * 
 * 		A a=new A();
 * 		add(a)
 * 		======
 * 		 a =====> 100
 * 		===
 * 		 0
 * 	
 * 		A b=new A();
 * 		add(b)
 * 		======  ======
 * 		  a       b
 * 		======  ======
 * 		  0       1
 * 
 * 		A c=new A();
 * 		add(1,c)
 * 		======== ======== ========
 * 			a		c		b
 * 		======== ======== ========
 * 			0		1		2
 * 
 * 		remove(1)
 * 		========= =========
 * 			a		  b
 * 		========= =========
 * 			0		  1
 */
import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		//Integer i=10;
		list.add(10);	//Integer	==>0
		list.add(15.5);	//Double	==>2
		list.add("�̼���");	//String ==>3
		list.add(1,'A');	//==>1
		
		System.out.println("���尹��:"+list.size());
		
		int a=(int) list.get(0);
		char b=(char) list.get(1);
		double c=(double) list.get(2);
		String d=(String) list.get(3);
		
		System.out.println("Index:0=>"+a);
		System.out.println("Index:1=>"+b);
		System.out.println("Index:2=>"+c);
		System.out.println("Index:3=>"+d);
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		ArrayList<String> list2=new ArrayList<>();
		//Object => String
		list2.add("�̹��");	//0
		list2.add("�Ϸ�");	//1
		list2.add("�ξ�");	//2
		list2.add("�ֿ�");	//3
		list2.add("������");	//4
		
		for(int i=0; i<list2.size(); i++){
			String name=list2.get(i);
			System.out.println("index:"+i+"=>"+name);
		}
		
		//for-each(�迭,�÷���)
		for(String name : list2){
			System.out.println(name);
		}
	}
}


























