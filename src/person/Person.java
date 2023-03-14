package person;

public class Person {

    public int age;
    public String name;
    public String surname;
    public int height;
    public int weight;

    public Person(int age, String name, String surname, int height, int weight) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object obj) {
        //check if method call is an object
        //if not, cancel method
        if(this == obj) return true;
        if(obj == null || getClass()!= obj.getClass()) return false;

        //Cast Person to obj
        Person p = (Person) obj;
        if(name.equals(p.name) && surname.equals(p.surname)) {
            return true;
        }
        return false;
    }


}
