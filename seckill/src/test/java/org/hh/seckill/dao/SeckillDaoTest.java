package org.hh.seckill.dao;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dao.xml")
public class SeckillDaoTest {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SeckillDao seckillDao;

	@Test
	public void testQueryAll() {
		log.info(seckillDao.queryAll(0, 100).toString());
	}

	@Test
	public void testQueryById() {
		log.info(seckillDao.queryById(1001).toString());
	}

	@Test
	public void testReduceNumber() {
		log.info(String.valueOf(seckillDao.reduceNumber(1002, new Date())));
	}

}
