package com.example.sim.Mapper;

import com.example.sim.entity.FinanceInfo;
import com.example.sim.entity.HumanResourceInfo;
import com.example.sim.entity.Tradeable;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper

public interface CompanyMapper {
    @Select("select * from company where token = #{token}")
    FinanceInfo getCompany(String token);

    @Insert("insert into company(token, TotalRevenue, TotalDebt, NetAssets, CompanyType) values(#{token}, #{TotalRevenue}, #{TotalDebt}, #{NetAssets}, #{CompanyType})")
    int addCompany(FinanceInfo financeInfo);

    @Select("SELECT ranking FROM company where token=#{token}")
    int getRanking();

    @Select("SELECT * from grouphumanresourceinfo where TeamID = #{teamid}")
    HumanResourceInfo getHumanResourceInfo(int TeamID);

    @Select("SELECT * FROM tradeable where productID = #{productID} and date = #{date}")
    Tradeable getProductInfo(int id);
}
