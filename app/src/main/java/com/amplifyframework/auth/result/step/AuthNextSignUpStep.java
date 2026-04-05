package com.amplifyframework.auth.result.step;

import a.i.q.d;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AuthNextSignUpStep {
    private final Map<String, String> additionalInfo;
    private final AuthCodeDeliveryDetails codeDeliveryDetails;
    private final AuthSignUpStep signUpStep;

    public AuthNextSignUpStep(AuthSignUpStep authSignUpStep, Map<String, String> map, AuthCodeDeliveryDetails authCodeDeliveryDetails) {
        authSignUpStep.getClass();
        this.signUpStep = authSignUpStep;
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
        if (obj == null || AuthNextSignUpStep.class != obj.getClass()) {
            return false;
        }
        AuthNextSignUpStep authNextSignUpStep = (AuthNextSignUpStep) obj;
        return d.a(getSignUpStep(), authNextSignUpStep.getSignUpStep()) && d.a(getAdditionalInfo(), authNextSignUpStep.getAdditionalInfo()) && d.a(getCodeDeliveryDetails(), authNextSignUpStep.getCodeDeliveryDetails());
    }

    public Map<String, String> getAdditionalInfo() {
        return this.additionalInfo;
    }

    public AuthCodeDeliveryDetails getCodeDeliveryDetails() {
        return this.codeDeliveryDetails;
    }

    public AuthSignUpStep getSignUpStep() {
        return this.signUpStep;
    }

    public int hashCode() {
        return d.b(getSignUpStep(), getAdditionalInfo(), getCodeDeliveryDetails());
    }

    public String toString() {
        return "AuthNextSignUpStep{signUpStep=" + getSignUpStep() + ", additionalInfo=" + getAdditionalInfo() + ", codeDeliveryDetails=" + getCodeDeliveryDetails() + '}';
    }
}
