package com.amplifyframework.auth.result.step;

import a.i.q.d;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AuthNextResetPasswordStep {
    private final Map<String, String> additionalInfo;
    private final AuthCodeDeliveryDetails codeDeliveryDetails;
    private final AuthResetPasswordStep resetPasswordStep;

    public AuthNextResetPasswordStep(AuthResetPasswordStep authResetPasswordStep, Map<String, String> map, AuthCodeDeliveryDetails authCodeDeliveryDetails) {
        authResetPasswordStep.getClass();
        this.resetPasswordStep = authResetPasswordStep;
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
        if (obj == null || AuthNextResetPasswordStep.class != obj.getClass()) {
            return false;
        }
        AuthNextResetPasswordStep authNextResetPasswordStep = (AuthNextResetPasswordStep) obj;
        return d.a(getResetPasswordStep(), authNextResetPasswordStep.getResetPasswordStep()) && d.a(getAdditionalInfo(), authNextResetPasswordStep.getAdditionalInfo()) && d.a(getCodeDeliveryDetails(), authNextResetPasswordStep.getCodeDeliveryDetails());
    }

    public Map<String, String> getAdditionalInfo() {
        return this.additionalInfo;
    }

    public AuthCodeDeliveryDetails getCodeDeliveryDetails() {
        return this.codeDeliveryDetails;
    }

    public AuthResetPasswordStep getResetPasswordStep() {
        return this.resetPasswordStep;
    }

    public int hashCode() {
        return d.b(getResetPasswordStep(), getAdditionalInfo(), getCodeDeliveryDetails());
    }

    public String toString() {
        return "AuthNextResetPasswordStep{resetPasswordStep=" + getResetPasswordStep() + ", additionalInfo=" + getAdditionalInfo() + ", codeDeliveryDetails=" + getCodeDeliveryDetails() + '}';
    }
}
