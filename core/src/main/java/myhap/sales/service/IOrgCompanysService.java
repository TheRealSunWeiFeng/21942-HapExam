package myhap.sales.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import myhap.sales.dto.OrgCompanys;

public interface IOrgCompanysService extends IBaseService<OrgCompanys>, ProxySelf<IOrgCompanysService>{
    OrgCompanys selectCompanysWithOutRequestId(long companyId);
}