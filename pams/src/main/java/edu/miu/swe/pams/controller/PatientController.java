package edu.miu.swe.pams.controller;
import edu.miu.swe.pams.service.PatientService;
import edu.miu.swe.pams.service.impl.PatientServiceImpl;
import edu.miu.swe.pams.dto.PatientDto;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class  PatientController {
    private final PatientService patientService;

    public PatientController() {
        this.patientService = new PatientServiceImpl();
    }
    public  List<PatientDto> getAllPatients() {
        return patientService.getAllPatients().stream()
                .map(patient -> new PatientDto(
                        patient.getPatientId(),
                        patient.getFirstName(),
                        patient.getLastName(),
                        patient.getPhoneNo(),
                        patient.getEmail(),
                        patient.getMailingAddress(),
                        patient.getDateOfBirth(),
                        patient.getAge()
                )).sorted(Comparator.comparing(PatientDto::getAge).reversed())
                .collect(Collectors.toList());
    }

}
