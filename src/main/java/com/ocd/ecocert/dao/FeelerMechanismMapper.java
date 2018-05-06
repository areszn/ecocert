package com.ocd.ecocert.dao;

import com.ocd.ecocert.entity.FeelerMechanism;
import com.ocd.ecocert.entity.FeelerMechanismExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeelerMechanismMapper {
    int countByExample(FeelerMechanismExample example);

    int deleteByExample(FeelerMechanismExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FeelerMechanism record);

    int insertSelective(FeelerMechanism record);

    List<FeelerMechanism> selectByExample(FeelerMechanismExample example);

    FeelerMechanism selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FeelerMechanism record, @Param("example") FeelerMechanismExample example);

    int updateByExample(@Param("record") FeelerMechanism record, @Param("example") FeelerMechanismExample example);

    int updateByPrimaryKeySelective(FeelerMechanism record);

    int updateByPrimaryKey(FeelerMechanism record);
}