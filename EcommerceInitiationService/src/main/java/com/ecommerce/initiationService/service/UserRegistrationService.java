package com.ecommerce.initiationService.service;

import org.springframework.http.ResponseEntity;

import com.ecommerce.initiationService.vo.RequestVo;
import com.ecommerce.initiationService.vo.ResponseVo;

public interface UserRegistrationService {
     public ResponseVo userLogin(RequestVo requestVo);
     public ResponseVo userSignUp(RequestVo requestVo);
     public ResponseVo userVerify(RequestVo requestVo);
}
