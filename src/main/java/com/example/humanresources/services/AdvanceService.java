package com.example.humanresources.services;


import com.example.humanresources.dto.requestDTO.CreateAdvanceRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateAdvanceRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateLeaveRequestDto;
import com.example.humanresources.dto.responseDTO.AdvanceResponseDto;
import com.example.humanresources.dto.responseDTO.LeaveResponseDto;
import com.example.humanresources.entity.Advance;
import com.example.humanresources.entity.Advance;
import com.example.humanresources.entity.Leave;
import com.example.humanresources.entity.User;
import com.example.humanresources.exception.AdvanceNotFoundException;
import com.example.humanresources.exception.LeaveNotFoundException;
import com.example.humanresources.mapper.AdvanceMapper;
import com.example.humanresources.repository.AdvanceRepository;
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
public class AdvanceService {
    private  final UserRepository userRepository;
    private  final AdvanceMapper advanceMapper;
    private final AdvanceRepository advanceRepository;

    public AdvanceResponseDto createAdvance(CreateAdvanceRequestDto createAdvanceRequestDto)  throws Exception{

        Advance advance = advanceMapper.toAdvanceFromCreateAdvanceRequestDto(createAdvanceRequestDto);

        advance.setUser(userRepository.getReferenceById(createAdvanceRequestDto.getUserId()));

        return advanceMapper.toAdvanceResponseDtoFromAdvance(advanceRepository.save(advance));


    }

    public AdvanceResponseDto updateAdvance(UpdateAdvanceRequestDto updateAdvanceRequestDto) {
        Optional<Advance> advanceOptional = advanceRepository.findById(updateAdvanceRequestDto.getUserId());

        advanceOptional.ifPresent(advance -> {
            advance.setAmount(updateAdvanceRequestDto.getAmount());
            advance.setDescription(updateAdvanceRequestDto.getDescription());
            advance.setDate(updateAdvanceRequestDto.getDate());
            advance.setRepayment(updateAdvanceRequestDto.getRepayment());

            advance=advanceRepository.save(advance);
        });

        return advanceOptional.map(advanceMapper::toAdvanceResponseDtoFromAdvance)
                .orElseThrow(() -> new AdvanceNotFoundException("Advance not found!"));
    }

    public Optional<Advance> findAdvanceById(Long id) {
        return advanceRepository.findById(id);

    }

    public void deleteAdvanceById(Long id) {
        advanceRepository.deleteById(id);
    }

    public List<Advance> findAllAdvanceByUserId(User user) {
        return advanceRepository.getByUser(user);
    }

    public void delete(){
    }




}
