package com.qst.Impl;

import com.qst.MathInter;
import org.springframework.stereotype.Component;

@Component
public class MathInterImpl implements MathInter {

    @Override
    public int add(int i, int j) {
        System.out.println(i+"+"+j+"="+(i+j));
        return i+j;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
