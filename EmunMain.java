package collectionsFramework;

public class EmunMain {
    enum  Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        // these are called enum constants
        // each member is public , static and final
        // since it's final we can not create child enums
        // type us week

    }
    public static void main(String [] args){
        Week week;
        week = Week.Monday;
        for(Week day : Week.values()){
            System.out.println(day);
        }
    }
}
