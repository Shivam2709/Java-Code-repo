public class PowerOfNo {

    public static int Pow(int base, int power) {

        if(power !=  0){

            return (base * Pow(base, power-1));
        }
        return 1;

    }

    public static void main(String[] args) {
        int base = 2;
        int power = 5;

        System.out.println(Pow(base, power));

    }
}
