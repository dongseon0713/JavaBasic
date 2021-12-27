package j20211214;

public interface TV {
    // 변수를 대문자로 설정하면 상수의 의미로 사용
    public int MIN_VOLUME = 0;

    public int MAX_VILUME = 100;

    public void trunOn();

    public void turnOff();

    public void changeVolume(int volume);

    public void changeChannel(int channel);
}
