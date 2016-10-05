
import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.*;

public class CitySim9002Test {
    
    //1.test if the types of visitors stored the right type in the arrayList, each corresponding
    //to the node of the array
    //double test
    @Test
    public void testgetTypeOfVisitor() {
        getTypeOfVisitor t = new getTypeOfVisitor();
        assertEquals("Student", t.Type(0));
        assertEquals("Professor", t.Type(1));
        assertEquals("Business Person", t.Type(2));
        assertEquals("Blogger", t.Type(3));
    }

    //2. Similarly like above, test if the City Locations stored the right Location name
    //in the arrayList, each corresponding to the node of the array
    //double test
    @Test
    public void testCityLocations() {
        CityLocations cl = new CityLocations();
        assertEquals("The Cathedral of Learning", cl.Location(0));
        assertEquals("Squirrel Hill", cl.Location(1));
        assertEquals("The Point", cl.Location(2));
        assertEquals("Downtown", cl.Location(3));
    }

    //3.test if generator generates types of visitor not in 4 kinds,
    //test if the type value will be -1 or 5 (edge class)
    //double test
    @Test
    public void testRandomGenerator() {
        //FunVisitor v = new FunVisitor();
        RandomGenerator RG = new RandomGenerator();
        //v.GenerateType(RG);
        assertNotEquals(-1, RG.Generator(4));
        assertNotEquals(5, RG.Generator(4));
    }

    //4. Stubbing test
    //set the visitor type to 1-"Student", and the Visitor number to 1
    //test if the message "Visitor 1 is a Student." will return as a result the same as the requirement
    @Test
    public void testGetType() {
        FunVisitor v = new FunVisitor();
        v.n = 1;
        v.Visitortype = 1;
        getTypeOfVisitor t = Mockito.mock(getTypeOfVisitor.class);
        assertEquals("Visitor 1 is a Student.", v.FinalType(t));
    }

    //5. Stubbing test. Test if the Randomgenerator's result value would generate the type of the Visitor
    //set the Randomgenerator's result value to 2, if it passed, the visitor type value should be equal to 2
    @Test
    public void testValueReturn() {
        FunVisitor v = new FunVisitor();
        RandomGenerator RG = Mockito.mock(RandomGenerator.class);
        Mockito.when(RG.Generator(4)).thenReturn(2);
        v.GenerateType(RG);
        assertEquals(2, v.Visitortype);
    }

    //6. Stubbing test. Test if a visitor visit a place by setting the location name as "iSchool"
    //Setting the Generator's result number to 3 at the same time, the output result should be 
    //"Visitor 3 is going to iSchool!" as expected 
    @Test
    public void testVisiting() {
        Preference pr = new Preference();
        RandomGenerator RG = Mockito.mock(RandomGenerator.class);
        Mockito.when(RG.Generator(5)).thenReturn(3);
        CityLocations cl = Mockito.mock(CityLocations.class);
        Mockito.when(cl.Location(3)).thenReturn("iSchool");
        FunVisitor v = new FunVisitor();
        v.n = 3;
        v.Visitortype = 3;
        assertEquals("Visitor 3 is going to iSchool!", v.Visiting(cl, pr, RG));
    }

}
