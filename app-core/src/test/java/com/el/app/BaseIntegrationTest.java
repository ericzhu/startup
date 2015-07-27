package com.el.app;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("base-application-test-context.xml")
@Transactional
@TransactionConfiguration(defaultRollback=false)
public abstract class BaseIntegrationTest {
	// add common methods here
}
