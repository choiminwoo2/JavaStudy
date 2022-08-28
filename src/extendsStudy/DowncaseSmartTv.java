package extendsStudy;

public class DowncaseSmartTv {
    public static void main(String[] args) {
        Tv tv = new Tv();
        SmartTv stv= (SmartTv)tv;

        // 다운캐스팅은 자식의 모든 구성요소 사용가능.
        stv.caption= true;
        stv.setChannel(10);
    }
}
