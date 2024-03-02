//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 55;
        double height = 1.62;
        int bodyIndex = (int) service.calculate(weight, height);
        System.out.println(bodyIndex);
    }
}