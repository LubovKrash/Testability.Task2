public class BmiService {
    public int calculate(double weight, double height) {
        return (int) (weight / (height * height));
    }

}
