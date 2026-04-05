package com.amplifyframework.auth.result;

import a.i.q.d;
import com.amplifyframework.auth.result.step.AuthNextResetPasswordStep;

/* JADX INFO: loaded from: classes.dex */
public final class AuthResetPasswordResult {
    private final boolean isPasswordReset;
    private final AuthNextResetPasswordStep nextStep;

    public AuthResetPasswordResult(boolean z, AuthNextResetPasswordStep authNextResetPasswordStep) {
        this.isPasswordReset = z;
        authNextResetPasswordStep.getClass();
        this.nextStep = authNextResetPasswordStep;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthResetPasswordResult.class != obj.getClass()) {
            return false;
        }
        AuthResetPasswordResult authResetPasswordResult = (AuthResetPasswordResult) obj;
        return d.a(Boolean.valueOf(isPasswordReset()), Boolean.valueOf(authResetPasswordResult.isPasswordReset())) && d.a(getNextStep(), authResetPasswordResult.getNextStep());
    }

    public AuthNextResetPasswordStep getNextStep() {
        return this.nextStep;
    }

    public int hashCode() {
        return d.b(Boolean.valueOf(isPasswordReset()), getNextStep());
    }

    public boolean isPasswordReset() {
        return this.isPasswordReset;
    }

    public String toString() {
        return "AuthResetPasswordResult{isPasswordReset=" + isPasswordReset() + ", nextStep=" + getNextStep() + '}';
    }
}
