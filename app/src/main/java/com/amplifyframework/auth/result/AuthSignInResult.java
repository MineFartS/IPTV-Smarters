package com.amplifyframework.auth.result;

import a.i.q.d;
import com.amplifyframework.auth.result.step.AuthNextSignInStep;

/* JADX INFO: loaded from: classes.dex */
public final class AuthSignInResult {
    private final boolean isSignInComplete;
    private final AuthNextSignInStep nextStep;

    public AuthSignInResult(boolean z, AuthNextSignInStep authNextSignInStep) {
        this.isSignInComplete = z;
        authNextSignInStep.getClass();
        this.nextStep = authNextSignInStep;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthSignInResult.class != obj.getClass()) {
            return false;
        }
        AuthSignInResult authSignInResult = (AuthSignInResult) obj;
        return d.a(Boolean.valueOf(isSignInComplete()), Boolean.valueOf(authSignInResult.isSignInComplete())) && d.a(getNextStep(), authSignInResult.getNextStep());
    }

    public AuthNextSignInStep getNextStep() {
        return this.nextStep;
    }

    public int hashCode() {
        return d.b(Boolean.valueOf(isSignInComplete()), getNextStep());
    }

    public boolean isSignInComplete() {
        return this.isSignInComplete;
    }

    public String toString() {
        return "AuthSignInResult{isSignInComplete=" + isSignInComplete() + ", nextStep=" + getNextStep() + '}';
    }
}
