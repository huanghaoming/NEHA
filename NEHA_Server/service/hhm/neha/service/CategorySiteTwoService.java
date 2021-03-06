/**
 *
 */
package hhm.neha.service;

import hhm.neha.entity.CategorySiteTwo;

import java.util.List;
import java.util.Map;

public interface CategorySiteTwoService {
	/**
	 * 根据检索条件和翻页参数获取结果
	 * 
	 * @param params
	 * @param firstResult
	 * @param maxResults
	 * @return
	 */
	public List<CategorySiteTwo> getCategorySiteTwoByParamsAndPage(
			Map<String, Object> params, int firstResult, int maxResults);
}
