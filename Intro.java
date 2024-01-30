public class Intro {
    private String name;

    public static void main(String[] args) {
        String s = "java";
        System.out.println("We're learning " + s);
        Intro oIntro = new Intro();
        oIntro.setName("Nancy");


        // Instantiate an instance of Company
        Company company = new Company();

        company.printName();

    }


    public String getName() {
        return name;
    }

    public void setName(String sName) {
        name = sName;

    }

    public void test() {
        name = "Frank";


    }
}