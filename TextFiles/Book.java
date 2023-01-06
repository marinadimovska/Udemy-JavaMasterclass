import java.util.Scanner;

public class Book extends Product{
    private String author;
    private String title;

    public Book(String inventoryNumber, double price, int quantity, String provider) {
        super(inventoryNumber, price, quantity, provider);
    }

    @Override
    double getPromotionalPrice() {
        double promo = getPrice() - getPrice()*0.1;
        return promo;
    }
    //TODO
    @Override
    boolean sellProduct(int piece) throws NoMoreProductsException {
        if(getQuantity()>piece){
            Scanner scanner = new Scanner(System.in);
            piece = scanner.nextInt();
            // piece = Integer.parseInt(scanner.next())
            double remain = getQuantity() - piece ;
            return true;

        }
        else{
            throw new NoMoreProductsException();
        }

    }

}
