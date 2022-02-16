package com.example.Doctor.controller;

import com.example.Doctor.model.Doctor;
import com.example.Doctor.service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/doctor")
@RestController
public class DoctorController {
    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/getAllDoctors")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/get/{doctorID}")
    public Doctor getDoctor(@PathVariable String doctorID) {
        return doctorService.getDoctor(doctorID);
    }

    @PostMapping("/createDoctor")
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorService.create(doctor);
    }

    @DeleteMapping("/deleteDoctor/{doctorId}")
    public String deleteDoctor(@PathVariable String doctorId) {
        doctorService.delete(doctorId);
        return "Doctor deleted";
    }


    @DeleteMapping("/deleteAll")
    public String deleteDoctors() {
        doctorService.deleteAll();
        return "All doctors deleted";
    }
}
