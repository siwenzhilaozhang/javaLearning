package learnByBook.Chapter21.lesson0426;

/**
 * Created by xin14.zhang on 2018/4/26.
 */
public class IntegerMatrix extends GenericMatrix<Integer> {
    protected Integer add(Integer o1,Integer o2){
        return o1+o2;
    }
    protected Integer multiply(Integer o1,Integer o2){
        return o1*o2;
    }
    protected Integer zero(){
        return 0;
    }
}
