package com.example.humanresources.services;

import com.example.humanresources.dto.requestDTO.EnterChargeRequestDto;
import com.example.humanresources.dto.responseDTO.EnterChargeResponseDto;
import com.example.humanresources.entity.Charge;
import com.example.humanresources.repository.ChargesRepository;
import com.example.humanresources.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.nio.channels.NonWritableChannelException;
import java.util.List;
import java.util.Optional;


@Service
public class ChargeService {

    private UserRepository userRepository;

    private ChargesRepository chargesRepository;


    public EnterChargeResponseDto addCharge(EnterChargeRequestDto enterChargeRequestDto) {
        EnterChargeRequestDto newCharge = new EnterChargeRequestDto();


        return null;
    }

    public EnterChargeResponseDto updateCharge(EnterChargeRequestDto enterChargeRequestDto) {
        Charge newCharge = new Charge();
//        newCharge.setName(enterChargeRequestDto.getName());
//        newCharge.setType(enterChargeRequestDto.getType());
//        newCharge.setDate(enterChargeRequestDto.getDate());
//        newCharge.setPrice(enterChargeRequestDto.getPrice());
//        newCharge.setDescription(enterChargeRequestDto.getDescription());
        return null;
    }
    public void deleteByChargeId(Long id){
        chargesRepository.deleteById(id);
    }
    public List<Charge> findAlCharge(){
        return chargesRepository.findAll();
    }
    public Optional<Charge> findChargeById(Long id){
        return chargesRepository.findById(id);
    }






}
