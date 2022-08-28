package extendsStudy;

public class Main {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        tv.setChannel(10);
        tv.channelUp();
        System.out.println(tv.getChannel());
        tv.displayCaption("Hello.");
        tv.caption = true;
        tv.displayCaption("Hello.");
    }

}
