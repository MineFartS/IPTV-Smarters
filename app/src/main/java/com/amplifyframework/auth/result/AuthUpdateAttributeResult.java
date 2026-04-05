package com.amplifyframework.auth.result;

import a.i.q.d;
import com.amplifyframework.auth.result.step.AuthNextUpdateAttributeStep;

/* JADX INFO: loaded from: classes.dex */
public final class AuthUpdateAttributeResult {
    private final boolean isUpdated;
    private final AuthNextUpdateAttributeStep nextStep;

    public AuthUpdateAttributeResult(boolean z, AuthNextUpdateAttributeStep authNextUpdateAttributeStep) {
        this.isUpdated = z;
        authNextUpdateAttributeStep.getClass();
        this.nextStep = authNextUpdateAttributeStep;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthUpdateAttributeResult.class != obj.getClass()) {
            return false;
        }
        AuthUpdateAttributeResult authUpdateAttributeResult = (AuthUpdateAttributeResult) obj;
        return d.a(Boolean.valueOf(isUpdated()), Boolean.valueOf(authUpdateAttributeResult.isUpdated())) && d.a(getNextStep(), authUpdateAttributeResult.getNextStep());
    }

    public AuthNextUpdateAttributeStep getNextStep() {
        return this.nextStep;
    }

    public int hashCode() {
        return d.b(Boolean.valueOf(isUpdated()), getNextStep());
    }

    public boolean isUpdated() {
        return this.isUpdated;
    }

    public String toString() {
        return "AuthUpdateAttributeResult{isUpdated=" + isUpdated() + ", nextStep=" + getNextStep() + '}';
    }
}
