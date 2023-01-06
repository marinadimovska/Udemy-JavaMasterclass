import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductLoader1 implements ImportData {

    final String FILE_NAME = "salesproducts1";
    private int getNumberOfRows() throws IOException {
        try {
            int getNumberRows = 0;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                getNumberRows++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return getNumberOfRows();
    }
    @Override
    public Object[] importDataFromFile() throws IOException {
        ArrayList<String> electronics;
        ArrayList<String> books;
        Product[] products;
        try {
            //Object[] obj = new Object[getNumberOfRows()];
            int electronicsCount = 0;
            int productsCount = 0;
            products = new Product[getNumberOfRows()];
            Product product = products[productsCount];
            //Electronics[] electronics = new Electronics[electronicsCount];
            electronics = new ArrayList<String>();
            books = new ArrayList<String>();

            BufferedReader bufferedReader = null;
            bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
            String currentLine;

            //(line = bufferedReader.readLine()) != null
            //int i = 1; i < obj.length ; i++
            if ((currentLine = bufferedReader.readLine()) != null) {
                if (currentLine.charAt(0) == 1) {
                    electronics.add(currentLine);
                } else {
                    books.add(currentLine);
                }
                productsCount++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new ArrayList[]{electronics, books};
    }
}


