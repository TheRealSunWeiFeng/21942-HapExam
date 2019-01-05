package myhap.sales.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import com.hand.hap.task.exception.TaskExecuteException;
import myhap.sales.dto.OmOrderHeaders;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IOmOrderHeadersService extends IBaseService<OmOrderHeaders>, ProxySelf<IOmOrderHeadersService>{
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<OmOrderHeaders> selectWithForgeinKey(IRequest request, OmOrderHeaders condition, int pageNum, int pageSize);
    /*
     * @Description 头行保存
     * @Param [requestContext, dto, page, pageSize]
     * @return java.util.List<hbi.sales.dto.OmOrderHeaders>
     **/
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<OmOrderHeaders> saveLinesAndHeader(IRequest requestContext, List<OmOrderHeaders> dto, int page, int pageSize) throws TaskExecuteException;

    SXSSFWorkbook buildExportOrderExcel(IRequest requestContext, OmOrderHeaders dto, int page, int pageSize);

    List<OmOrderHeaders> deleteOrder(IRequest requestContext, List<OmOrderHeaders> dto);
}