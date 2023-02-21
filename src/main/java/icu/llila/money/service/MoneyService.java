package icu.llila.money.service;

import icu.llila.money.pojo.UseMoney;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MoneyService {
    int addAndRedu(UseMoney useMoney);

    List<UseMoney> queryUserInfo(Integer id);
}
