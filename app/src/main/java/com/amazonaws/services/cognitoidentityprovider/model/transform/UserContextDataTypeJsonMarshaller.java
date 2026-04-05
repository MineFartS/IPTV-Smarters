package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.UserContextDataType;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: loaded from: classes.dex */
public class UserContextDataTypeJsonMarshaller {
    private static UserContextDataTypeJsonMarshaller instance;

    public static UserContextDataTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UserContextDataTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(UserContextDataType userContextDataType, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (userContextDataType.getEncodedData() != null) {
            String encodedData = userContextDataType.getEncodedData();
            awsJsonWriter.name("EncodedData");
            awsJsonWriter.value(encodedData);
        }
        awsJsonWriter.endObject();
    }
}
