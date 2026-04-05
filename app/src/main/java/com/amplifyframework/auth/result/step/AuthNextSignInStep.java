package com.amplifyframework.auth.result.step;

import a.i.q.d;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AuthNextSignInStep {
    private final Map<String, String> additionalInfo;
    private final AuthCodeDeliveryDetails codeDeliveryDetails;
    private final AuthSignInStep signInStep;

    public AuthNextSignInStep(AuthSignInStep authSignInStep, Map<String, String> map, AuthCodeDeliveryDetails authCodeDeliveryDetails) {
        authSignInStep.getClass();
        this.signInStep = authSignInStep;
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
        if (obj == null || AuthNextSignInStep.class != obj.getClass()) {
            return false;
        }
        AuthNextSignInStep authNextSignInStep = (AuthNextSignInStep) obj;
        return d.a(getSignInStep(), authNextSignInStep.getSignInStep()) && d.a(getAdditionalInfo(), authNextSignInStep.getAdditionalInfo()) && d.a(getCodeDeliveryDetails(), authNextSignInStep.getCodeDeliveryDetails());
    }

    public Map<String, String> getAdditionalInfo() {
        return this.additionalInfo;
    }

    public AuthCodeDeliveryDetails getCodeDeliveryDetails() {
        return this.codeDeliveryDetails;
    }

    public AuthSignInStep getSignInStep() {
        return this.signInStep;
    }

    public int hashCode() {
        return d.b(getSignInStep(), getAdditionalInfo(), getCodeDeliveryDetails());
    }

    public String toString() {
        return "AuthNextSignInStep{signInStep=" + getSignInStep() + ", additionalInfo=" + getAdditionalInfo() + ", codeDeliveryDetails=" + getCodeDeliveryDetails() + '}';
    }
}
