/* 
 * Name: Aftar Ahmad Sami
 * ID: 2012020335
 * Section: 5(G)
 * Email: cse_2012020335@lus.ac.bd
 */

package sami;
import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic{
	
    @Override
    public  int divisorSum(int n)
    {
        int divisorCount = 0;
        for(int i= 1; i<=n ; i++)
        {
            if(n%i==0)
            {
                divisorCount += i;
            }
        }
        return divisorCount;
    }

    @Override
    public BigInteger findFactorial(int n)
    {
        BigInteger factorial = BigInteger.ONE;
        
        for(int i= 1; i<=n ; i++)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        return  factorial;
    }
	
}
