package myhap.sales.mapper;

import com.hand.hap.mybatis.common.Mapper;
import myhap.sales.dto.InvInventoryItems;

import java.util.List;

public interface InvInventoryItemsMapper extends Mapper<InvInventoryItems>{
    /**
     * @Author MingYu Zhang
     * @Description 通过ID快速查找物料对象
     * @Date 14:48 2018/9/7 0007
     * @Param [invInventoryItemId]
     * @return hbi.sales.dto.InvInventoryItems
     **/
    InvInventoryItems selectInvInventoryItemById(long invInventoryItemId);

    /**
     * @Description
     * @Param [condition]
     * @return java.util.List<hbi.sales.dto.InvInventoryItems>
     **/
    List<InvInventoryItems> selectLovInvInventoryItems(InvInventoryItems condition);

    /*
     * @Description 订单行能使用的物料对象要保证其ORDER_FLAG='Y'
     * @Param [condition]
     * @return java.util.List<hbi.sales.dto.InvInventoryItems>
     **/
    List<InvInventoryItems> selectLovInvInventoryItemsForOrderLines(InvInventoryItems condition);
}