package icu.llila.money.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import icu.llila.money.mapper.MoneyMapper;
import icu.llila.money.pojo.UseMoney;
import icu.llila.money.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MoneyServiceImpl implements MoneyService {
    @Autowired
    private MoneyMapper moneyMapper;
    @Override
    public int addAndRedu(UseMoney useMoney) {

        return moneyMapper.insert(useMoney);
    }

    @Override
    public List<UseMoney> queryUserInfo(Integer id) {
        QueryWrapper<UseMoney> wrapper = new QueryWrapper<UseMoney>().eq("user_id", id);
        List<UseMoney> useMonies = moneyMapper.selectList(wrapper);
        return useMonies;

    }
}
