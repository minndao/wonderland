package src.com.guild.roles;

public class RoleTest {
    public static void main(String[] args) {
        Role member1 = new Role();
        Role member2 = new Role("Bernard",19,"Space Marine",99.0);
        Role member3 = new Role("Jovita",19,"Dwarf",32.7);

        member1.performAction();
        
        member2.performAction();
     
        member3.performAction();

    }

   
}
