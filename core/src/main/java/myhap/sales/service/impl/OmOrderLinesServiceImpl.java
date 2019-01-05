package myhap.sales.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import myhap.sales.mapper.OmOrderLinesMapper;
import myhap.sales.service.IInvInventoryItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myhap.sales.dto.OmOrderLines;
import myhap.sales.service.IOmOrderLinesService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class OmOrderLinesServiceImpl extends BaseServiceImpl<OmOrderLines> implements IOmOrderLinesService{
    @Autowired
    OmOrderLinesMapper linesMapper;

    @Autowired
    IInvInventoryItemsService inventoryItemsService;

    @Override
    public List<OmOrderLines> selectWithForgeinKey(IRequest requestContext, OmOrderLines dto, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return linesMapper.selectWithForgeinKey(dto);
    }
}