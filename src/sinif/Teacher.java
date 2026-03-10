package sinif;

public class Teacher {
    String name;
    String branch;
    String mpno;
    public Teacher(String name,  String branch,String mpno){
        this.name=name;
        this.branch=branch;
        this.mpno=mpno;
    }
    public void print(){
        System.out.println("adi:"+this.name);
        System.out.println("bolumu:"+this.branch);
        System.out.println("telefonu:"+this.mpno);

    }
}
