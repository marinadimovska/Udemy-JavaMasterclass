public class printEqual {
    public static void printEqual(int x, int y, int z){
        if(x < 0 || y < 0 || z < 0 ){
            System.out.println("Invalid Value!");
        }else{
            if(x == y & y == z & x == z){
                System.out.println("is Equal");
            }else if(x != y & y != z & x != z){
                System.out.println("all numbers are different");
            }else{
                System.out.println("Neither all are equal or different");
            }
        }
    }
}
