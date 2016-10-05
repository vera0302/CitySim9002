
/*
 * Using preferences class to describe four kinds of visitors' preferences about four different
 * kinds of locations, the sequence of the data stored in the array is following the four types 
 * of visitors and each small list in the boolean corresponds to if this type of visitor like those  
 * four locations or not.  
 * 
 */
public class Preference {
    
    //false equals to dislike, true means like. The sequence of liking locations is The Cathedral of Learning, Squirrel Hill, The Point, and Downtown.
    //Four groups of boolean values are corresponding to the student, professor, Business Person, and the Blogger 

    boolean[][] LikeorNot = {{false, true, true, true}, {true, true, true, true},
    {false, true, false, true}, {false, false, false, false}};

    public boolean Like(int a, int b) {
        return LikeorNot[a][b];
    }

}
