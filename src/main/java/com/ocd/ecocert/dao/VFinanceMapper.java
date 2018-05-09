package com.ocd.ecocert.dao;

import com.ocd.ecocert.entity.VFinance;
import com.ocd.ecocert.entity.VFinanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VFinanceMapper {
    int countByExample(VFinanceExample example);

    int deleteByExample(VFinanceExample example);

    int insert(VFinance record);

    int insertSelective(VFinance record);

    List<VFinance> selectByExample(VFinanceExample example);

    int updateByExampleSelective(@Param("record") VFinance record, @Param("example") VFinanceExample example);

    int updateByExample(@Param("record") VFinance record, @Param("example") VFinanceExample example);
}