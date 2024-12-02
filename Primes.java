public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int counter = 0;
        boolean[] isPrime = new boolean[n+1];
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i<isPrime.length; i++)
        {
            isPrime[i]=true;
        }
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (isPrime[i]) { 
                for (int j = i * 2; j <= (n); j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":") ;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) { 
                counter ++;
                System.out.println (i);
            }
        }
        int percent = counter * 100 / n;
        System.out.println("There are " + counter + " primes between 2 and "                                           
                          + n + " (" + percent + "% are primes)");
     }   
    }
