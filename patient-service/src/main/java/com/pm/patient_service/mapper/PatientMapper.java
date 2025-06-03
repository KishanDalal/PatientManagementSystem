package com.pm.patient_service.mapper;

import com.pm.patient_service.dto.PatientResponseDTO;
import com.pm.patient_service.model.Patient;

// Turns entity into dto 
public class PatientMapper {
  public static PatientResponseDTO toDTO(Patient patient){
    PatientResponseDTO patientDTO = new PatientResponseDTO();
    patientDTO.setId(patient.getId().toString());
    patientDTO.setName(patient.getName().toString());
    patientDTO.setAddress(patient.getAddress().toString());
    patientDTO.setEmail(patient.getEmail().toString());
    patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());
    return patientDTO;
  }
}
