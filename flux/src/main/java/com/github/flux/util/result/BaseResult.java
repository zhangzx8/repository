package com.github.flux.util.result;

public class BaseResult {
  private int code;
  private String msg;

  public static final BaseResult SUCCESS = new BaseResult(0, "成功");
  public static final BaseResult FAILED = new BaseResult(1, "失败");
  public static final BaseResult SAVE_FAILED = new BaseResult(19, "网络或服务异常，请稍后再试");
  public static final BaseResult INVALID_PARAMETER = new BaseResult(2, "无效参数");
  public static final BaseResult NO_SUCH_METHOD = new BaseResult(3, "无此方法");
  public static final BaseResult INVALID_SIGN = new BaseResult(4, "验证签名失败");
  public static final BaseResult NO_LOGIN = new BaseResult(5, "请重新登录后再试");
  public static final BaseResult REFERER_MISMATCHED = new BaseResult(8, "请求来源非法");
  public static final BaseResult INVALID_DATETIME = new BaseResult(9, "无效时间");
  public static final BaseResult ILLEGAL_REQUEST = new BaseResult(10, "非法请求");
  public static final BaseResult SERVICE_ERROR = new BaseResult(12, "网络或服务异常，请稍后再试");
  public static final BaseResult HAVE_TASK_ON = new BaseResult(13, "任务运行中");
  public static final BaseResult REPEAT_OPERATE = new BaseResult(15, "重复操作");
  public static final BaseResult CSP_SERVER_ERROR = new BaseResult(18, "网络或服务异常，请稍后再试");

  public static final BaseResult IDLIST_EMPTY_PARAMS = new BaseResult(19, "入参不能为空");
  public static final BaseResult IDLIST_BATCH_SAVE_FAILED = new BaseResult(20, "idlist批量处理，部份失败");
  public static final BaseResult ACCOUNT_USER_NOT_LOGIN = new BaseResult(21, "请重新登录后再试");
  public static final BaseResult SENSITIVE_SERVER_ERROR = new BaseResult(22, "敏感词服务器异常，请稍后再试。");
  public static final BaseResult SENSITIVE_EXIST_ERROR = new BaseResult(23, "输入的字段包含敏感词");
  public static final BaseResult SETTING_SET_FAILED = new BaseResult(23, "网络或服务异常，请稍后再试");

  
  public BaseResult() {}

  public BaseResult(int code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  @Override
  public String toString() {
    return "BaseResult [code=" + code + ", msg=" + msg + "]";
  }

}
