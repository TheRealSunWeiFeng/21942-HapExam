package myhap.sales.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import myhap.sales.mapper.ArCustomersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myhap.sales.dto.ArCustomers;
import myhap.sales.service.IArCustomersService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class ArCustomersServiceImpl extends BaseServiceImpl<ArCustomers> implements IArCustomersService{
    @Autowired
    ArCustomersMapper customersMapper;

    @Override
    public ArCustomers selectCustomerWithOutRequestId(Long customerId) {
        return customersMapper.selectCustomerWithOutRequestId(customerId);
    }
}