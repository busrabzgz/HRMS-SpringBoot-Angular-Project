package com.example.humanresources.services;

import com.example.humanresources.entity.Charge;
import com.example.humanresources.repository.ChargesRepository;
import com.example.humanresources.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ChargeService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ChargesRepository chargesRepository;

    public Charge createCharge(Charge charge) {
        Charge newCharge = new Charge();
        newCharge.setEmployees(userRepository.findAllById(charge.getEmployees().stream().map(em -> em.getId()).collect(Collectors.toList())));
        return chargesRepository.save(newCharge);
    }

    public Charge updateCharge(Charge charge) {
        Charge newCharge = new Charge();
        newCharge.setEmployees(userRepository.findAllById(charge.getEmployees().stream().map(em -> em.getId()).collect(Collectors.toList())));
        return chargesRepository.save(newCharge);
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
