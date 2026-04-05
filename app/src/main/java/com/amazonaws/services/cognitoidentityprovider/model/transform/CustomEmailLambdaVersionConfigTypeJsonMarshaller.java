package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.CustomEmailLambdaVersionConfigType;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: loaded from: classes.dex */
public class CustomEmailLambdaVersionConfigTypeJsonMarshaller {
    private static CustomEmailLambdaVersionConfigTypeJsonMarshaller instance;

    public static CustomEmailLambdaVersionConfigTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CustomEmailLambdaVersionConfigTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CustomEmailLambdaVersionConfigType customEmailLambdaVersionConfigType, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (customEmailLambdaVersionConfigType.getLambdaVersion() != null) {
            String lambdaVersion = customEmailLambdaVersionConfigType.getLambdaVersion();
            awsJsonWriter.name("LambdaVersion");
            awsJsonWriter.value(lambdaVersion);
        }
        if (customEmailLambdaVersionConfigType.getLambdaArn() != null) {
            String lambdaArn = customEmailLambdaVersionConfigType.getLambdaArn();
            awsJsonWriter.name("LambdaArn");
            awsJsonWriter.value(lambdaArn);
        }
        awsJsonWriter.endObject();
    }
}
