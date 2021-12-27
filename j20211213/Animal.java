package j20211213;

public class Animal {

    String name;

    public void setName(String n) { // setMame이라는 메소드를 추가
        this.name = n; // this 는 호출한 객체이름이다.
    }

    public static void main(String[] args) {
        Animal cat = new Animal(); // 객체 생성(Animal)이라는 클래스로 cat을 찍음

        cat.setName("boby"); // cat.setName이라는 객체를 호출하고 이름을 "boby"라고 지정

        System.out.println(cat.name);

        Animal dog = new Animal(); // 객체 생성(Animal)이라는 클래스로 dog을 찍음

        dog.setName("happy"); // dog.setName이라는 객체를 호출하고 이름을 "happy"라고 지정

        System.out.println(dog.name);

    }
}
