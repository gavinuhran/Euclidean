/*
 * Gavin Uhran
 * 10/15/18
 * Data Structures
 */

public class Euclidean
{
    // complete the recursive version below
    public static int gcdRecursive(int m, int n)
    {
        //System.out.println("gcdRecursive [M]: " + m);
        //System.out.println("gcdRecursive [N]: " + n);
        if (m < n)
        {
            int temp = n;
            n = m;
            m = temp;
            //System.out.println("SWITCHED");
            //System.out.println("gcdRecursive [M]: " + m);
            //System.out.println("gcdRecursive [N]: " + n);
        }
        if (m % n == 0)
            return n;
        //System.out.println("Recursive Call Made");
        return gcdRecursive(n, m % n);
    }

    // complete the iterative version below
    public static int gcdIterative(int m, int n)
    {
        if (m < n)
        {
            int temp = n;
            n = m;
            m = temp;
        }
        while (m != 1)
        {
            if (m % n == 0)
                return n;
            int temp = n;
            n = m % n;
            m = temp;
        }
        return 1;
    }
}
