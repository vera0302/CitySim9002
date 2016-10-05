
/*
 * Define the class of Visitor types, which is to get four types of visitors according to
 * the requirements.
 * Store Visitor types in the String arrayList. 
 * 
 */
public class getTypeOfVisitor {

    //four types of visitors in the system

    public String[] Visitortype = {"Student", "Professor", "Business Person", "Blogger"};

    public String Type(int n) {
        return Visitortype[n];
    }
}
