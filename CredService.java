package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface CredService {
  String generateEmaild(String firstname,String lastname,String dept);
  String generatePassword();
  void ShowDetails(Employee e1);
}
