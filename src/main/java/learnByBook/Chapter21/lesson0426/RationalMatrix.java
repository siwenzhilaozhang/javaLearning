package learnByBook.Chapter21.lesson0426;

import learnByBook.Chapter11.lesson0422.Rational;

/**
 * Created by xin14.zhang on 2018/4/26.
 */
public class RationalMatrix extends GenericMatrix<Rational> {
    protected Rational add(Rational r1,Rational r2){
        return r1.add(r2);
    }
    protected Rational multiply(Rational r1,Rational r2){
        return r1.multiply(r2);
    }
    protected Rational zero(){
        return new Rational(0,1);
    }
}
