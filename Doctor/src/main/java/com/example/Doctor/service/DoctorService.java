package com.example.Doctor.service;

import com.example.Doctor.model.Doctor;
import com.example.Doctor.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctor(String doctorID) {
        return doctorRepository.findById(doctorID).orElse(null);
    }


    public Doctor create(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public void delete(String doctorId) {
        doctorRepository.deleteById(doctorId);
    }

    public void deleteAll() {
        doctorRepository.deleteAll();
    }
}
