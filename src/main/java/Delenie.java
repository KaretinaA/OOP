/**
 * Created by Anna Karetina on 08.10.2018.
 */

//операция деления, наследуем класс Operation
public class Delenie extends Operation{

    @Override
    public String getOperator() {
        return "/";
    }

    @Override
    public double calculateResult() {
        return getA() / getB();


    }
}