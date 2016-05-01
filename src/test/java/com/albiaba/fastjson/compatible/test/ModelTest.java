package com.albiaba.fastjson.compatible.test;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.compatible.model.Model;

import junit.framework.TestCase;

public class ModelTest extends TestCase {
    public void test_codec() throws Exception {
        Model model = new Model();
        model.value = 1000;
        
        String text = JSON.toJSONString(model);
        
        Model model2 = JSON.parseObject(text, Model.class);
        
        Assert.assertEquals(model.value, model2.value);
    }
}
