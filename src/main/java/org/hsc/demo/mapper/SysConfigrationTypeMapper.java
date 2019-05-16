package org.hsc.demo.mapper;

import org.hsc.demo.entity.SysConfigrationType;

public interface SysConfigrationTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysConfigrationType record);

    int insertSelective(SysConfigrationType record);

    SysConfigrationType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysConfigrationType record);

    int updateByPrimaryKeyWithBLOBs(SysConfigrationType record);

    int updateByPrimaryKey(SysConfigrationType record);
}