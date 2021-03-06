/**
 *
 */
package hhm.neha.data.dao;

import hhm.neha.entity.EventList;

import java.util.List;
import java.util.Map;

public interface EventListDao {
	/**
	 * 根据检索参数、排序和翻页参数获取结果
	 * 
	 * @param params
	 * @param orders
	 * @param firstResult
	 * @param maxResults
	 * @return
	 */
	public List<EventList> getEventListByParamsAndPage(
			Map<String, Object> params, Map<String, Boolean> orders,
			int firstResult, int maxResults);

	/**
	 * 根据检索参数获取结果总数
	 * 
	 * @param params
	 * @return
	 */
	public List<Integer> getCountByParams(Map<String, Object> params);

	/**
	 * 根据主键获取
	 * 
	 * @param id
	 * @return
	 */
	public EventList get(Integer id);
}
