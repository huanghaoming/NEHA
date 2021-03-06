/**
 *
 */
package hhm.neha.service;

import hhm.neha.entity.PointMultipleHourly;

import java.util.List;
import java.util.Map;

public interface PointMultipleHourlyService {
	/**
	 * 根据检索参数和翻页参数获取
	 * 
	 * @param params
	 * @param firstResult
	 * @param maxResults
	 * @return
	 */
	public List<PointMultipleHourly> getMultipleHourPointByParamsAndPage(
			Map<String, Object> params, int firstResult, int maxResults);
}
