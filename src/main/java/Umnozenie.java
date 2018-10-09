/**
 * Created by Anna Karetina on 08.10.2018.
 */

//операция умножения, наследуем класс Chisla
public class Umnozenie extends Operation{

    @Override
    public String getOperator() {
        return "*";
    }

    @Override
    public double calculateResult() {
        return getA()*getB();
    }
}