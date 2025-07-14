package genericClass;

public enum EnumDemo {
    MONDAY("This is Monday",1),
    TUESDAY("This is tue",2),
    WEDNESDAY("This is we",3);
    private int val;
    private String comment;

    EnumDemo(String comment, int val) {
        this.comment = comment;
        this.val = val;
    }


}
