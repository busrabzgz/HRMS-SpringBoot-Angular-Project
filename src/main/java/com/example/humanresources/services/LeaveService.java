package com.example.humanresources.services;

import com.example.humanresources.common.ReflectionUtil;
import com.example.humanresources.entity.Leave;
import com.example.humanresources.entity.Leave;
import com.example.humanresources.repository.LeaveRepository;
import com.example.humanresources.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class LeaveService {

    private UserRepository userRepository;


    private LeaveRepository leaveRepository;
//
//    public Leave saveLeave(Leave leave) {
//        Leave newLeave = new Leave();
//        newLeave.setEmployee(userRepository.getById(leave.getEmployee().getId()));
//        return leaveRepository.save(newLeave);
//    }
//    public void deleteByLeaveId(Long id){
//        leaveRepository.deleteById(id);
//    }
//    public List<Leave> findAlLeave(){
//        return leaveRepository.findAll();
//    }
//    public Optional<Leave> findLeaveById(Long id){
//        return leaveRepository.findById(id);
//    }// SEARCH METHODU USER ID ALIR TARIH ARALIGI ALIR DATA BASEDE LEAVE TABLOSUNDA USER ID YE SELECT ATACAGIM KULLANICA DÖNECEĞİM
// FINDBAY STARTDATE ENDDATE YAPISINA ÇEVİRVE , SPRİNG DATA JPA QUERY

}
