package com.github.ebnew.ki4so.core.authentication;

import java.util.Map;

/**
 * 抽象的参数化实现类
 * @author zhenglu
 * @since 15/4/27
 */
public abstract class KnightAbstractParameter implements KnightParameter{

    /**
     * 其他参数表
     */
    protected Map<String,Object> paramters;

    @Override
    public Object getParameterValue(String parameName) {

        return this.paramters == null?null:this.paramters.get(parameName);
    }

    @Override
    public Map<String, Object> getParameters() {
        return this.paramters;
    }

    @Override
    public void setParameters(Map<String, Object> parameters) {
        this.paramters = parameters;

    }
}
