package com.example.sim.utils;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JsonUtil {

    public JSONObject getJsonObject(HttpServletRequest request) throws IOException {
        JSONObject jsonParam;
        BufferedReader streamReader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));

        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = streamReader.readLine()) != null) {
            sb.append(line);
        }

        jsonParam = JSONObject.parseObject(sb.toString());
        return jsonParam;
    }
}
