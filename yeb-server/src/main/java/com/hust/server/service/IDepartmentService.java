package com.hust.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hust.server.pojo.Department;
import com.hust.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2021-12-27
 */
public interface IDepartmentService extends IService<Department> {

    /**
     * 获取所有部门
     * @return
     */
    List<Department> getAllInFo();

    /**
     * 添加部门
     * @param department
     * @return
     */
    RespBean addDept(Department department);

    /**
     * 删除部门
     * @param id
     * @return
     */
    RespBean deleteDept(Integer id);

}
