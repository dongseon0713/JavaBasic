package j20211214;

// TV의 있는 기능을 구현
public class LedTV implements TV {
    // LedTV 클레스는 TV인터페이스를 구현했다.
    // TV에 정의된 메서드 들을 모두 구현해야만 한다.

    // @______ annotation 에너테이션
    // 확인 요청, 필수 아닌 선택
    @Override
    public void trunOn() {
        System.out.println("TV on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV off");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("Volume : " + volume);
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("channel : " + channel);
    }
}
