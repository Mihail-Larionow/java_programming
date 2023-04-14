public class Engineer extends Employee {

    private final String job_specialization;

    public Engineer(String name, int age, String job_specialization){
        super(name, age);
        this.job_specialization = job_specialization;
    }

    @Override
    public String getJobInfo(){
        String info = "Специальность: " + job_specialization + "\n";
        return info;
    }

}
