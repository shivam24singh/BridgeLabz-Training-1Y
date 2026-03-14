class Student {
    int id;
    String name;
    int age;

    void display() {
        System.out.println("Id: " + id );
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.id = 23;
        s1.name = "Rahul";
        s1.age = 18;

        s1.display();
    }
}

