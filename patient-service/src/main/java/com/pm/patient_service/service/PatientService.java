package com.pm.patient_service.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.pm.patient_service.repository.PatientRepository;
import com.pm.patient_service.dto.PatientResponseDTO;
import com.pm.patient_service.mapper.PatientMapper;
import com.pm.patient_service.model.Patient;

@Service
public class PatientService {
  private PatientRepository patientRepository;

  public PatientService(PatientRepository patientRepository){
    this.patientRepository = patientRepository;
  }

  public List<PatientResponseDTO> getPatients(){
    List<Patient> patients = patientRepository.findAll();
    List<PatientResponseDTO> patientResponseDTOs = patients.stream().map(patient -> PatientMapper.toDTO(patient)).toList();
    
    return patientResponseDTOs;
  }
}
