package org.hh.seckill.dao;

import java.util.List;

public interface IBaseDao<T> {

	/**
	 * 插入一个映射对象
	 * 
	 * @Description: TODO
	 * @MethodName insert
	 * @Author huangh
	 * @param t
	 *            需要插入的对象实体
	 * @return 影响的记录数
	 */
	int insert(T t);

	/**
	 * 删除一个实体对象
	 * 
	 * @Description: TODO
	 * @MethodName delete
	 * @Author huangh
	 * @param t
	 *            需要删除的实体对象
	 * @return
	 */
	int delete(T t);

	/**
	 * 查询所有实体记录
	 * 
	 * @Description: TODO
	 * @MethodName selectAll
	 * @Author huangh
	 * @return
	 */
	List<T> selectAll();

	/**
	 * 查询记录总数
	 * 
	 * @Description: TODO
	 * @MethodName selectAllRowCount
	 * @Author huangh
	 * @return
	 */
	long selectAllRowCount();

	/**
	 * 更新实体记录
	 * 
	 * @Description: TODO
	 * @MethodName update
	 * @Author huangh
	 * @param t
	 * @return
	 */
	int update(T t);
}
