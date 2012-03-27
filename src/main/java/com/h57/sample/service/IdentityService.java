package com.h57.sample.service;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Sha512Hash;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h57.sample.domain.Identity;
import com.h57.sample.form.RegistrationForm;
import com.h57.sample.persistence.IdentityMapper;

/**
 * myBatis Identity Service for our Identity Domain object
 * 
 * @author Bubba Hines (bubba@hines57.com)
 * 
 */
@Service
public class IdentityService {

	@Autowired(required = true)
	private IdentityMapper identityMapper;

	private static final Logger logger = LoggerFactory
			.getLogger(IdentityService.class);

	@Autowired(required = true)
	private HashedCredentialsMatcher sha512Matcher;

	public Identity registerIdentity(RegistrationForm registration) {

		registration.setSalt(getSalt());
		registration.setPassphrase(encodePassphrase(
				registration.getPassphrase(), registration.getSalt()));

		// Insert the Identity
		identityMapper.registerIdentity(registration);

		logger.trace("INSERTED ID = (" + registration.getId() + ")");
		// Get a new Identity object, fully populated from the DB
		return this.getIdentity(registration.getId());

	}

	public static String getSalt() {
		return new SecureRandomNumberGenerator().nextBytes().toBase64();
	}

	public String encodePassphrase(String rawPassphrase, String salt) {
		return new Sha512Hash(rawPassphrase, salt,
				sha512Matcher.getHashIterations()).toBase64();
	}

	public Identity getIdentity(int id) {
		logger.trace("Entering getIdentity(" + id + ")");
		if (identityMapper == null) {
			logger.debug("identityMapper didn't get autowired!");
		}
		return identityMapper.getIdentityById(id);
	}

	public Identity getIdentity(String userId) {
		logger.trace("Entering getIdentity(" + userId + ")");
		if (identityMapper == null) {
			logger.debug("identityMapper didn't get autowired!");
		}
		return identityMapper.getIdentityByUserId(userId);
	}

	public void setIdentityMapper(IdentityMapper identityMapper) {
		this.identityMapper = identityMapper;
	}
}