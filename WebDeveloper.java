public class WebDeveloper implements Employee {

    @Override
    public int getSalary() {
        return 40000;
    }

    @Override
    public String name() {
        System.out.println("I am a web developer");
        return "WEB DEVELOPER";
    }

}