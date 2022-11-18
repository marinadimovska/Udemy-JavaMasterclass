public class areaCalculator {
    public static void main(String[] args) {
        System.out.println(AreaCalculator(3.23));
        System.out.println(AreaCalculator(2,3));

    }
    private static double AreaCalculator(double radius){
        boolean isNegative = radius < 0;
        if(isNegative){
            return -1;
        }
        else{
            double area = radius * radius;
            return area;
        }
    }
    private static double AreaCalculator(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }
        else{
            double area = x * y;
            return area;
        }
    }
}
