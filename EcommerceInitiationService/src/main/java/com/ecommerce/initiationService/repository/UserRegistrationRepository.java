package com.ecommerce.initiationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.initiationService.entity.UserRegistrationsEntity;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistrationsEntity,Long>{
	UserRegistrationsEntity findByRegistrationId(Long registrationId);
}
