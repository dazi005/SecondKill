package org.hh.seckill.service.impl;

import java.util.List;

import org.hh.seckill.dao.SeckillDao;
import org.hh.seckill.dto.Exposer;
import org.hh.seckill.dto.SeckillExecution;
import org.hh.seckill.entity.Seckill;
import org.hh.seckill.exception.RepeatSeckillException;
import org.hh.seckill.exception.SeckillCloseException;
import org.hh.seckill.exception.SeckillException;
import org.hh.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;

public class SeckillServiceImpl extends BaseServiceImpl implements
		SeckillService {

	@Autowired
	private SeckillDao seckillDao;

	public List<Seckill> getSeckillList(int pageNow, int pageSize) {
		seckillDao.queryAll((pageNow - 1) * pageSize, pageSize);
		return null;
	}

	public Seckill getSeckillById(long seckilId) {
		return null;
	}

	public SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws RepeatSeckillException, SeckillCloseException, SeckillException {
		return null;
	}

	public Exposer exportSeckillUrl(long seckillId) {
		return null;
	}
}
