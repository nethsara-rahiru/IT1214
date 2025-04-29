class Student{

    private String name;
    private int reglNo;
    private String course;


    void constructor(String name, int reglNo, String course){
        this.name = name;
        this.reglNo = reglNo;
        this.course = course;
    }

    void setName(String name){
        this.name = name;
    }
    void setReglNo(int reglNo){
        this.reglNo = reglNo;
    }
    void setCourse(String course){
        this.course = course;
    }

    String getName(){
        return name;
    }
    int getReglNo(){
        return reglNo;
    }
    String getCourse(){
        return course;
    }

    void display(){
        System.out.println("Name   : " + name);
        System.out.println("reglNo : " + reglNo);
        System.out.println("course : " + course);
    }
}