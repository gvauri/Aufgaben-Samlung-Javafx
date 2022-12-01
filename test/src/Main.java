public class Main {
    public static void main(String[] args) {
        /*
        double wurzel = Math.sqrt(9);
        System.out.println(wurzel);
    */

        int checkSum = Mth2.getCheckSum(3);


        Person p1 = new Person();
        Person p2 = new Person();

        p1.setFirstName("Manu");
        p2.setFirstName("Jeremias");
        p2.setLastName("Furrer");

      /*  AdressList adressList =new AdressList();
        adressList.getPersons().add(p1);
        adressList.getPersons().add(p2); */

        p1.getFirstName();
        p2.getFirstName();


        System.out.println();


        int a = ((3 *2+2)/10)*5;
        System.out.println("a"+a);
    }
}