package org.hh.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.hh.seckill.entity.SuccessKilled;

/**
 * 
 * @Description: TODO 
 * @Author huangh 
 * @Prject: seckill 
 * @Title: SuccessKilledDao.java 
 * @Package: org.hh.seckill.dao 
 * @CreateDate 2016年6月2日 下午5:39:52 
 * @UpdateAuthor huangh 
 * @UpdateDate: 2016年6月2日 下午5:39:52 
 *
 * @Version 1.0.0
 */
public interface SuccessKilledDao extends IBaseDao<SuccessKilled> {

	/**
	 * 
	 * @Description: TODO 记录秒杀成功的订单信息
	 * @MethodName saveSuccessKilled
	 * @Author huangh
	 * @param seckillId
	 *            秒杀商品ID
	 * @param userPhone
	 *            用户手机号
	 * @return
	 */
	int saveSuccessKilled(@Param("seckillId") long seckillId,
			@Param("userPhone") long userPhone);

	/**
	 * 
	 * @Description: TODO 根据商品id和用户手机号查询订单信息 包含商品信息
	 * @MethodName queryByIDSuccessKilled
	 * @Author huangh
	 * @param seckillId
	 *            秒杀商品ID
	 * @param userPhone
	 *            用户手机号
	 * @return
	 */
	SuccessKilled queryByIDSuccessKilled(@Param("seckillId") long seckillId,
			@Param("userPhone") long userPhone);
}
