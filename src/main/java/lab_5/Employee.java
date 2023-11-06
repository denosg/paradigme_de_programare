package lab_5;

public class Employee {

    private String name;
    private String email;
    private double hourRate;
    private int capacity;
    private int freeDays;

    public Employee(String name, String email, double hourRate, int capacity, int freeDays) {
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", hourRate=" + hourRate +
                ", capacity=" + capacity +
                ", freeDays=" + freeDays +
                '}';
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFreeDays() {
        return freeDays;
    }

    public void setFreeDays(int freeDays) {
        this.freeDays = freeDays;
    }

    public double getDailyIncome() {
        return hourRate * capacity;
    }

    public double getMonthlyIncome() {
        final double dailyIncome = getDailyIncome();
        final double removeIncome = freeDays * dailyIncome;
        return dailyIncome * 30 - removeIncome;
    }
}
