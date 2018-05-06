package com.ocd.ecocert.dao;

import com.ocd.ecocert.entity.Qualification;
import com.ocd.ecocert.entity.QualificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QualificationMapper {
    int countByExample(QualificationExample example);

    int deleteByExample(QualificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Qualification record);

    int insertSelective(Qualification record);

    List<Qualification> selectByExample(QualificationExample example);

    Qualification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Qualification record, @Param("example") QualificationExample example);

    int updateByExample(@Param("record") Qualification record, @Param("example") QualificationExample example);

    int updateByPrimaryKeySelective(Qualification record);

    int updateByPrimaryKey(Qualification record);
}