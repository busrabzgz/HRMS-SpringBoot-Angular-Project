package com.example.humanresources.services;

import com.example.humanresources.dto.requestDTO.CreateExpenseRequestDto;
import com.example.humanresources.dto.requestDTO.CreateOvertimeWorkRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateOvertimeWorkRequestDto;
import com.example.humanresources.dto.responseDTO.ExpenseResponseDto;
import com.example.humanresources.dto.responseDTO.OvertimeWorkResponseDto;
import com.example.humanresources.entity.Expense;
import com.example.humanresources.entity.OvertimeWork;
import com.example.humanresources.exception.OvertimeWorkNotFoundException;
import com.example.humanresources.mapper.OvertimeWorkMapper;
import com.example.humanresources.repository.OvertimeWorkRepository;
import com.example.humanresources.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor // final olmali yazdigim class
@Slf4j
@Service
public class OvertimeWorkService {

    private final UserRepository userRepository;
    private final OvertimeWorkRepository overtimeWorkRepository;
    private final OvertimeWorkMapper overtimeWorkMapper;





    public OvertimeWorkResponseDto createOvertimeWork(CreateOvertimeWorkRequestDto createOvertimeWorkRequestDto)  throws Exception{
        OvertimeWork overtimeWork = overtimeWorkMapper.toOvertimeWorkFromCreateOvertimeWorkRequestDto(createOvertimeWorkRequestDto);

        overtimeWork.setUser(userRepository.getReferenceById(createOvertimeWorkRequestDto.getUserId()));

        return overtimeWorkMapper.toOvertimeWorkResponseDtoFromOvertimeWork(overtimeWorkRepository.save(overtimeWork));


    }

    public OvertimeWorkResponseDto updateOvertimeWork(UpdateOvertimeWorkRequestDto updateOvertimeWorkRequestDto) {
        Optional<OvertimeWork> overtimeWorkOptional = overtimeWorkRepository.findById(updateOvertimeWorkRequestDto.getUserId());

        overtimeWorkOptional.ifPresent(overtimeWork -> {
            overtimeWork.setStartOfDate(updateOvertimeWorkRequestDto.getStartOfDate());
            overtimeWork.setDuration(updateOvertimeWorkRequestDto.getDuration());
            overtimeWork.setDescription(updateOvertimeWorkRequestDto.getDescription());
            overtimeWork=overtimeWorkRepository.save(overtimeWork);
        });

        return overtimeWorkOptional.map(overtimeWorkMapper::toOvertimeWorkResponseDtoFromOvertimeWork)
                .orElseThrow(() -> new OvertimeWorkNotFoundException("OvertimeWork not found!"));
    }

    public void deleteOvertimeWork(Long id) {
        overtimeWorkRepository.deleteById(id);
    }



}
