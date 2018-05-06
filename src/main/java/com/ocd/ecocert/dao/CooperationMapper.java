package com.ocd.ecocert.dao;

import com.ocd.ecocert.entity.Cooperation;
import com.ocd.ecocert.entity.CooperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CooperationMapper {
    int countByExample(CooperationExample example);

    int deleteByExample(CooperationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cooperation record);

    int insertSelective(Cooperation record);

    List<Cooperation> selectByExample(CooperationExample example);

    Cooperation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cooperation record, @Param("example") CooperationExample example);

    int updateByExample(@Param("record") Cooperation record, @Param("example") CooperationExample example);

    int updateByPrimaryKeySelective(Cooperation record);

    int updateByPrimaryKey(Cooperation record);
}