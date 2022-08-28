package extendsStudy;

public class SmartTv extends Tv{
    boolean caption;

    public SmartTv() {
    }

    void displayCaption(String text) {
        if (this.caption) {
            System.out.println(text);
        }

    }
}
