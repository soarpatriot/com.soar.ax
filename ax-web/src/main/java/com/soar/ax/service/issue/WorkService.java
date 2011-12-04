/**
 * 
 */
package com.soar.ax.service.issue;

import java.util.Date;
import java.util.List;

import org.apache.commons.httpclient.util.DateUtil;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.soar.ax.entity.issue.WorkContent;
import com.soar.ax.service.BaseService;

/**
 * @author liuhb7
 *
 */
@Service("workService")
public class WorkService extends BaseService<WorkContent>{
	
	public List<WorkContent> findTodayWork(){
		DetachedCriteria criteria = DetachedCriteria.forClass(WorkContent.class);
		//Expression()
		Date todayBegin = new Date();
		todayBegin.setHours(0);
		todayBegin.setMinutes(0);
		todayBegin.setSeconds(0);
		String beginStr = DateUtil.formatDate(todayBegin, "yyyy-MM-dd ");
		
		Date todayEnd = new Date();
		todayEnd.setHours(23);
		todayEnd.setMinutes(59);
		todayEnd.setSeconds(59);
		
		
		criteria.add(Restrictions.gt("beginTime", todayBegin));  
		criteria.add(Restrictions.lt("endTime", todayEnd));  
		return super.findByCriteria(criteria);//
		
	}
}
