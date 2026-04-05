package com.amplifyframework.auth.result;

import a.i.q.d;
import com.amplifyframework.auth.AuthUser;
import com.amplifyframework.auth.result.step.AuthNextSignUpStep;

/* JADX INFO: loaded from: classes.dex */
public final class AuthSignUpResult {
    private final boolean isSignUpComplete;
    private final AuthNextSignUpStep nextStep;
    private final AuthUser user;

    public AuthSignUpResult(boolean z, AuthNextSignUpStep authNextSignUpStep, AuthUser authUser) {
        this.isSignUpComplete = z;
        authNextSignUpStep.getClass();
        this.nextStep = authNextSignUpStep;
        this.user = authUser;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthSignUpResult.class != obj.getClass()) {
            return false;
        }
        AuthSignUpResult authSignUpResult = (AuthSignUpResult) obj;
        return d.a(Boolean.valueOf(isSignUpComplete()), Boolean.valueOf(authSignUpResult.isSignUpComplete())) && d.a(getNextStep(), authSignUpResult.getNextStep()) && d.a(getUser(), authSignUpResult.getUser());
    }

    public AuthNextSignUpStep getNextStep() {
        return this.nextStep;
    }

    public AuthUser getUser() {
        return this.user;
    }

    public int hashCode() {
        return d.b(Boolean.valueOf(isSignUpComplete()), getNextStep(), getUser());
    }

    public boolean isSignUpComplete() {
        return this.isSignUpComplete;
    }

    public String toString() {
        return "AuthSignUpResult{isSignUpComplete=" + isSignUpComplete() + ", nextStep=" + getNextStep() + ", user=" + getUser() + '}';
    }
}
