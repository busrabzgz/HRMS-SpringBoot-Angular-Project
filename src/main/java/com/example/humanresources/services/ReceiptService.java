package com.example.humanresources.services;

import com.example.humanresources.entity.Receipt;
import com.example.humanresources.repository.ReceiptRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.lang.ref.PhantomReference;
import java.util.List;

@RequiredArgsConstructor // final olmali yazdigim class
@Slf4j
@Service
public class ReceiptService {
    private final ReceiptRepository receiptRepository;



    public List<Receipt> createReceipt(List<Receipt> receipts){
        return receiptRepository.saveAll(receipts);
    }

    public List<Receipt> updateReceipt(List<Receipt> receipts){
        return receiptRepository.saveAll(receipts);
    }

    public void deleteReceipt(Long id) {
        receiptRepository.deleteById(id);
    }


}
