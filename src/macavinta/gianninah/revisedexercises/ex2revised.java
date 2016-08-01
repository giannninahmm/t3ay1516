package macavinta.gianninah.revisedexercises;

/**
 * Created by IE on 8/1/2016.
 */
public class ex2revised {public static void main(String[] args) {
    // Exercise 2.1
    // Implement fibonacci sequence
    int n = 9;

    System.out.println("Exercise 2.1");
    System.out.println("Fibonacci\n");

    int X1=0, X2=1, xn, b;

    for (b=0; b < n ; b++ ) {
        if (b <= 1)
            xn = b;
        else {
            xn = X1 + X2;
            X1 = X2;
            X2 = xn;
        }
        System.out.println(xn);
    }


    // Exercise 2.2

    System.out.println("\n\nExercise 2.2");
    System.out.println("PRIMALITY TEST\n");

    int d=2;

    for (d=2;d<=n-1;d++)
    {
        if (d%b==0)
        {
            System.out.println(n +" is not prime!!");
            break;
        }
    }
    if (d==n)
        System.out.println(n +" is prime.");

}
}
