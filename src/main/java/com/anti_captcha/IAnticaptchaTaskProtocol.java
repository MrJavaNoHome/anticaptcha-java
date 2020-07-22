package main.java.com.anti_captcha;

import main.java.com.anti_captcha.api.response.TaskResultResponse;

import org.json.JSONObject;

public interface IAnticaptchaTaskProtocol {
    JSONObject getPostData();

    TaskResultResponse.SolutionData getTaskSolution();
}
