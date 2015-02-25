/**
 * Created by admin on 25.02.2015.
 */
public class Primes {

    public static void main(String[] args){
        for (int d = 2; d < 1000; d++)
        {
            int divider = 0;
            for (int i = 2; i <= d; i++)
            {
                if (d % i == 0)
                    divider++;
            }
            if (divider < 2)
                System.out.println(d);
        }
    }
}
