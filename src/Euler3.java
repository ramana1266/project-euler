//Largest prime factor of a given number-- waste way--
public class Euler3 {
    static long lSqrt=2L;
    private static long largestPrime(long lNum){
        long lPrime=2L;
        for(long lCount=2L;lCount<=lSqrt;lCount++){
            if((lNum%lCount)==0){
              lNum=lNum/lCount;
              lPrime=lCount;           
            }
        }
        return lPrime;
    }//End of largestPrime

    public static void main(String... args) {
        long lNum=600851475143L;
        lSqrt=(long)Math.sqrt((double)lNum);
        lSqrt=lSqrt+1;//To facilitate all possibilities       
        long lLgPrime=largestPrime(lNum);
        System.out.println("The Largest Prime for "+lNum+" is : "+lLgPrime);
    }
}
