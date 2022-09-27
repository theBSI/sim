package com.example.sim.entity;

import lombok.Data;

@Data

public class FinanceInfo {
    private String token;
    private int TotalRevenue;
    private int TotalDebt;
    private int NetAssets;
    private int CompanyType;
}
