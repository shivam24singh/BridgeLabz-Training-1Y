lass Student {
    int rollNo;
    String name;
    int age;

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.rollNo = 101;
        s1.name = "Rahul";
        s1.age = 18;

        s1.display();
    }
}