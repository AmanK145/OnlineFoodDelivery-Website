package org.ssce.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.ssce.model.Admin;
@Service
public interface AdminService {
	
	public Admin addAdmin(Admin admin);
	public Admin findById(Integer adminId);
	public Admin deleteAdmin(Integer adminId);
	public Admin updateAdmin(Admin admin);
	public List<Admin> getAllAdmins();
}
