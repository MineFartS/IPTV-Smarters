package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.amazonaws.services.s3.internal.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bc f20831a = new bc();

    private bc() {
    }

    public static bc a() {
        return f20831a;
    }

    public final void b(WebView webView, String str, Object... objArr) {
        String string;
        if (webView == null) {
            String strConcat = str.length() != 0 ? "The WebView is null for ".concat(str) : new String("The WebView is null for ");
            if (!ai.f19778a.booleanValue() || TextUtils.isEmpty(strConcat)) {
                return;
            }
            Log.i("OMIDLIB", strConcat);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        if (objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    string = "\"\"";
                } else {
                    if (obj instanceof String) {
                        string = obj.toString();
                        if (!string.startsWith("{")) {
                            sb.append('\"');
                            sb.append(string);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.append(string);
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")}");
        String string2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(string2);
        } else {
            handler.post(new bb(webView, string2));
        }
    }

    public final void c(WebView webView) {
        b(webView, "finishSession", new Object[0]);
    }

    public final void d(WebView webView, JSONObject jSONObject) {
        b(webView, "init", jSONObject);
    }

    public final void e(WebView webView, float f2) {
        b(webView, "setDeviceVolume", Float.valueOf(f2));
    }

    public final void f(WebView webView, String str) {
        b(webView, "setNativeViewHierarchy", str);
    }

    public final void g(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void h(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(null)) {
            return;
        }
        webView.loadUrl(Constants.NULL_VERSION_ID.length() != 0 ? "javascript: ".concat(Constants.NULL_VERSION_ID) : new String("javascript: "));
    }
}
