package javaStudy.collectionEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// List�������̽� : �迭�� ���� ������ ���� 
		list.add("A");
		list.add("B");
		list.add("C");
		int i = 0;
		System.out.print("List1: ");
		for(String tempData : list) {
			System.out.print(tempData+",");
		}
		System.out.println();
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("0");
		list2.addAll(list);//0ABC
		i = 0;
		System.out.print("List2: ");
		for(String tempData : list2) {
			System.out.print(tempData);
		}
		System.out.println();
		ArrayList<String> list3 = list;
		list.add("Oops");
		System.out.print("List3: ");
		for(String tempData : list3) {
			System.out.print(tempData);
		}
		System.out.println();
		System.out.println("list1�� ���� :"+list.size());

		
		System.out.println("=====�ݺ��ڷ� �б�=======");
		
		// �ݺ��� Iterator ����ؼ� ���� ����
		Iterator iterator = list.iterator(); // �ݺ��� ��ü ���
		String s  = null;
		
		while(iterator.hasNext()) { // ���� �湮���� ���� ���Ұ� ������ true�� ��ȯ
			 s = (String) iterator.next();
			 System.out.print(s+",");
			
		}
		String a = list.get(1);
		
		
		
	}

}
