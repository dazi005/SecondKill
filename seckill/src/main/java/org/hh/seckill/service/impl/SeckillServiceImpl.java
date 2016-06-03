package org.hh.seckill.service.impl;

import org.hh.seckill.dto.Exposer;
import org.hh.seckill.dto.SeckillExecution;
import org.hh.seckill.entity.Seckill;
import org.hh.seckill.exception.RepeatSeckillException;
import org.hh.seckill.exception.SeckillCloseException;
import org.hh.seckill.exception.SeckillException;
import org.hh.seckill.service.SeckillService;

import java.util.List;

public class SeckillServiceImpl extends BaseServiceImpl implements
		SeckillService {

	public List<Seckill> getSeckillList(int offset, int limit) {
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
