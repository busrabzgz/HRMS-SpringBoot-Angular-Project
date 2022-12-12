package com.example.humanresources.services;

import com.example.humanresources.dto.requestDTO.CreateLeaveRequestDto;
import com.example.humanresources.dto.requestDTO.CreateOvertimeWorkRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateLeaveRequestDto;
import com.example.humanresources.dto.responseDTO.LeaveResponseDto;
import com.example.humanresources.dto.responseDTO.OvertimeWorkResponseDto;
import com.example.humanresources.dto.responseDTO.UserResponseDto;
import com.example.humanresources.entity.Expense;
import com.example.humanresources.entity.Leave;
import com.example.humanresources.entity.OvertimeWork;
import com.example.humanresources.entity.User;
import com.example.humanresources.mapper.LeaveMapper;
import com.example.humanresources.repository.LeaveRepository;
import com.example.humanresources.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@AllArgsConstructor
@Service
public class LeaveService {

    private UserRepository userRepository;
    private LeaveRepository leaveRepository;
    private LeaveMapper leaveMapper;

    public LeaveResponseDto createLeave(CreateLeaveRequestDto createLeaveRequestDto)  throws Exception{
        Leave leave = leaveMapper.toLeaveFromCreateLeaveRequestDto(createLeaveRequestDto);

        leave.setUser(userRepository.getReferenceById(createLeaveRequestDto.getUserId()));

        return leaveMapper.toLeaveResponseDtoFromLeave(leaveRepository.save(leave));
    }
    public LeaveResponseDto updateLeave(UpdateLeaveRequestDto updateLeaveRequestDto) throws Exception {
        Leave leave = leaveRepository.getReferenceById(updateLeaveRequestDto.getUserId());
        leave.setType(updateLeaveRequestDto.getType());
        leave.setTotalDays(updateLeaveRequestDto.getTotalDays());
        leave.setStartOfLeave(updateLeaveRequestDto.getStartOfLeave());
        leave.setEndOfLeave(updateLeaveRequestDto.getEndOfLeave());
        // leave.setType(enterLeaveRequestDto.setType());//enum geçme
        leave.setDescription(updateLeaveRequestDto.getDescription());
        leave.setDateOfReturn(updateLeaveRequestDto.getDateOfReturn());
        leave=leaveRepository.save(leave);
        LeaveResponseDto leaveResponseDto = leaveMapper.toLeaveResponseDtoFromLeave(leave);

        return leaveResponseDto;

    }

    public List<Leave> findAlLeave() {
        return leaveRepository.findAll();
    }
    public Optional<Leave> findLeaveById(Long id) {
        return leaveRepository.findById(id);

    }
    public void deleteByLeaveById(Long id){
        leaveRepository.deleteById(id);

    }


    public List<Leave> findAllLeaveByUserId(User user) {
        return leaveRepository.getByUserId(user);
    }
}



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
////    }// SEARCH METHODU USER ID ALIR TARIH ARALIGI ALIR DATA BASEDE LEAVE TABLOSUNDA USER ID YE SELECT ATACAGIM KULLANICA DÖNECEĞİM
//// FINDBAY STARTDATE ENDDATE YAPISINA ÇEVİRVE , SPRİNG DATA JPA QUERY
//
//}
