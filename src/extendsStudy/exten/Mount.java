package extendsStudy.exten;


class GrandParents{
    public GrandParents(){
        System.out.print("grand-");
    }
}

class Parents extends GrandParents{
    public Parents(String type){
        System.out.print(type);
    }
}
public class Mount extends  Parents{
    public Mount(){
        super("parent-");
        new Parents("parent-");
    }
    public static void main(String[] args){
        new Mount();
    }
}
