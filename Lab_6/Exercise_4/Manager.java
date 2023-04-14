public class Manager extends Employee {

    private final String job_qualification;

    public Manager(String name, int age, String job_qualification){
        super(name, age);
        this.job_qualification = job_qualification;
    }

    @Override
    public String getJobInfo(){
        String info = "Квалификация: " + job_qualification + "\n";
        return info;
    }

}
