package org.hh.seckill.dao;

import org.hh.seckill.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dao.xml")
public class IBaseDaoTest {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IBaseDao<Seckill> baseDao;

	@Test
	public void testSelectAll() {
		log.info("log:" + baseDao.selectAll());
	}


}
