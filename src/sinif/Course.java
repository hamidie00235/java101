package sinif;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;


    public Course(String name,String code, String prefix,Teacher teacher) {

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher=teacher;
        this.note = 0;
    }
    public void addTeacher(Teacher teacher){
        if(teacher.branch.equals(prefix)) {
            this.teacher = teacher;

        }
        else{
            System.out.println("öğretmen ve ders bölümüleri uyuşmuyor! ");
        }
    }
   void  printTeacher(){
this.teacher.print();
   }
}
