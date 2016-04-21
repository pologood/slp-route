package com.ai.slp.route.api.routequery.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.routequery.param.ProSupplyLogQueryVo;
import com.ai.slp.route.api.routequery.param.ProSupplyLogResult;
import com.ai.slp.route.api.routequery.param.ProSupplyQueryResult;
import com.ai.slp.route.api.routequery.param.ProSupplyQueryVo;
import com.ai.slp.route.api.routequery.param.RouteGroupQueryResult;
import com.ai.slp.route.api.routequery.param.RouteGroupQueryVo;
import com.ai.slp.route.api.routequery.param.RouteQueryResult;
import com.ai.slp.route.api.routequery.param.RouteQueryVo;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryResult;
import com.ai.slp.route.api.routequery.param.RouteRuleQueryVo;

/**
 * 路由查询<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangxw
 */
public interface IRouteQuerySV {
    /**
     * 路由信息查询
     * 
     * @param vo
     *            路由基本信息
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiCode ROUTE_0006
     */
    public RouteQueryResult routeQuery(RouteQueryVo vo) throws BusinessException, SystemException;

    @interface routeQuery {
    }

    /**
     * 路由下商品查询
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode ROUTE_0007
     */
    public ProSupplyQueryResult routeProSupplyQuery(ProSupplyQueryVo vo) throws BusinessException,
            SystemException;

    @interface routeProSupplyQuery {
    }

    /**
     * 查询供货记录
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode ROUTE_0008
     */
    public ProSupplyLogResult proSupplyLogQuery(ProSupplyLogQueryVo vo) throws BusinessException,
            SystemException;

    @interface proSupplyLogQuery {
    }

    /**
     * 路由规则查询
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode ROUTE_0009
     */
    public RouteRuleQueryResult routeRuleQuery(RouteRuleQueryVo vo) throws BusinessException,
            SystemException;

    @interface routeRuleQuery {
    }

    /**
     * 路由组查询
     * 
     * @param vo
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangxw
     * @ApiDocMethod
     * @ApiCode ROUTE_0010
     */
    public RouteGroupQueryResult routeGroupQuery(RouteGroupQueryVo vo) throws BusinessException,
            SystemException;

    @interface routeGroupQuery {
    }

}