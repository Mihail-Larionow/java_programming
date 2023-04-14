public class Secretary extends Employee {

    private final String job_department;

    public Secretary(String name, int age, String job_department){
        super(name, age);
        this.job_department = job_department;
    }

    @Override
    public String getJobInfo(){
        String info = "Отдел: " + job_department + "\n";
        return info;
    }

}
