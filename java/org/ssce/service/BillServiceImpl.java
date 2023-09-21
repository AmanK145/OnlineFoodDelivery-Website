package org.ssce.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssce.model.Address;
import org.ssce.model.Bill;
import org.ssce.model.Category;
import org.ssce.repository.BillRepository;
import org.ssce.repository.OrderDetailsRepository;

@Service
public class BillServiceImpl implements BillService{
	@Autowired
	 private BillRepository billRepository;
	@Autowired
	 private OrderDetailsRepository orderDetailsRepository;
	 
	
	@Override
	public Bill addBill(Bill bill) {
		orderDetailsRepository.save(bill.getOrderDetails());
		return billRepository.save(bill);
	}

	@Override
	public Bill updateBill(Bill bill) {
		orderDetailsRepository.save(bill.getOrderDetails());
		return billRepository.save(bill);
	}

	@Override
	public Bill deleteBill(Integer billId) {
		Optional<Bill> add = billRepository.findById(billId);
		if (add.isPresent()) {
			Bill bill = add.get();
			billRepository.delete(bill);
			return bill;
		}
		return null;
	}

	@Override
	public Bill viewBill(Integer billId) {
		Optional<Bill> add=billRepository.findById(billId);
		if(add.isPresent())
		{
			return add.get();
		}
		else
		return null;
	}

	@Override
	public Bill findById(Integer billId) {
		Optional<Bill> opt = billRepository.findById(billId);
		if(opt.isPresent()) {
			Bill bill = opt.get();
			return bill;
		}
		return null;
	}

	@Override
	public List<Bill> viewBills(Integer custId) {
		return null;
	}

	@Override
	public List<Bill> viewBills(LocalDate StartDate, LocalDate endDate) {
		// TODO Auto-generated method stub
		return null;
	}
    @Override
	public Double calculateTotalCost(Bill bill) {
		// TODO Auto-generated method stub
		return null;
	}

}
