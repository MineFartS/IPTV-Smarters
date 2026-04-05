package com.amazonaws.services.kms.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kms.model.InvalidMarkerException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* JADX INFO: loaded from: classes.dex */
public class InvalidMarkerExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public InvalidMarkerExceptionUnmarshaller() {
        super(InvalidMarkerException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("InvalidMarkerException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        InvalidMarkerException invalidMarkerException = (InvalidMarkerException) super.unmarshall(jsonErrorResponse);
        invalidMarkerException.setErrorCode("InvalidMarkerException");
        return invalidMarkerException;
    }
}
