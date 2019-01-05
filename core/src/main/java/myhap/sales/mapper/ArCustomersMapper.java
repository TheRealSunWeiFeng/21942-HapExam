package myhap.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;
import myhap.sales.dto.ArCustomers;

import java.util.List;

public interface ArCustomersMapper extends Mapper<ArCustomers>{
    /**
     * @Description 数据库没有RequestId,通过顾客Id快速查询顾客
     * @Param [customerId]
     * @return hbi.sales.dto.ArCustomers
     **/
    ArCustomers selectCustomerWithOutRequestId(long customerId);

    /**
     * @Description 根据参数@Param {condition} 中存在的属性查找客户对象
     * @Param [condition]
     * @return java.util.List<hbi.sales.dto.ArCustomers>
     **/
    List<ArCustomers> selectLovCustomers(ArCustomers condition);
}