package j20211213;

public class Dog extends Animal_inher { // extends를 이용하여 Animal_inher의 기능을 다 가져온다( 상속 )

    public Dog() {
        // 기본 생성자 defalut constructor
    }

    public void sleep() {

        System.out.println(this.name + " Zzz");

    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setName("Habi");

        System.out.println(dog.name);

        dog.sleep();

    }
}
