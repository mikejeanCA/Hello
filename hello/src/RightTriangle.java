
public class RightTriangle {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int aSquared = (int)Math.pow(a, 2);
        int bSquared = (int)Math.pow(b, 2);
        int cSquared = (int)Math.pow(c, 2);

        if(aSquared + bSquared != cSquared){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}
