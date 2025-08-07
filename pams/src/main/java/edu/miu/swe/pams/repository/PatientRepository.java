package edu.miu.swe.pams.repository;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import edu.miu.swe.pams.model.Patient;

public enum PatientRepository {
    INSTANCE;
    private List<Patient> patients;
    private PatientRepository() {
        this.patients = new ArrayList<>();
    }

    public List<Patient> getPatients() {
        if (patients.isEmpty()) {
            initializePatients();
        }
        return patients;
    }


    public void initializePatients() {
        patients.add(new Patient(1, "Daniel", "Agar", "(641) 123-0009", "dagar@m.as", "1 N Street", LocalDate.of(1987, 1, 19)));
        patients.add(new Patient(2, "Ana", "Smith", null, "amsith@te.edu", null, LocalDate.of(1948, 12, 5)));
        patients.add(new Patient(3, "Marcus", "Garvey", "(123) 292-0018", null, "4 East Ave", LocalDate.of(2001, 9, 18)));
        patients.add(new Patient(4, "Jeff", "Goldbloom", "(999) 165-1192", "jgold@es.co.za", null, LocalDate.of(1995, 2, 28)));
        patients.add(new Patient(5, "Mary", "Washington", null, null, "30 W Burlington", LocalDate.of(1932, 5, 31)));

    }
}
