package com.example.humanresources.services;

import com.example.humanresources.dto.requestDTO.CreateLeaveRequestDto;
import com.example.humanresources.dto.requestDTO.CreateOvertimeWorkRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateLeaveRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateOvertimeWorkRequestDto;
import com.example.humanresources.dto.responseDTO.LeaveResponseDto;
import com.example.humanresources.dto.responseDTO.OvertimeWorkResponseDto;
import com.example.humanresources.dto.responseDTO.UserResponseDto;
import com.example.humanresources.entity.Expense;
import com.example.humanresources.entity.Leave;
import com.example.humanresources.entity.OvertimeWork;
import com.example.humanresources.entity.User;
import com.example.humanresources.exception.LeaveNotFoundException;
import com.example.humanresources.exception.OvertimeWorkNotFoundException;
import com.example.humanresources.mapper.LeaveMapper;
import com.example.humanresources.repository.LeaveRepository;
import com.example.humanresources.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Service
public class LeaveService {

    private final UserRepository userRepository;
    private final LeaveRepository leaveRepository;
    private final LeaveMapper leaveMapper;

    public LeaveResponseDto createLeave(CreateLeaveRequestDto createLeaveRequestDto)  throws Exception{
        Leave leave = leaveMapper.toLeaveFromCreateLeaveRequestDto(createLeaveRequestDto);

        leave.setUser(userRepository.getReferenceById(createLeaveRequestDto.getUserId()));

        return leaveMapper.toLeaveResponseDtoFromLeave(leaveRepository.save(leave));
    }
//    public LeaveResponseDto updateLeave(UpdateLeaveRequestDto updateLeaveRequestDto) throws Exception {
//        Leave leave = leaveRepository.getReferenceById(updateLeaveRequestDto.getUserId());
//        leave.setType(updateLeaveRequestDto.getType());
//        leave.setTotalDays(updateLeaveRequestDto.getTotalDays());
//        leave.setStartOfLeave(updateLeaveRequestDto.getStartOfLeave());
//        leave.setEndOfLeave(updateLeaveRequestDto.getEndOfLeave());
//        leave.setDescription(updateLeaveRequestDto.getDescription());
//        leave.setDateOfReturn(updateLeaveRequestDto.getDateOfReturn());
//        leave=leaveRepository.save(leave);
//        LeaveResponseDto leaveResponseDto = leaveMapper.toLeaveResponseDtoFromLeave(leave);
//
//        return leaveResponseDto;
//
//    }

    public LeaveResponseDto updateLeave(UpdateLeaveRequestDto updateLeaveRequestDto) {
        Optional<Leave> leaveOptional = leaveRepository.findById(updateLeaveRequestDto.getUserId());

        leaveOptional.ifPresent(leave -> {
        leave.setType(updateLeaveRequestDto.getType());
        leave.setTotalDays(updateLeaveRequestDto.getTotalDays());
        leave.setStartOfLeave(updateLeaveRequestDto.getStartOfLeave());
        leave.setEndOfLeave(updateLeaveRequestDto.getEndOfLeave());
        leave.setDescription(updateLeaveRequestDto.getDescription());
        leave.setDateOfReturn(updateLeaveRequestDto.getDateOfReturn());
        leave=leaveRepository.save(leave);
        });

        return leaveOptional.map(leaveMapper::toLeaveResponseDtoFromLeave)
                .orElseThrow(() -> new LeaveNotFoundException("Leave not found!"));
    }


    public Optional<Leave> findLeaveById(Long id) {
        return leaveRepository.findById(id);

    }
    public void deleteLeaveById(Long id){
        leaveRepository.deleteById(id);

    }

    public List<Leave> findAllLeaveByUserId(User user) {
        return leaveRepository.getByUserId(user);
    }
    public List<Leave> findAlLeave() {
        return leaveRepository.findAll();
    }
}


