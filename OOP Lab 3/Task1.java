
class Marks {
    private int mark1;
    private int mark2;
    private int mark3;

    public Marks(){
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;

    }
    public Marks(int mark1, int mark2, int mark3){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        
    }

    public void setMark1(int m){
        mark1 = m;
    }
    public void setMark2(int m){
        mark2 = m;
    }
    public void setMark3(int m){
        mark3 = m;
    }
    public int getMark1(){
        return mark1;
    }
    public int getMark2(){
        return mark2;
    }
    public int getMark3(){
        return mark3;
    }

}



public class Task1 {
    public static void main(String[] args) {
        Marks m1 = new Marks();
        m1.setMark1(2);
        m1.setMark2(3);
        m1.setMark3(5);
        System.out.println(m1.getMark1());
        System.out.println(m1.getMark2());
        System.out.println(m1.getMark3());
    }
}
