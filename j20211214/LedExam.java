package j20211214;

public class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTV();

        tv.trunOn();
        tv.changeVolume(0);
        tv.changeChannel(39);
        tv.turnOff();

    }
}
