/**
 * 
 */
package com.soar.ax.service.issue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.metamodel.Type;

import org.hibernate.Hibernate;
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
		criteria.add(Restrictions.gt("endTime", getRecentlyDate(0)));  
		criteria.add(Restrictions.lt("endTime", getRecentlyDate(1)));  
		return super.findByCriteria(criteria);
	}
	
	public List<WorkContent> findTomorrowWork(){
		DetachedCriteria criteria = DetachedCriteria.forClass(WorkContent.class);
		criteria.add(Restrictions.gt("endTime", getRecentlyDate(1)));  
		criteria.add(Restrictions.lt("endTime", getRecentlyDate(2)));  
		return super.findByCriteria(criteria);	
	}
	
	public List<WorkContent> findYesterdayWork(){
		DetachedCriteria criteria = DetachedCriteria.forClass(WorkContent.class);
		criteria.add(Restrictions.gt("endTime", getRecentlyDate(-1)));  
		criteria.add(Restrictions.lt("endTime", getRecentlyDate(0)));  
		return super.findByCriteria(criteria);	
	}
	
	/**
	 * i = 0 represent today
	 * i = 1 represent tomorrow
	 * i = 2 represent day after tomorrow
	 * @param i
	 * @return
	 */
	private Date getRecentlyDate(int i){
		Date beginDate = new Date();
	    Calendar beginCalendar	= Calendar.getInstance();
	    beginCalendar.setTime(beginDate);
	    beginCalendar.add(Calendar.DAY_OF_MONTH, i);
	    beginCalendar.set(Calendar.HOUR_OF_DAY, 0);
	    beginCalendar.set(Calendar.MINUTE, 0);
	    beginCalendar.set(Calendar.SECOND, 0);
	    beginDate = beginCalendar.getTime();
	    return beginDate;
	}
}
