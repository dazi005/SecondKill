package org.hh.seckill.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
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
public interface SeckillDao extends IBaseDao<Seckill> {
	
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
	List<Seckill> queryAll(@Param("offset") int offset,
			@Param("limit") int limit);

	/**
	 * 
	 * @Description: TODO 查询秒杀商品
	 * @MethodName queryById
	 * @Author huangh
	 * @param seckillId
	 *            商品ID
	 * @return
	 */
	Seckill queryById(@Param("seckillId") long seckillId);

	/**
	 * 
	 * @Description: TODO 减少库存数量 update number字段
	 * @MethodName reduceNumber
	 * @Author huangh
	 * @param seckillId
	 *            商品ID
	 * @param killTime
	 *            秒杀时间
	 * @return
	 */
	int reduceNumber(@Param("seckillId") long seckillId,
			@Param("killTime") Date killTime);

}
