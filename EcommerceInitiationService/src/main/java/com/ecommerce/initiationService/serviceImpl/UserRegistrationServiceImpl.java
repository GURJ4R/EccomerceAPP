package com.ecommerce.initiationService.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ecommerce.initiationService.entity.UserRegistrationsEntity;
import com.ecommerce.initiationService.repository.UserRegistrationRepository;
import com.ecommerce.initiationService.service.UserRegistrationService;
import com.ecommerce.initiationService.utility.PortalUtility;
import com.ecommerce.initiationService.vo.RequestVo;
import com.ecommerce.initiationService.vo.ResponseVo;

import lombok.RequiredArgsConstructor;

@Service
//@slf4j
@RequiredArgsConstructor
@EnableTransactionManagement
public class UserRegistrationServiceImpl implements UserRegistrationService{
    
	@Autowired
	private UserRegistrationRepository userRegistrationRepository;
	
	@Override
	public ResponseVo userLogin(RequestVo requestVo) {
		ResponseVo responseVo=null;
		UserRegistrationsEntity entity=null;
		try {
			responseVo=new ResponseVo();
			UserRegistrationsEntity userRegistrationEntity=(UserRegistrationsEntity)PortalUtility.ConvertJsonToEntity(requestVo, UserRegistrationsEntity.class);
			userRegistrationEntity.setCreatedBy(userRegistrationEntity.getUsername());
			userRegistrationEntity.setApplicationNumber(PortalUtility.getTxnRefNo());
			userRegistrationEntity.setCreatedOn(PortalUtility.getCurrentDateTime());
			entity=userRegistrationRepository.save(userRegistrationEntity);
			responseVo.setData(userRegistrationEntity);
			PortalUtility.createSuccessResponse(responseVo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return responseVo;
	}

	@Override
	public ResponseVo userSignUp(RequestVo requestVo) {
		ResponseVo responseVo=new ResponseVo();
		UserRegistrationsEntity entity=null;
		try {
			UserRegistrationsEntity userRegistrationEntity=(UserRegistrationsEntity)PortalUtility.ConvertJsonToEntity(requestVo, UserRegistrationsEntity.class);
			entity=userRegistrationRepository.save(userRegistrationEntity);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return responseVo;
	}

	@Override
	public ResponseVo userVerify(RequestVo requestVo) {
		ResponseVo responseVo=new ResponseVo();
		UserRegistrationsEntity entity=null;
		try {
			UserRegistrationsEntity userRegistrationEntity=(UserRegistrationsEntity)PortalUtility.ConvertJsonToEntity(requestVo, UserRegistrationsEntity.class);
			entity=userRegistrationRepository.save(userRegistrationEntity);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return responseVo;
	}

}
