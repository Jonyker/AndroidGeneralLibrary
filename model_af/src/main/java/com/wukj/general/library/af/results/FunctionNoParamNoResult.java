package com.wukj.general.library.af.results;

/**
 * 项目名称：AFCommunication
 * 创建时间：2018/7/13 0013 上午 8:38
 * 作者：Jonyker
 * 博客：http://blog.csdn.net/jerry_137188
 * github：https://github.com/Jiitech
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/7/13 0013 上午 8:38
 * 备注：
 * 版本：V.1.0
 * 描述：
 * 无返回值，无参数
 */
public abstract class FunctionNoParamNoResult extends Function {


    public FunctionNoParamNoResult(String mFunctionName) {
        super(mFunctionName);
    }

    public abstract void  function();


}
