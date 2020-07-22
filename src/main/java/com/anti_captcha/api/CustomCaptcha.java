package main.java.com.anti_captcha.api;

import main.java.com.anti_captcha.AnticaptchaBase;
import main.java.com.anti_captcha.api.response.TaskResultResponse;
import main.java.com.anti_captcha.helper.DebugHelper;
import main.java.com.anti_captcha.IAnticaptchaTaskProtocol;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomCaptcha extends AnticaptchaBase implements IAnticaptchaTaskProtocol {
    private String imageUrl;
    private String assignment;
    private JSONArray forms;

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public void setForms(JSONArray forms) {
        this.forms = forms;
    }

    @Override
    public JSONObject getPostData() {
        JSONObject postData = new JSONObject();

        try {
            postData.put("type", "CustomCaptchaTask");
            postData.put("imageUrl", imageUrl);
            postData.put("assignment", assignment);
            postData.put("forms", forms);
        } catch (JSONException e) {
            DebugHelper.out("JSON compilation error: " + e.getMessage(), DebugHelper.Type.ERROR);

            return null;
        }

        return postData;
    }

    @Override
    public TaskResultResponse.SolutionData getTaskSolution() {
        return taskInfo.getSolution();
    }
}
