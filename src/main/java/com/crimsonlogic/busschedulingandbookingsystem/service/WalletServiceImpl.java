package com.crimsonlogic.busschedulingandbookingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimsonlogic.busschedulingandbookingsystem.entity.User;
import com.crimsonlogic.busschedulingandbookingsystem.entity.Wallet;
import com.crimsonlogic.busschedulingandbookingsystem.exception.ResourceNotFoundException;
import com.crimsonlogic.busschedulingandbookingsystem.repository.IWalletRepository;

@Service
public class WalletServiceImpl implements IWalletService{
    @Autowired
    private IWalletRepository walletRepo;
    
    @Override
    public List<Wallet> getAllWallets() {
        return walletRepo.findAll();
    }
    
    @Override
    public Wallet getWalletById(Integer id) {
        return walletRepo.findById(id).get();
    }
    
    @Override
    public Wallet createWallet(Wallet wallet) {
        return walletRepo.save(wallet);
    }
   
    @Override
    public Wallet updateWalletbyId(Integer walletID, Wallet wallet) {
    	Wallet exWallet = getWalletById(walletID);
        wallet.setWalletId(walletID);
        wallet.setUser(exWallet.getUser());
        return walletRepo.save(wallet);
    }
    
    @Override
    public void deleteWalletbyId(Integer id) {
    	walletRepo.deleteById(id);
    }

//	@Override
//	public Optional<Wallet> getWalletByUser(String username) {
//		return walletRepo.findByUser(username);
//	}
}

