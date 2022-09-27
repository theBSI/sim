package com.example.sim.entity;

import lombok.Data;

@Data

public class HumanResourceInfo {
    private int StaffNumber;
    private double AveragePayment;
    private double ProductionEnthusiasm;
    private int SaleManNumber;
    private double SaleManAverageSalary;
}

/*
    显示 目前员工总数
    显示 员工平均每月薪资
    显示 员工平均激励指数（生产积极性）
    显示 员工生产积极性
    显示 营销人员总数
    显示 营销人员平均每月薪资*/
