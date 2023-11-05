package day25_collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class C01Collections {
    //Collectionda size degistirebiliriz, Arrayde degistiremeyiz
    //Array primitive data kullanir yada reference of string, Collection non-pri kullanir
    //primitive data store etmek istersek wrapper class kullanmaliyiz

   /*
      1) ArrayLists and LinkedLists are child classes of List Interface
2) ArrayLists are successful in search operations , but
    LinkedLists are not successful in search operations
3)  LinkedLists are successful in adding and removing operations, but
     ArrayLists are not successful in those operations.
4)  LinkedLists have "node"s  not "elements"
     "Nodes" have two parts: i) data  ii) pointer(address)
     First node is pointed by "head" and "last node" (tail) points null.
    */
   public static void main(String[] args) {

      ArrayList<Integer> listArr =new ArrayList<>();

      LinkedList<Integer> myList = new LinkedList<>();

      myList.add(5);
     myList.add(1,8);
      myList.add(2,12); //8'i index1e eklememis olsaydik exception verirdi cunku index 2ye eklemeye calisiyor
      myList.addLast(7);
      System.out.println(myList);

      myList.remove();
      myList.remove((Integer) 12);
      System.out.println(myList);

      int removeNode = myList.removeFirst();
      System.out.println(removeNode);

      myList.add(34);
      myList.add(3);
      myList.add(4);
      myList.add(8);
      System.out.println(myList); //[7, 34, 3, 4, 8]

      LinkedList<Integer> list2 = new LinkedList<>();
      list2.add(8);
      list2.add(31);
      list2.add(34);

      myList.removeAll(list2);
      System.out.println(myList); //[7, 4]

      myList.add(10);
      myList.add(7);
      myList.add(10);
      myList.add(3);
      myList.add(10);

      System.out.println(myList);
      myList.removeFirstOccurrence(7);
      System.out.println(myList);
      myList.removeLastOccurrence(3);
      System.out.println(myList);





   }
}
