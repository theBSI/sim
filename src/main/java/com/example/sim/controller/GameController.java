package com.example.sim.controller;

import com.example.sim.Enum.ResultEnum;
import com.example.sim.entity.FinanceInfo;
import com.example.sim.entity.HumanResourceInfo;
import com.example.sim.entity.Result;
import com.example.sim.service.CompanyService;
import com.example.sim.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController


public class GameController {

    @Lazy
    @Autowired
    private CompanyService companyService;


    @GetMapping("/companyInfo/{token}")
    public Result companyInfo(@PathVariable String token){
        return ResultUtil.success(ResultEnum.SUCCESS, companyService.getCompany(token));
    }

    @PostMapping("/addCompany")
    public Result addCompany(@RequestBody FinanceInfo financeInfo){
        // TODO
        financeInfo.setToken("001");
        return ResultUtil.success(ResultEnum.SUCCESS, companyService.addCompany(financeInfo));
    }

    @GetMapping("/getHumanResourceInfo/{id}")
    public Result getHumanResource(@PathVariable int id){
        return ResultUtil.success(ResultEnum.SUCCESS, companyService.getHumanResourceInfo(id));
    }

    @PostMapping("/setStaffnumber/{num}")
    public Result setStaffNumber(@PathVariable int staffNum){
        return ResultUtil.success(ResultEnum.SUCCESS, "");
    }

    @PostMapping("/setAverageMonthlySalary/{Salary}")
    public Result setMonthlySalary(@PathVariable int MonthlySalary){
        return ResultUtil.success(ResultEnum.SUCCESS, "");
    }

    @PostMapping("/setSalesManNumber/{Num}")
    public Result setSalesManNumber(@PathVariable int SalesManNumber){
        return ResultUtil.success(ResultEnum.SUCCESS, "");
    }

    @PostMapping("/setSalesManAverageSalary/{salary}")
    public Result setSalesManAverageSalary(@PathVariable int SalesManSalart){
        return ResultUtil.success(ResultEnum.SUCCESS, "");
    }

    @GetMapping("/getProductInfo")
    public Result getProductInfo(int productID, int startDate, int endDate){
        return ResultUtil.success(ResultEnum.SUCCESS, "");
    }

    @GetMapping("/getMiningData")
    public Result getMiningData(){
        return ResultUtil.success(ResultEnum.SUCCESS, "");
    }
}
