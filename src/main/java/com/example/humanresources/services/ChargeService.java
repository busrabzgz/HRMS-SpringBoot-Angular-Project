package com.example.humanresources.services;

import com.example.humanresources.dto.requestDTO.ChargeRequestDto;
import com.example.humanresources.dto.responseDTO.ChargeResponseDto;
import com.example.humanresources.entity.Charge;
import com.example.humanresources.repository.ChargesRepository;
import com.example.humanresources.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class ChargeService extends AbstractService<Charge, ChargeRequestDto, ChargeResponseDto>{

    private UserRepository userRepository;

    private ChargesRepository chargesRepository;

//    public Charge createCharge(Charge charge) {
//        Charge newCharge = new Charge();
//        newCharge.setUser(userRepository.getReferenceById(charge.getUser().getId()));
//        return chargesRepository.save(newCharge);
//    }
//
//    public Charge updateCharge(Charge charge) {
//        Charge newCharge = new Charge();
//        newCharge.setUser(userRepository.getReferenceById(charge.getUser().getId()));
//        return chargesRepository.save(newCharge);
//    }
//    public void deleteByChargeId(Long id){
//        chargesRepository.deleteById(id);
//    }
//    public List<Charge> findAlCharge(){
//        return chargesRepository.findAll();
//    }
//    public Optional<Charge> findChargeById(Long id){
//        return chargesRepository.findById(id);
//    }






}
