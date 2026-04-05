package com.amazonaws.mobile.auth.core.signin;

/* JADX INFO: loaded from: classes.dex */
public interface SignInPermissionsHandler {
    int getPermissionRequestCode();

    void handleRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
}
