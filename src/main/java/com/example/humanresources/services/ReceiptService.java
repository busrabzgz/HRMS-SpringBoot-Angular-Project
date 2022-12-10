package com.example.humanresources.services;

import com.example.humanresources.entity.Receipt;
import com.example.humanresources.repository.ReceiptRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.ref.PhantomReference;
import java.util.List;

@Service
@AllArgsConstructor
public class ReceiptService {
    private ReceiptRepository receiptRepository;


    public List<Receipt> createReceipt(List<Receipt> receipts){
        return receiptRepository.saveAll(receipts);
    }

    public void deleteReceipt(Long id) {
        receiptRepository.deleteById(id);
    }


}
