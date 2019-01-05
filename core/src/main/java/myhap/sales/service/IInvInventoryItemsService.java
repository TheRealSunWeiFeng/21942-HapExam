package myhap.sales.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import myhap.sales.dto.InvInventoryItems;

public interface IInvInventoryItemsService extends IBaseService<InvInventoryItems>, ProxySelf<IInvInventoryItemsService>{
    InvInventoryItems selectInvInventoryItemById(long invInventoryItemId);
}