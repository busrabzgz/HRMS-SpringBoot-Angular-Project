package com.example.humanresources.services;


import com.example.humanresources.repository.AddressRepository;
import com.example.humanresources.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    
    private UserRepository userRepository;
    private AddressRepository addressRepository;



//
//    public AddressInfoResponseDto addAddress(AddessInfoRequestDto addressInfoRequestDto) {
//        AddessInfoRequestDto newAddress = new AddessInfoRequestDto();
//
//
//        return null;
//    }
//
//    public AddressInfoResponseDto updateAddress(AddessInfoRequestDto addressInfoRequestDto) {
//        Address newAddress = new Address();
//        newAddress.setCountry(addressInfoRequestDto.getCountry());
//        newAddress.setCity(addressInfoRequestDto.getCity());
//        newAddress.setQuarter(addressInfoRequestDto.getQuarter());
//        newAddress.setDoorNumber(addressInfoRequestDto.getDoorNumber());
//
//        return null;
//    }
//    public void deleteByAddressId(Long id){
//        AddressRepository.deleteById(id);
//    }
//    public List<Address> findAlAddress(){
//        return AddressRepository.findAll();
//    }
//    public Optional<Address> findAddressById(Long id){
//        return AddressRepository.findById(id);
//    }


}
