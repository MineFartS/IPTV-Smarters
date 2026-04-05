package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.cognitoidentityprovider.model.InvalidOAuthFlowException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* JADX INFO: loaded from: classes.dex */
public class InvalidOAuthFlowExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public InvalidOAuthFlowExceptionUnmarshaller() {
        super(InvalidOAuthFlowException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("InvalidOAuthFlowException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        InvalidOAuthFlowException invalidOAuthFlowException = (InvalidOAuthFlowException) super.unmarshall(jsonErrorResponse);
        invalidOAuthFlowException.setErrorCode("InvalidOAuthFlowException");
        return invalidOAuthFlowException;
    }
}
