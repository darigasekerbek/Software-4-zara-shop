import java.util.ArrayList;
import java.util.List;

public class Shop implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String currentVacancy;
    private List<ShopEmployee> applicants = new ArrayList<>();
    private List<ShopEmployee> hiredEmployees = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void openVacancy(String vacancy) {
        currentVacancy = vacancy;
        notifyObservers("Vacancy opened: " + vacancy);
    }

    public void applyForJob(ShopEmployee applicant) {
        applicants.add(applicant);
        notifyObservers("Application received: " + currentVacancy +
                " - Applicant: " + applicant.getName());
    }

    public void acceptApplication(ShopEmployee applicant) {
        if (applicants.contains(applicant)) {
            notifyObservers("Position filled: " + currentVacancy +
                    " - Applicant: " + applicant.getName());
            hiredEmployees.add(applicant);
            applicants.clear();
        }
    }

    public void announceEmployeePlacement(ShopEmployee employee) {
        if (hiredEmployees.contains(employee)) {
            notifyObservers("Employees, we have news! Starting from 1st November, " +
                    employee.getName() + " has been appointed as a Commercial Specialist in the Men's Department.");
        }
    }
}
