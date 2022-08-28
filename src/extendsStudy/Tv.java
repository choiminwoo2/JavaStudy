package extendsStudy;

public class Tv {
    private boolean power;
    private int channel;

    public Tv() {
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public boolean getPower() {
        return this.power;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return this.channel;
    }

    void setPower() {
        this.power = !this.power;
    }

    void channelUp() {
        ++this.channel;
    }

    void channelDown() {
        --this.channel;
    }
}
