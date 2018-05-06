package com.ocd.ecocert.dao;

import com.ocd.ecocert.entity.AuthenticationDomain;
import com.ocd.ecocert.entity.AuthenticationDomainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthenticationDomainMapper {
    int countByExample(AuthenticationDomainExample example);

    int deleteByExample(AuthenticationDomainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthenticationDomain record);

    int insertSelective(AuthenticationDomain record);

    List<AuthenticationDomain> selectByExample(AuthenticationDomainExample example);

    AuthenticationDomain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthenticationDomain record, @Param("example") AuthenticationDomainExample example);

    int updateByExample(@Param("record") AuthenticationDomain record, @Param("example") AuthenticationDomainExample example);

    int updateByPrimaryKeySelective(AuthenticationDomain record);

    int updateByPrimaryKey(AuthenticationDomain record);
}