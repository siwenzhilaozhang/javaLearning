package learnByBook.Chapter7.lesson0319;

/**
 * Created by xin14.zhang on 2018/3/19.
 */
//不可变对象和类
public class L709 {
    private int id;
    private BirthDate birthDate;    //声明BirthDate类的引用变量birthDate？？？
    public L709(int ssn, int year, int month, int day){
        id = ssn;
        birthDate = new BirthDate(year,month,day);
    }
    public int getId(){
        return id;
    }
    public BirthDate getBirthDate(){    //获取的是哪里的值？
        return birthDate;
    }
}
class BirthDate{
    private int year;
    private int month;
    private int day;
    public BirthDate(int newYear,int newMonth,int newDay){
        year = newYear;
        month = newMonth;
        day = newDay;
    }
    public void setYear(int newYear){
        year=newYear;
    }
}
