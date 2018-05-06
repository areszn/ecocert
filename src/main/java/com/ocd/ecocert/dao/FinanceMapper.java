package com.ocd.ecocert.dao;

import com.ocd.ecocert.entity.Finance;
import com.ocd.ecocert.entity.FinanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceMapper {
    int countByExample(FinanceExample example);

    int deleteByExample(FinanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Finance record);

    int insertSelective(Finance record);

    List<Finance> selectByExample(FinanceExample example);

    Finance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Finance record, @Param("example") FinanceExample example);

    int updateByExample(@Param("record") Finance record, @Param("example") FinanceExample example);

    int updateByPrimaryKeySelective(Finance record);

    int updateByPrimaryKey(Finance record);
}