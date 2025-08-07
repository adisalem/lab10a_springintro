package edu.miu.swe.pams.service.impl;
import edu.miu.swe.pams.service.PatientService;
import edu.miu.swe.pams.repository.PatientRepository;
import java.util.List;
import edu.miu.swe.pams.model.Patient;
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;

    public PatientServiceImpl() {
        this.patientRepository = PatientRepository.INSTANCE;
        this.patientRepository.initializePatients();
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.getPatients();
    }

}
