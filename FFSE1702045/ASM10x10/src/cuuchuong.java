import java.util.*;

public class cuuchuong {
   public static void main(String args[]) {
      // tao mot array list
      ArrayList al = new ArrayList();
      System.out.println("Size ban dau cua ArrayList la: " + al.size());

      // them cac phan tu toi array list
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");
      al.add(0, "A2");
      System.out.println("Size cua ArrayList sau khi them la: " + al.size());

      // display the array list
      System.out.println("Noi dung cua ArrayList la: " + al);
      // xoa cac phan tu tu array list
      al.remove("F");
      al.remove(2);
      System.out.println("Size cua ArrayList sau khi xoa la: " + al.size());
      System.out.println("Noi dung cua ArrayList la: " + al);
   }
}
