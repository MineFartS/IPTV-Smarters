package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.webkit.WebView;
import com.amazonaws.services.s3.util.Mimetypes;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dk extends WebView {
    @SuppressLint({"SetJavaScriptEnabled"})
    public dk(Context context, CompanionData companionData, List<CompanionAdSlot.ClickListener> list, fq fqVar) {
        super(context);
        if (Build.VERSION.SDK_INT >= 21) {
            getSettings().setJavaScriptEnabled(true);
        }
        getSettings().setSupportMultipleWindows(true);
        setWebChromeClient(new dj(context, fqVar, list));
        if (companionData.type() == com.google.ads.interactivemedia.v3.impl.data.as.Html) {
            loadData(Base64.encodeToString(companionData.src().getBytes(), 1), Mimetypes.MIMETYPE_HTML, "base64");
            return;
        }
        if (companionData.type() == com.google.ads.interactivemedia.v3.impl.data.as.IFrame) {
            loadUrl(companionData.src());
            return;
        }
        String strValueOf = String.valueOf(companionData.type());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 51);
        sb.append("Companion type ");
        sb.append(strValueOf);
        sb.append(" is not valid for a CompanionWebView");
        throw new IllegalArgumentException(sb.toString());
    }
}
