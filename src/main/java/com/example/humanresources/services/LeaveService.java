package com.example.humanresources.services;

import com.example.humanresources.entity.Leave;
import com.example.humanresources.entity.Leave;
import com.example.humanresources.repository.LeaveRepository;
import com.example.humanresources.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeaveService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LeaveRepository leaveRepository;

    public Leave saveLeave(Leave leave) {
        Leave newLeave = new Leave();
        newLeave.setEmployee(userRepository.getById(leave.getEmployee().getId()));
        return leaveRepository.save(newLeave);
    }
    public void deleteByLeaveId(Long id){
        leaveRepository.deleteById(id);
    }
    public List<Leave> findAlLeave(){
        return leaveRepository.findAll();
    }
    public Optional<Leave> findLeaveById(Long id){
        return leaveRepository.findById(id);
    }


}
