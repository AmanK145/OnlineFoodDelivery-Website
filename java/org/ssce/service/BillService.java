package org.ssce.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import org.ssce.model.Bill;
@Service
public interface BillService {
	public  Bill addBill(Bill bill);
	public  Bill updateBill(Bill bill);
	public  Bill deleteBill(Integer billId);
	public  Bill viewBill(Integer billId);
	public  List<Bill> viewBills(Integer customerId);
	public List<Bill>  viewBills(LocalDate StartDate,LocalDate endDate);
	public  Double calculateTotalCost(Bill bill);
	public Bill findById(Integer BillId);
}
