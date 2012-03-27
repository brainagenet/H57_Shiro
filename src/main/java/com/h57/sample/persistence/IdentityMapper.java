package com.h57.sample.persistence;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.h57.sample.domain.Identity;
import com.h57.sample.form.RegistrationForm;

/**
 * MyBatis Mapper Interface for our Identity Domain
 * 
 * @author Bubba Hines (bubba@hines57.com)
 * 
 */
@Component
public interface IdentityMapper {

	public Identity getIdentityById(@Param("id") int id);

	public Identity getIdentityByUserId(@Param("userId") String userId);

	public Integer registerIdentity(RegistrationForm registration);
}