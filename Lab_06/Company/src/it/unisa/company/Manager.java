package it.unisa.company;

public class Manager extends Employee {

    private String expertiseArea;
    private int workedHours;

    public Manager(String name, String surname, String jobTitle, float hourlyWage, String expertiseArea){
        super(name, surname, jobTitle, hourlyWage);
        this.expertiseArea = expertiseArea;
        this.workedHours = workedHours;
    }

    public String getExpertiseArea() {
        return expertiseArea;
    }

    public void setExpertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
        this.updateSalary(this.getHourlyWage());
    }



    @Override
    private void updateSalary(float hourlyWage){
        if(this.workedHours <= 40)
            this.setWage(hourlyWage * this.workedHours);
        else
            this.setWage(super.updateSalary(hourlyWage)
                    + (hourlyWage * 3/2) * this.workedHours);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Area di competenza='" + expertiseArea + '\'';
    }
}
