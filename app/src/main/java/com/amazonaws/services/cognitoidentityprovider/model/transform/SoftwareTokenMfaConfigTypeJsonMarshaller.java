package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.SoftwareTokenMfaConfigType;
import com.amazonaws.util.json.AwsJsonWriter;

/* JADX INFO: loaded from: classes.dex */
public class SoftwareTokenMfaConfigTypeJsonMarshaller {
    private static SoftwareTokenMfaConfigTypeJsonMarshaller instance;

    public static SoftwareTokenMfaConfigTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SoftwareTokenMfaConfigTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SoftwareTokenMfaConfigType softwareTokenMfaConfigType, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (softwareTokenMfaConfigType.getEnabled() != null) {
            Boolean enabled = softwareTokenMfaConfigType.getEnabled();
            awsJsonWriter.name("Enabled");
            awsJsonWriter.value(enabled.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
