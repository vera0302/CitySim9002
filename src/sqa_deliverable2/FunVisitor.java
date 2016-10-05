
/*
 * Define the class of visitor, which is used to decide the type of visitors 
 * and which location they are heading to, also determine if different kinds of visitors 
 * like the location according to their preferences. In a word, define every attributes of 
 * visitors like the function requirements said
 * 
 */
public class FunVisitor {

    public int Visitortype;
    public int n;
    public boolean a = false;  //Leave
    public boolean b = false;  //First visit

    public int GenerateType(RandomGenerator RG) {
        Visitortype = RG.Generator(4);
        return Visitortype;
    }

    //visitors visit(main function of visitors)

    public void Visitor(int n) {
        this.n = n + 1;
        RandomGenerator RG = new RandomGenerator();
        GenerateType(RG);
        getTypeOfVisitor t = new getTypeOfVisitor();
        FinalType(t);
        attributes();
    }

    //get the final type of visitor

    public String FinalType(getTypeOfVisitor t) {
        System.out.println("Visitor " + n + " is a " + t.Type(Visitortype) + ".");
        return "Visitor " + n + " is a " + t.Type(Visitortype) + ".";

    }

    //visit places as requirements

    private void attributes() {
        CityLocations cl = new CityLocations();
        Preference pr = new Preference();
        RandomGenerator RG = new RandomGenerator();
        while (!a) {
            Visiting(cl, pr, RG);
        }
    }

    //different visiting situations requirements

    public String Visiting(CityLocations cl, Preference pr, RandomGenerator RG) {
        //generate 5 visitors to meet the requirements
        int j = RG.Generator(5);
        if (j == 4) {
            if (!b) {
                return null;
            }
            //left the city
            this.a = true;
            //for the situation that visitors left the city after visited locations 
            System.out.println("Visitor " + n + " has left the city.");
            return "Visitor " + n + " has left the city.";
        }
        //visitors visiting locations in the city
        System.out.println("Visitor " + n + " is going to " + cl.Location(j) + "!");
        //determine whether visitors like or do not like the current visiting location
        System.out.print("Visitor " + n + " did ");
        if (!pr.Like(Visitortype, j)) {
            System.out.print("not ");
        }
        System.out.println("like " + cl.Location(j) + ".");
        //The Visitor must visit at least one Location
        if (!b) {
            b = true;
        }
        //First visit
        return "Visitor " + n + " is going to " + cl.Location(j) + "!";
    }

}
