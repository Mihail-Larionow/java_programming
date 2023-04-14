public abstract class Employee {

    private final int age;
    private final String name;

    protected Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getPersonalInfo(){
        String info = "Имя: " + name + "\n";
        info += "Возраст: " + age + "\n";
        return info;
    }

    public abstract String getJobInfo();

}
