package org.hsc.demo.mapper;

import org.hsc.demo.entity.SysConfigrationData;

public interface SysConfigrationDataMapper {
    int insert(SysConfigrationData record);

    int insertSelective(SysConfigrationData record);
}