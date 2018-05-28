package com.neuedu.mapper;

import com.neuedu.entity.Dept;

import java.util.List;

public interface DeptMapper {

    /**
     * 查村所有dept
     * @return
     */
    List<Dept> listDept();

    /**
     * 根据id的数组来删除多个dept
     * @param ids
     * @return 影响行数
     */
    int deleteDeptById(int[] ids);

}
