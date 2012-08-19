/**
 * Copyright (c) 2011, Lenovo Group, Ltd. All rights reserved.
 */
package com.soar.ax.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>
 * 
 * <dl>
 * <dt><b>Examples:</b></dt>
 * <p>
 * <pre>
 * 
 * </pre>
 * 
 * <p><dt><b>Thread Safety:</b></dt> 
 * <dd>
 * 	<b>NOT-THREAD-SAFE</b> and <b>NOT-APPLICABLE</b> (for it will never be used on multi-thread occasion.)
 * </dd>
 * 
 * <p><dt><b>Serialization:</b></dt>
 * <dd>
 * 	<b>NOT-SERIALIIZABLE</b> and <b>NOT-APPLICABLE</b> (for it have no need to be serializable.)
 * </dd>
 * 
 * <p><dt><b>Design Patterns:</b></dt>
 * <dd>
 * 	
 * </dd>
 * 
 * <p><dt><b>Change History:</b></dt>
 * <dd>
 * 	Date		Author		Action
 * </dd>
 * <dd>
 * 	Apr 24, 2011	Soar	Create the class
 * </dd>
 * 
 * </dl>
 * @author	Soar
 * @see			
 * @see			
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config/spring-context.xml",
			   "classpath:spring-config/spring-context-transactionPolicy.xml",
			  
			
				"classpath:spring-config/spring-context-log.xml",
				"classpath:spring-config/spring-context-security.xml",
				"classpath:spring-config/spring-context-mongo.xml"
})
/*@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)
@Transactional*/
public class BaseTest {
		public BaseTest()
		{
			
		}
		
		@Test
		public void testBase()
		{
			
		}
}
