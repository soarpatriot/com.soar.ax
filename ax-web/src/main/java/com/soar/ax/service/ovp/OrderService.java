/**
 * 
 */
package com.soar.ax.service.ovp;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tools.ant.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.soar.ax.dao.MyBatisGeneralDao;
import com.soar.ax.entity.ovp.SalesOrder;
import com.soar.ax.service.BaseService;

/**
 * @author liuhb7
 *
 */
@Service("orderService")
public class OrderService extends BaseService{
	
	@Autowired
	private MyBatisGeneralDao ovpMyBatisGeneralDao;

	public List<SalesOrder> findOrderByStartAndEnd(int start,int end){
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("startRowNum", start);
		params.put("endRowNum", end);
		return ovpMyBatisGeneralDao.getSqlSession().selectList("com.soar.ax.entity.ovp.salesOrderSmaillView", params);
	}
	
	
	public List<SalesOrder> findOrderByDMUpdateStartAndEnd(Date start,Date end){
		Map<String,Object> params = new HashMap<String,Object>();
		
		String startStr = DateUtils.format(start, "yyyy-MM-dd");
		String endStr = DateUtils.format(end, "yyyy-MM-dd");
		params.put("startUpdateDMTime", startStr);
		params.put("endUpdateDMTime", endStr);
		return ovpMyBatisGeneralDao.getSqlSession().selectList("com.soar.ax.entity.ovp.findSalesOrderSmallViewByLastUpDM", params);
	}
	
	public void removeFromMongoByOrderNumber(String orderNumber){
		Query query = new Query(Criteria.where("salesOrderNumber").is(orderNumber));
		
		removeFromMongo(query, SalesOrder.class);
	}
	
	public MyBatisGeneralDao getOvpMyBatisGeneralDao() {
		return ovpMyBatisGeneralDao;
	}

	public void setOvpMyBatisGeneralDao(MyBatisGeneralDao ovpMyBatisGeneralDao) {
		this.ovpMyBatisGeneralDao = ovpMyBatisGeneralDao;
	}
	
	
}
