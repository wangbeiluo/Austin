package cn.lewis.austin.script;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import cn.lewis.austin.pojo.SmsParam;
import cn.lewis.austin.utils.OkHttpUtils;
import com.alibaba.fastjson.JSON;
import com.google.common.base.Throwables;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.sms.v20210111.SmsClient;
import com.tencentcloudapi.sms.v20210111.models.SendSmsRequest;
import com.tencentcloudapi.sms.v20210111.models.SendSmsResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lewis
 * @description: 1. 发送短信接入文档：https://cloud.tencent.com/document/api/382/55981
 *               2. 推荐直接使用SDK
 *               3. 推荐使用API Explorer 生成代码
 * @date: 2023/12/5
 * @Copyright:
 */
@Slf4j
@Service
public class TencentSmsScript
{
    /**
     * api相关
     */
    private static final String URL = "sms.tencentcloudapi.com";
    private static final String REGION = "ap-guangzhou";

    /**
     * 账号相关
     */
    private final static String SECRET_ID = "//";
    private final static String SECRET_KEY = "//";
    private static final String SMS_SDK_APP_ID = "//";
    private static final String TEMPLATE_ID = "//";
    private static final String SIGN_NAME = "//";






    public String send(SmsParam smsParam) {

        try {

            /**
             * 初始化 client
             */
            Credential cred = new Credential(SECRET_ID, SECRET_KEY);
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint(URL);
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);
            SmsClient client = new SmsClient(cred, REGION, clientProfile);

            /**
             * 组装发送短信参数
             */
            SendSmsRequest req = new SendSmsRequest();
            String[] phoneNumberSet1 = smsParam.getPhones().toArray(new String[smsParam.getPhones().size() - 1]);
            req.setPhoneNumberSet(phoneNumberSet1);
            req.setSmsSdkAppId(SMS_SDK_APP_ID);
            req.setSignName(SIGN_NAME);
            req.setTemplateId(TEMPLATE_ID);
            String[] templateParamSet1 = {"3333"};
            req.setTemplateParamSet(templateParamSet1);
            req.setSessionContext(IdUtil.fastSimpleUUID());

            /**
             * 请求，返回结果
             */
            SendSmsResponse resp = client.SendSms(req);
            return SendSmsResponse.toJsonString(resp);

        } catch (TencentCloudSDKException e) {
            log.error("send tencent sms fail!{},params:{}",
                    Throwables.getStackTraceAsString(e), JSON.toJSONString(smsParam));
            return null;
        }

    }
}
