package myhap.sales.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import myhap.sales.mapper.InvInventoryItemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myhap.sales.dto.InvInventoryItems;
import myhap.sales.service.IInvInventoryItemsService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class InvInventoryItemsServiceImpl extends BaseServiceImpl<InvInventoryItems> implements IInvInventoryItemsService{
    @Autowired
    InvInventoryItemsMapper invInventoryItemsMappe;

    @Override
    public InvInventoryItems selectInvInventoryItemById(long invInventoryItemId) {
        return invInventoryItemsMappe.selectInvInventoryItemById(invInventoryItemId);
    }
}