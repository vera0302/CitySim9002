
/*
 * Define the class of generator, using Java functions to generate the random number in a range 
 * and return the random number 
 * 
 */
public class RandomGenerator {
    
    //max and min corresponds to the maximum and the minimum number range of the generator

    public int Generator(int n) {
        double r1 = Math.random() * n;
        for (int i = 0; i <= n - 1; i++) {
            if (r1 <= i + 1) {
                return i;
            }
        }
        return 0;
    }

}
