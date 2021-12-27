package j20211213;

public class HouseDog extends Dog {

    public HouseDog(String name) {
        // 생성자
        // 클라스명과 동일
        // return값이 없다.
        this.setName(name);
    }

    public HouseDog(int type) {
        // 생성자 오버로딩

        if (type == 1) {
            this.setName("york");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    public void sleep() {

        System.out.println(this.name + " Zzz in house");

    }

    public void sleep(int hour) {

        System.out.println(this.name + " Zzz in house for " + hour + "hours");

    }

    public static void main(String[] args) {

        HouseDog house1 = new HouseDog("Habi"); // 생성자는 객체를 찍을 때 자동으로 생성
                                                // 문자열로 생성자 호출 public HouseDog(String name)

        // house.setName("Habi");

        System.out.println(house1.name);

        house1.sleep();
        // 인수가 없는 sleep실행

        house1.sleep(3);
        // int 인수 가 있는 sleep실행

        HouseDog house2 = new HouseDog(1); // 숫자로 생성자 호출 public HouseDog(int type)

        System.out.println(house2.name);

    }
}
