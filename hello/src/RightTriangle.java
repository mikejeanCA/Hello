
public class RightTriangle {

    public static void main(String[] args) {
        int a = (int)Math.pow(args[0], 2);
        int b = (int)Math.pow(args[1], 2);
        int c = (int)Math.pow(args[2], 2);
        if(a + b != c){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}
