package learnByBook.Chapter10.lesson0421;

/**
 * Created by xin14.zhang on 2018/4/21.
 */
public class GenericSort {
    public static void main(String[] args) {
        Integer[] intArray = {new Integer(2),new Integer(4),new Integer(3)};
        Double[] doubleArray = {new Double(3.4),new Double(1.3),new Double(-22.1)};
        Character[] charArray = {new Character('a'),new Character('J'),new Character('r')};
        String[] stringArray = {"Tom","John","Fred"};
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);
        System.out.print("Sorted Integer objects: ");
        printList(intArray);
        System.out.print("Sorted Double objects: ");
        printList(doubleArray);
        System.out.print("Sorted Character objects: ");
        printList(charArray);
        System.out.print("Sorted String objects: ");
        printList(stringArray);
    }
    public static void sort(Object[] list){
        Object currentMax;
        int currentMaxIndex;
        for(int i=list.length-1;i>=1;i--){
            currentMax = list[i];
            currentMaxIndex = i;
            for (int j = i-1;j>=0;j--){
                if(((Comparable)currentMax).compareTo(list[j])<0){
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex!=i){
                list[currentMaxIndex]=list[i];
                list[i]=currentMax;
            }
        }
    }
    public static void printList(Object[] list){
        for (int i = 0;i<list.length;i++)
            System.out.print(list[i]+" ");
        System.out.println();
    }
}
