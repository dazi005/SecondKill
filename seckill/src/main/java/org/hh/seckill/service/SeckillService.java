package org.hh.seckill.service;

import java.util.List;

import org.hh.seckill.dto.Exposer;
import org.hh.seckill.dto.SeckillExecution;
import org.hh.seckill.entity.Seckill;
import org.hh.seckill.exception.RepeatSeckillException;
import org.hh.seckill.exception.SeckillCloseException;
import org.hh.seckill.exception.SeckillException;

/**
 * 业务接口:站在"使用者"的角度设计接口 三个指标：方法定义粒度、 参数、返回类型（return类型 或 异常）
 * 
 * @Description: TODO
 * @Author Administrator
 * @Prject: seckill
 * @Title: SeckillService.java
 * @Package: org.hh.seckill.service
 * @CreateDate 2016年6月3日 下午4:30:38
 * @UpdateAuthor Administrator
 * @UpdateDate: 2016年6月3日 下午4:30:38
 *
 * @Version 1.0.0
 */
public interface SeckillService extends IBaseService {

	/**
	 * 
	 * @Description: TODO 查询秒杀列表
	 * @MethodName getSeckillList
	 * @Author Administrator
	 * @param pageNow
	 *            当前页号
	 * @param limit
	 *            页大小
	 * @return
	 */
	List<Seckill> getSeckillList(int pageNow, int pageSize);

	/**
	 * 
	 * @Description: TODO
	 * @MethodName getSeckillById
	 * @Author huangh
	 * @param seckilId
	 * @return
	 */
	Seckill getSeckillById(long seckilId);

	SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
			throws RepeatSeckillException, SeckillCloseException,
			SeckillException;

	/**
	 * 秒杀开启时输出 秒杀接口地址 秒杀未开启 输出 系统时间
	 * 
	 * @Description: TODO 获取秒杀入口信息
	 * @MethodName exportSeckillUrl
	 * @Author Administrator
	 * @param seckillId
	 * @return
	 */
	Exposer exportSeckillUrl(long seckillId);
}
