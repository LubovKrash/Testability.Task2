public class BmiService {
    public double calculate(double weight, double height) {
        return (int) weight / (height * height);
    }

}
