package myhap.sales.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import myhap.sales.mapper.OrgCompanysMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myhap.sales.dto.OrgCompanys;
import myhap.sales.service.IOrgCompanysService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class OrgCompanysServiceImpl extends BaseServiceImpl<OrgCompanys> implements IOrgCompanysService {
    @Autowired
    OrgCompanysMapper companysMapper;


    @Override
    public OrgCompanys selectCompanysWithOutRequestId(long companyId) {
        return companysMapper.selectCompanysById(companyId);
    }
}