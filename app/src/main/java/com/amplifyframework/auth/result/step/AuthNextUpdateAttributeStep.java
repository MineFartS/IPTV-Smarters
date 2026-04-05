package com.amplifyframework.auth.result.step;

import a.i.q.d;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AuthNextUpdateAttributeStep {
    private final Map<String, String> additionalInfo;
    private final AuthCodeDeliveryDetails codeDeliveryDetails;
    private final AuthUpdateAttributeStep updateAttributeStep;

    public AuthNextUpdateAttributeStep(AuthUpdateAttributeStep authUpdateAttributeStep, Map<String, String> map, AuthCodeDeliveryDetails authCodeDeliveryDetails) {
        authUpdateAttributeStep.getClass();
        this.updateAttributeStep = authUpdateAttributeStep;
        HashMap map2 = new HashMap();
        this.additionalInfo = map2;
        map.getClass();
        map2.putAll(map);
        this.codeDeliveryDetails = authCodeDeliveryDetails;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthNextUpdateAttributeStep.class != obj.getClass()) {
            return false;
        }
        AuthNextUpdateAttributeStep authNextUpdateAttributeStep = (AuthNextUpdateAttributeStep) obj;
        return d.a(getUpdateAttributeStep(), authNextUpdateAttributeStep.getUpdateAttributeStep()) && d.a(getAdditionalInfo(), authNextUpdateAttributeStep.getAdditionalInfo()) && d.a(getCodeDeliveryDetails(), authNextUpdateAttributeStep.getCodeDeliveryDetails());
    }

    public Map<String, String> getAdditionalInfo() {
        return this.additionalInfo;
    }

    public AuthCodeDeliveryDetails getCodeDeliveryDetails() {
        return this.codeDeliveryDetails;
    }

    public AuthUpdateAttributeStep getUpdateAttributeStep() {
        return this.updateAttributeStep;
    }

    public int hashCode() {
        return d.b(getUpdateAttributeStep(), getAdditionalInfo(), getCodeDeliveryDetails());
    }

    public String toString() {
        return "AuthNextUpdateAttributeStep{updateAttributeStep=" + getUpdateAttributeStep() + ", additionalInfo=" + getAdditionalInfo() + ", codeDeliveryDetails=" + getCodeDeliveryDetails() + '}';
    }
}
