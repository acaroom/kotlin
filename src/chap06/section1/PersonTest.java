package chap06.section1;

class Person {

    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 게터/세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Kildong", 30);
        // p1.name = "Dooly"  접근 불가
        p1.setName("Dooly");
        System.out.println(p1.getName());
    }
}
