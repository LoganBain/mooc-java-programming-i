
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation healthStat = new HealthStation();
        
        Person joe = new Person("Joseph", 17, 160, 60);
        System.out.println(healthStat.weigh(joe));
        healthStat.feed(joe);
        System.out.println(healthStat.weigh(joe));
        System.out.println(healthStat.weighings());
    }
}
