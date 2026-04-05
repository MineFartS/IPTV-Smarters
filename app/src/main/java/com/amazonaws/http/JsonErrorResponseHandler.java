package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class JsonErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {
    private static final int HTTP_STATUS_INTERNAL_SERVER_ERROR = 500;
    private static final String X_AMZN_ERROR_TYPE = "x-amzn-ErrorType";
    private final List<? extends JsonErrorUnmarshaller> unmarshallerList;

    public static final class JsonErrorResponse {
        private final String errorCode;
        private final Map<String, String> map;
        private final String message = get("message");
        private final int statusCode;

        private JsonErrorResponse(int i2, String str, Map<String, String> map) {
            this.statusCode = i2;
            this.errorCode = str;
            this.map = map;
        }

        public static JsonErrorResponse fromResponse(HttpResponse httpResponse) {
            int statusCode = httpResponse.getStatusCode();
            Map<String, String> mapJsonToStringMapWithList = JsonUtils.jsonToStringMapWithList(new BufferedReader(new InputStreamReader(httpResponse.getContent(), StringUtils.UTF8)));
            String strSubstring = httpResponse.getHeaders().get(JsonErrorResponseHandler.X_AMZN_ERROR_TYPE);
            if (strSubstring != null) {
                int iIndexOf = strSubstring.indexOf(58);
                if (iIndexOf != -1) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
            } else if (mapJsonToStringMapWithList.containsKey("__type")) {
                String str = mapJsonToStringMapWithList.get("__type");
                strSubstring = str.substring(str.lastIndexOf("#") + 1);
            }
            return new JsonErrorResponse(statusCode, strSubstring, mapJsonToStringMapWithList);
        }

        public String get(String str) {
            String str2;
            if (str == null || str.length() == 0) {
                return null;
            }
            String str3 = StringUtils.lowerCase(str.substring(0, 1)) + str.substring(1);
            String str4 = StringUtils.upperCase(str.substring(0, 1)) + str.substring(1);
            if (this.map.containsKey(str4)) {
                str2 = this.map.get(str4);
            } else {
                if (!this.map.containsKey(str3)) {
                    return BuildConfig.FLAVOR;
                }
                str2 = this.map.get(str3);
            }
            return str2;
        }

        public String getErrorCode() {
            return this.errorCode;
        }

        public String getMessage() {
            return this.message;
        }

        public int getStatusCode() {
            return this.statusCode;
        }
    }

    public JsonErrorResponseHandler(List<? extends JsonErrorUnmarshaller> list) {
        this.unmarshallerList = list;
    }

    private AmazonServiceException runErrorUnmarshallers(JsonErrorResponse jsonErrorResponse) {
        for (JsonErrorUnmarshaller jsonErrorUnmarshaller : this.unmarshallerList) {
            if (jsonErrorUnmarshaller.match(jsonErrorResponse)) {
                return jsonErrorUnmarshaller.unmarshall(jsonErrorResponse);
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazonaws.http.HttpResponseHandler
    public AmazonServiceException handle(HttpResponse httpResponse) {
        try {
            JsonErrorResponse jsonErrorResponseFromResponse = JsonErrorResponse.fromResponse(httpResponse);
            AmazonServiceException amazonServiceExceptionRunErrorUnmarshallers = runErrorUnmarshallers(jsonErrorResponseFromResponse);
            if (amazonServiceExceptionRunErrorUnmarshallers == null) {
                return null;
            }
            amazonServiceExceptionRunErrorUnmarshallers.setStatusCode(httpResponse.getStatusCode());
            amazonServiceExceptionRunErrorUnmarshallers.setErrorType(httpResponse.getStatusCode() < 500 ? AmazonServiceException.ErrorType.Client : AmazonServiceException.ErrorType.Service);
            amazonServiceExceptionRunErrorUnmarshallers.setErrorCode(jsonErrorResponseFromResponse.getErrorCode());
            for (Map.Entry<String, String> entry : httpResponse.getHeaders().entrySet()) {
                if ("X-Amzn-RequestId".equalsIgnoreCase(entry.getKey())) {
                    amazonServiceExceptionRunErrorUnmarshallers.setRequestId(entry.getValue());
                }
            }
            return amazonServiceExceptionRunErrorUnmarshallers;
        } catch (IOException e2) {
            throw new AmazonClientException("Unable to parse error response", e2);
        }
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public boolean needsConnectionLeftOpen() {
        return false;
    }
}
