package com.betteryanwo.controller;

import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.Goods;
import com.betteryanwo.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Create by 六
 * Date:18-5-30
 */
@Controller
@RequestMapping(value = "/goods")
public class GoodsController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GoodsService goodsService;

    @RequestMapping(value = "/listgoods",method = RequestMethod.GET)
    @ResponseBody
    public Result listGoods(@RequestParam(value = "page",defaultValue="1") Integer page,
                            Map<String,Object> map
                            ){
        // 引入PageHelper分页插件
        // 在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(page, 5);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<Goods> goodsList = goodsService.listGoods();
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo pageInfo = new PageInfo(goodsList);
        map.put("pageInfo",pageInfo);
        return new Result(true,pageInfo,"list_goods");
    }

    /**
     * 根据商品类别和商品名称查询商品
     * @param type 商品类别
     * @param name 商品名称
     * @return
     */
    @RequestMapping(value = "/byTypeAndName",method = RequestMethod.GET)
    @ResponseBody
    public Result listGoodsByGoodsTypeAndName(@RequestParam("type") String type,
                                              @RequestParam("name") String name){
        List<Goods> goods = goodsService.listGoodsByTypeAndName(type, name);
        return new Result(true,goods,"根据商品类别和商品名称查询商品");
    }

    /**
     * 商品库存统计
     * @param goodsId 商品ID
     * @return
     */
    @RequestMapping(value = "/countGoods",method = RequestMethod.GET)
    @ResponseBody
    public Result countGoods(@RequestParam("goodsId") Long goodsId){
        int countGoods = goodsService.CountGoods(goodsId);
        return new Result(true,countGoods,"查询商品库存");
    }

    /**
     * 更新库存
     * @param goodsId 商品名称
     * @param num   库存减少的数
     * @return
     */
    @RequestMapping(value = "/updateGoodsCount",method = RequestMethod.GET)
    @ResponseBody
    public Result updateGoodsCount(@RequestParam("goodsId") Long goodsId,
                                   @RequestParam("num") Integer num){
        int updateCountGoods = goodsService.UpdateCountGoods(goodsId, num);
        return new Result(true,updateCountGoods,"更新库存");
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "/list";
    }
    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    public String test2(){
        return "/biaodan";
    }
}
