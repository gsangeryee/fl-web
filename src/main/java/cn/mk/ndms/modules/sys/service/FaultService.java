package cn.mk.ndms.modules.sys.service;

import java.util.List;

import cn.mk.ndms.domain.Fault;

import com.springframework.base.service.GenericService;

/** 
 * @author 作者 :范津 
 * @version 创建时间：2014年1月16日 上午10:56:54 
 * 类说明 
 */
public interface FaultService extends GenericService<Fault, String>{

	public List<Fault> findByStatus(Short status);
	
	public Fault findByName(String name);
}
