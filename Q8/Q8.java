class Person {

    private String name;
    private int age;
    
    public String getName(){

         return name; 

        }

    public void setName(String name){

         this.name = name; 

    }
    public int getAge(){
        
        return age;
    
    }
    public void setAge(int age){
        
        this.age = age;
    
    }
    public void display(){

        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);

    }
}

class App{
    public static void main(String[] args){
        Person person = new Person();
        person.setName(args[0]);
        person.setAge(Integer.parseInt(args[1]));
        person.display();
    }
}