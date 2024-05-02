//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator(new AddOperation());

        System.out.println(calculator.calculate(10, 3));
        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(10, 3));
    }
}