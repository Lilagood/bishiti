package icu.llila.money.controller;

import icu.llila.money.pojo.UseMoney;
import icu.llila.money.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("money")
public class MoneyController {

    @Autowired
    private MoneyService moneyService;

    @PostMapping("addAndRedu")
    //添加金额，省时间，没有响应体类，返回string,根据实体类的封装，来实现添加和减少
    public void addAndRedu(@RequestBody UseMoney useMoney){
        //服务层调用方法实现用户金额增加,并应在添加金额的实现类中操作以下代码


        //调用明细添加方法，记录操作
        int add = moneyService.addAndRedu(useMoney);
    }
    @GetMapping
    //查询明细
    public List<UseMoney> queryUserInfo(Integer id){
        System.out.println(id);
        List<UseMoney> useMonies = moneyService.queryUserInfo(id);
        return useMonies;
    }
}
