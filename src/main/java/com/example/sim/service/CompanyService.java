package com.example.sim.service;

import com.example.sim.Mapper.CompanyMapper;
import com.example.sim.entity.FinanceInfo;
import com.example.sim.entity.HumanResourceInfo;
import com.example.sim.entity.Tradeable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


@Service

public class CompanyService implements CompanyMapper{

    @Lazy
    @Autowired
    private CompanyMapper companyMapper;

    public FinanceInfo getCompany(String token){
        if(companyMapper.getCompany(token) == null){
            return null;
        }
        return companyMapper.getCompany(token);
    }

    public int addCompany(FinanceInfo financeInfo){
        return companyMapper.addCompany(financeInfo);
    }

    @Override
    public int getRanking() {
        return 0;
    }

    @Override
    public HumanResourceInfo getHumanResourceInfo(int TeamID) {
        return companyMapper.getHumanResourceInfo(TeamID);
    }

    @Override
    public Tradeable getProductInfo(int id) {
        return companyMapper.getProductInfo(id);
    }

    public Tradeable getProductInfo(int id, int startDate, int endDate){
        Tradeable tradeable = new Tradeable();
        int oldPrice = companyMapper.getProductInfo(startDate).getPrice();
        int newPrice = companyMapper.getProductInfo(endDate).getPrice();
        //TODO
        tradeable.setTradeablename("1");
        tradeable.setDate(companyMapper.getProductInfo(startDate).getDate());
        return null;
    }


    public int updateCompany(){
        return 0;
    }
}
