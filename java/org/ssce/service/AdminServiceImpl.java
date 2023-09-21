package org.ssce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssce.model.Admin;

import org.ssce.repository.AdminRepository;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
	private AdminRepository adminRepository;
	@Override
	public Admin addAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public Admin findById(Integer adminId) {
		Optional<Admin> us=adminRepository.findById(adminId);
		if(us.isPresent())
		{
			return us.get();
		}
		else
		return null;
	}

	@Override
	public Admin deleteAdmin(Integer adminId) {
		Optional<Admin> us = adminRepository.findById(adminId);
		if (us.isPresent()) {
			Admin admin = us.get();
			adminRepository.delete(admin);
			return admin;
		}
		return null;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
	
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> getAllAdmins() {
		
		return adminRepository.findAll();
	}

	
}
