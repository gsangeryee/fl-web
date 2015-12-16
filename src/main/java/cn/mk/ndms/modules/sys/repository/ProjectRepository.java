package cn.mk.ndms.modules.sys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import cn.mk.ndms.domain.Project;

import com.springframework.base.repository.GenericRepository;

/** 
 * @author 作者 :范津 
 * @version 创建时间：2014年1月16日 上午10:55:44 
 * 类说明  
 */
public interface ProjectRepository extends GenericRepository<Project, String>{

	@Query("from Project p where p.flag=1")
	public List<Project> findAllByStatus();
	
	@Query("select a from Project a where a.id in (?1)")
	public List<Project> findByIds(List<String> ids);
	
	@Query("from Project p where p.flag=1 and p.typeId=?1")
	public List<Project> findAllByStatusAndTypeId(String typeId);
}
