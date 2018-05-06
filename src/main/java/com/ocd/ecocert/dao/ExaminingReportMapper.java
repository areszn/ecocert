package com.ocd.ecocert.dao;

import com.ocd.ecocert.entity.ExaminingReport;
import com.ocd.ecocert.entity.ExaminingReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExaminingReportMapper {
    int countByExample(ExaminingReportExample example);

    int deleteByExample(ExaminingReportExample example);

    int insert(ExaminingReport record);

    int insertSelective(ExaminingReport record);

    List<ExaminingReport> selectByExample(ExaminingReportExample example);

    int updateByExampleSelective(@Param("record") ExaminingReport record, @Param("example") ExaminingReportExample example);

    int updateByExample(@Param("record") ExaminingReport record, @Param("example") ExaminingReportExample example);
}