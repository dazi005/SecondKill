package org.hh.seckill.dao;

import java.util.Date;
import java.util.List;

import org.hh.seckill.entity.Seckill;

/**
 * 
 * @Description: TODO
 * @Author huangh
 * @Prject: seckill
 * @Title: SeckillDao.java
 * @Package: org.hh.seckill.dao
 * @CreateDate 2016年6月2日 下午5:27:42
 * @UpdateAuthor huangh
 * @UpdateDate: 2016年6月2日 下午5:27:42
 *
 * @Version 1.0.0
 */
public interface SeckillDao extends IBaseDao {
	
	/**
	 * 
	 * @Description: TODO 查询所有秒杀商品
	 * @MethodName queryAll
	 * @Author huangh
	 * @param offset
	 *            分页 第几条开始
	 * @param limit
	 *            分页 查询多少条
	 * @return
	 */
	List<Seckill> queryAll(int offset,int limit);

	/**
	 * 
	 * @Description: TODO 查询秒杀商品
	 * @MethodName queryById
	 * @Author huangh
	 * @param seckillId
	 *            商品ID
	 * @return
	 */
	Seckill queryById(long seckillId);

	/**
	 * 
	 * @Description: TODO 减少库存数量
	 * @MethodName reduceNumber
	 * @Author huangh
	 * @param seckillId
	 *            商品ID
	 * @param killTime
	 *            秒杀时间
	 * @return
	 */
	int reduceNumber(long seckillId, Date killTime);

}