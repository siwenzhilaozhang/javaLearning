package Practice0606;

import java.util.*;

//实现一个方法，接受一个入参，是一个list，方法返回一个入参list倒叙，不改变原list的值和顺序
public class Practice0606 {
    public static void main(String[] args) {
        List<Integer> listTest = new LinkedList<Integer>();
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        Output(listTest);

        List<Integer> listResult = List0606(listTest);
        Output(listResult);
    }
//对输入List进行倒排序，并返回
    public static List<Integer> List0606(List<Integer> list){
        List<Integer> listTarget = new LinkedList<Integer>();
        int num = list.size();
        for (int j=0;j<num;j++){
            listTarget.add(list.get(num-1-j));
        }
    return listTarget;
    }
    //输出List
    public static void Output(List<Integer> list01){
        for (int i=0;i<list01.size();i++){
            System.out.print(list01.get(i)+"  ");
    }
        System.out.println();
    }
}
