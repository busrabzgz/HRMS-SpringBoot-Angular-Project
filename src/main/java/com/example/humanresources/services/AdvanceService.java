package com.example.humanresources.services;


import com.example.humanresources.dto.requestDTO.CreateAdvanceRequestDto;
import com.example.humanresources.dto.responseDTO.AdvanceResponseDto;
import com.example.humanresources.entity.Advance;
import com.example.humanresources.entity.Advance;
import com.example.humanresources.entity.User;
import com.example.humanresources.mapper.AdvanceMapper;
import com.example.humanresources.repository.AdvanceRepository;
import com.example.humanresources.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor // final olmali yazdigim class
@Slf4j
@AllArgsConstructor
@Service
public class AdvanceService {
    private  UserService userService;
    private  UserRepository userRepository;
    private  AdvanceMapper advanceMapper;
    private  AdvanceRepository advanceRepository;

    public AdvanceResponseDto createAdvance(CreateAdvanceRequestDto createAdvanceRequestDto)  throws Exception{
        Advance advance = advanceMapper.toAdvanceFromCreateAdvanceRequestDto(createAdvanceRequestDto);

        advance.setUser(userRepository.getReferenceById(createAdvanceRequestDto.getUserId()));

        return advanceMapper.toAdvanceResponseDtoFromAdvance(advanceRepository.save(advance));


    }
    public void deleteAdvanceId(Long id) {
        advanceRepository.deleteById(id);
    }

    public List<Advance> findAllAdvanceByUserId(User user) {
        return advanceRepository.getByUser(user);
    }


}
