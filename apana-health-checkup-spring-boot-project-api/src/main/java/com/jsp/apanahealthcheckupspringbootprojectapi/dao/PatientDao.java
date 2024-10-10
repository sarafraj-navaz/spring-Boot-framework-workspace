package com.jsp.apanahealthcheckupspringbootprojectapi.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Doctor;
import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Hospital;
import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Nurse;
import com.jsp.apanahealthcheckupspringbootprojectapi.dto.Patient;
import com.jsp.apanahealthcheckupspringbootprojectapi.repository.DoctorRepository;
import com.jsp.apanahealthcheckupspringbootprojectapi.repository.HospitalRepository;
import com.jsp.apanahealthcheckupspringbootprojectapi.repository.NurseRepository;
import com.jsp.apanahealthcheckupspringbootprojectapi.repository.PatientRepository;

@Repository
public class PatientDao {

	@Autowired
	private HospitalRepository  hospitalRepository;
	
	@Autowired
	private NurseRepository nurseRepository;
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private PatientRepository patientRepository;
	
	
	/*
	 * save Patient
	 */
	public Patient savePatientDao(int hospitalId,int nurseId,int doctorId,Patient patient) {
		Hospital hospital = hospitalRepository.findByHospitalId(hospitalId);
		Nurse nurse= nurseRepository.findByNurseId(nurseId);
		Doctor doctor= doctorRepository.findByDoctorId(doctorId);
		
		List<Doctor> doctors=new ArrayList<Doctor>(Arrays.asList(doctor));
		
		if(hospital != null && nurse != null && doctor != null) {
			patient.setHospital(hospital);
			patient.setNurse(nurse);
			patient.setDoctor(doctors);
			
			return patientRepository.save(patient);
		}
		else {
			return null;
		}
	}
}
