package com.el.cms;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.el.cms.model.User;
import com.el.cms.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("base-cms-test-context.xml")
@Transactional
@TransactionConfiguration(defaultRollback=false)
public class BaseCmsIntegrationTest {
	
	@Inject
	@Named("userRepositoryJpa")
	protected UserRepository userRepository;
	
	@Test
	public void testSave() {
		
		User u = new User();
		u.setUsername("abc");
		u.setPassword("123");
		
		userRepository.save(u);
	}
	
}
