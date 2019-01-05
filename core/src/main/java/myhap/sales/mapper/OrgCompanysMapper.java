package myhap.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;
import myhap.sales.dto.OrgCompanys;

import java.util.List;

public interface OrgCompanysMapper extends Mapper<OrgCompanys>{
    OrgCompanys selectCompanysById(long companyId);

    List<OrgCompanys> selectLovCompanies(OrgCompanys condition);
}