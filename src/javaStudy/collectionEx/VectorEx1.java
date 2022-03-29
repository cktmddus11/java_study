package javaStudy.collectionEx;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		// object���� ���  �ڷ����� ���°� �ڽĿ��� �θ� Ÿ��(Object)Ÿ������ �ڵ� ����ȯ �Ȱ�
		  v.add("�ȳ��ϼ���");
	      v.add(new Integer(20));
	      v.add(400);
	      
	      System.out.println("vector size : " + v.size());

	        for (int i = 0; i < v.size(); i++) {
	            System.out.println("vector element " + i + " : " + v.get(i));
	        }

	      int s = (int) v.get(1); //���� �� ����ȯ �ʼ� !

	}

}
