import java.util.Scanner;

public class Electronics extends Product{
    private String manufacturer;
    private String model;

    public Electronics(String inventoryNumber, double price, int quantity, String provider) {
        super(inventoryNumber, price, quantity, provider);
    }



    @Override
    double getPromotionalPrice() {
        double promo = getPrice() - getPrice()*0.5;
        System.out.println(promo);
        return 0;
    }
    @Override
    boolean sellProduct(int piece) throws NoMoreProductsException {
            if(getQuantity()>piece){
                Scanner scanner = new Scanner(System.in);
                piece = scanner.nextInt();
                // piece = Integer.parseInt(scanner.next());
                double remain = getQuantity() - piece;
                return true;
            }
            else{
                throw new NoMoreProductsException();
            }

    }
}
