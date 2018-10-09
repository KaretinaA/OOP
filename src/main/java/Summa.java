/**
 * Created by Anna Karetina 07.10.2018.
 */

//операция сложения, наследуем класс Chisla
public class Summa extends Operation{

    @Override
    public String getOperator() {
        return "+";
    }

    @Override
    public double calculateResult() {
        return getA()+getB();
    }
}
