package com.ecommerce.initiationService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.initiationService.serviceImpl.UserRegistrationServiceImpl;
import com.ecommerce.initiationService.vo.RequestVo;
import com.ecommerce.initiationService.vo.ResponseVo;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@ControllerAdvice
@RequestMapping(path="/registration")
public class UserRegistrationsController {
//    private final boolean isInfoEnalbed=log.isInfoEnabled;
	@Autowired
	private  UserRegistrationServiceImpl userRegistrationService;
	@PostMapping("/user-login")
	public ResponseEntity<ResponseVo> userLogin(@RequestBody RequestVo requestVo){
		ResponseVo responseVo=null;
		try {
			responseVo=userRegistrationService.userLogin(requestVo);
		}catch(Exception e) {
			e.printStackTrace();
		}
	   return new ResponseEntity<>(responseVo,HttpStatus.OK);
	}
}
