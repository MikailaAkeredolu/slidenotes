package slides;

public class Person {
    private String name;
    private int age;
    protected char sex;
    private String pronoun;

    //default constructor - invoking  parameterized
    public Person(){
        this("Mike");
    }

    //Parameterized constructor
    public Person(String name){
        this.name = name;
    }

    //overloaded constructor
    public Person(String name, int age){
        this.name = name;
        this.setAge(age);
    }


    public void getPersonName(Person person){
        if(person instanceof Employee){
            System.out.println(person.getName() + " is a great employee");
        }else if(person instanceof Entrepreneur){
            System.out.println(person.getName() + " is living his best life");
        }else{
            System.out.println("You are a person with no job or biz");
        }
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return " Name: "+ this.name + "\n age: " + this.age + " years\n" +  " pronoun: " + this.pronoun  + "\n";
    }

    public String getPronoun() {
        return pronoun;
    }

    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }
}
