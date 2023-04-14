public class Director extends Employee {

    private final int job_experience;

    public Director(String name, int age, int job_experience) {
        super(name, age);
        this.job_experience = job_experience;
    }

    @Override
    public String getJobInfo() {
        String info = "Стаж (в годах): " + job_experience + "\n";
        return info;
    }

}