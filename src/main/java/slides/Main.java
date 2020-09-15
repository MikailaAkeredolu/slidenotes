package slides;

public class Main {

    public static void main(String[] args) {


        //Create fresh array of people
        Person p1 = new Person();
        Person p2 =  new SalariedEmployee("Jay", 30, 40, 5000.00, new HireDate(03,10,1998));
        Person p3 = new Entrepreneur("Fatima",120000.00, 3000000.00);


        Person[] people = {p1, p2,p3};
        for(Person p: people){
            System.out.println(p.getClass().getSimpleName());  // gives us name of the class
        }



        Person persontest = new Person();
        persontest.getPersonName(persontest);

        Person persontest1 = new Entrepreneur("Lateef",1000.00, 3000.00);
        persontest.getPersonName(persontest1);

        Person person1 = new Person("Biggie");
        Person person2 = new Person("JayZ");
        Person person3 = new Person("Nas");

        Person person4 = new Person("Mikaila", 99);
        Employee employee = new Employee("Jack", 40, 80, new HireDate(04,18,2020));
        employee.sex = 'M';
        employee.setPronoun("Non Binary");
        System.out.println(employee.getPronoun());
        System.out.println(employee);

        Person person5 = new Entrepreneur("Hakeem",1000.00, 3000.00);
        person5.setPronoun("Straight");
        System.out.println(person5.getPronoun());


        //Entrepreneur becomes an employee'
        person5 = new Employee("hakeem", 40, 80, new HireDate(01,18,2020));
        System.out.println(person5 instanceof Employee);
        System.out.println(person5 instanceof Entrepreneur);
       // person5.calculatePay(); //no access

        //cast down to Employee
        ((Employee)person5).calculatePay();

        SalariedEmployee salariedEmployee = new SalariedEmployee("Sade", 30, 40, 1000.00, new HireDate(03,18,2020));
        salariedEmployee.setPronoun("lesbian");
       // System.out.println(salariedEmployee.getPronoun());
        System.out.println(salariedEmployee);

//        System.out.println(person1);
//        System.out.println(person2.toString());
//        System.out.println(person3);

//
//        StoreKeeper johnDoe = new StoreKeeper("John Doe");
//       /*
//       Stock keeper creates album and assigns negative values for price and number of copies available
//        */
//        johnDoe.manageAlbum(new Album(), "Who runs the world?", "Beyonce", -1000.00, -50);
//
//        System.out.println("==============================================");
//
//        EncapsulatedStoreKeeper janeDoe = new EncapsulatedStoreKeeper("Jane Doe");
//       /*
//       Stock keeper creates album and assigns negative values for price and number of copies available
//        */
//        janeDoe.manageAlbum(new EncapsulatedAlbum(), "Slippery When Wet", "Bon Jovi", -1000.00, -50);
//
    }


}
