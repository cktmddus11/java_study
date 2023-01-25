package effectiveJava.chapter5.item26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Item26Main {
    public static void main(String[] args){
        // ��� ��ü�� ����Ѵٴ� �ǹ̷� Object�� �ͽ���.
        List<Object> objectList = new ArrayList<>();
        List list = new ArrayList();
        List<String> stringList = new ArrayList<>();

       //unsafeAdd(stringList, Integer.valueOf(42));
        safeAdd(stringList, Integer.valueOf(42));

        String s = stringList.get(0); // java.lang.Integer cannot be cast to java.lang.String
        System.out.println(s);

        //��Ÿ�� ����
        Object[] objectArray = new Long[1];// ArrayStoreException
        objectArray[0] = "Ÿ��";

       // int num = numElementsInCommon(s1, s2);
    }
  /*  private static void unsafeAdd(List list, Object o){
        list.add(o); // Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
    }*/
  /*private static void unsafeAdd(List<Object> list, Object o){
      list.add(o); // Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
  }*/
  private static void safeAdd(List<String> list, Object o){
      list.add(o.toString());
  }
 /* private static int numElementsInCommon(Set s1, Set s2){ // Raw use of parameterized class 'Set'
      int result = 0;
      for(Object o1 : s1){
          if(s2.contains(s1)){
              result++;
          }
      }
      return result;
  }*/ // ���ϵ� Ÿ�� ����ǥ�� �������.
    private static int numElementsInCommon(Set<?> s1, Set<?> s2){ // Raw use of parameterized class 'Set'
        int result = 0;
        for(Object o1 : s1){
            if(s2.contains(s1)){
                result++;
            }
        }
        return result;
    }

}
