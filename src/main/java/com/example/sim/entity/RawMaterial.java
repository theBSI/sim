package com.example.sim.entity;

import lombok.Data;

@Data

public class RawMaterial {
    private int MiningPoint;
    private int MaxMiningCap;
    private int CurrMaxMiningCap;
    private int WeekMiningAmount;
    private int WeekMiningCost;
    private int IndividualMiningCost;
}


/*
    显示 目前拥有开采点数量
    显示 目前平均单点每周开采数量
    显示 目前每周开采能力上限
    显示 目前每周开采数目
    显示 目前每周开采成本
    显示 目前单件开采成本*/
