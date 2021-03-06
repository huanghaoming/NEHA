/**
 *
 */
package hhm.neha.data.dao;

import hhm.neha.entity.PointMultipleRealTime;

import java.util.List;
import java.util.Map;

public interface PointMultipleRealTimeDao {
	/**
	 * 根据检索参数和翻页参数获取数据集
	 * 
	 * @param params
	 * @param firstResult
	 * @param maxResults
	 * @return
	 */
	public List<PointMultipleRealTime> getMultiplePointByParamsAndPage(
			Map<String, Object> params, int firstResult, int maxResults);

}
