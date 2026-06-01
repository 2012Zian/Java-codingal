package Lesson_11;
class hillstations{
    void location(){
        System.out.println("Location is :");

    }
    void famousfor(){
        System.out.println("Famous for:");
    }
}
class manali extends hillstations{
    void location(){
        System.out.println("Manali is in Himachal Pradesh");

    }

    void famousfor(){
        System.out.println("It is famous for hadimba temple and adventure sports");

    }
}
class musssoorie extends hillstations{
    void location(){
        System.out.println("Mussoorie is in Uttarkhan");

    }

    void famousfor(){
        System.out.println("It is famous for education institutions");
        
    }
}
class gulmarg extends hillstations{
    void location(){
        System.out.println("Gulmarg is in JK");

    }

    void famousfor(){
        System.out.println("It is famous for skiing");
        
    }
}
public class hs {
    public static void main(String[] args) {
        hillstations a = new hillstations();
        hillstations m = new manali();
        hillstations mu = new musssoorie();
        hillstations g = new gulmarg();

        a.location();
        a.famousfor();

        m.location();
        m.famousfor();

        mu.location();
        mu.famousfor();

        g.location();
        g.famousfor();

    }
}
