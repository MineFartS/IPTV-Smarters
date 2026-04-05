package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ds extends ImageView implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompanionData f21669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f21670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ed f21671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<CompanionAdSlot.ClickListener> f21673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dr f21674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fq f21675g;

    public ds(Context context, ed edVar, CompanionData companionData, String str, List<CompanionAdSlot.ClickListener> list, fq fqVar) {
        dr drVar;
        super(context);
        this.f21670b = getResources().getDisplayMetrics().density;
        this.f21671c = edVar;
        this.f21669a = companionData;
        this.f21672d = str;
        this.f21673e = list;
        String size = companionData.size();
        if (size == null) {
            drVar = null;
        } else {
            String[] strArrSplit = size.split("x", -1);
            drVar = strArrSplit.length != 2 ? new dr(0, 0) : new dr(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
        }
        this.f21674f = drVar;
        this.f21675g = fqVar;
        setOnClickListener(this);
    }

    public static /* synthetic */ void c(ds dsVar) {
        ed edVar = dsVar.f21671c;
        String strCompanionId = dsVar.f21669a.companionId();
        String str = dsVar.f21672d;
        if (art.c(strCompanionId) || art.c(str)) {
            return;
        }
        HashMap mapC = auv.c(1);
        mapC.put("companionId", strCompanionId);
        edVar.o(new dw(du.displayContainer, dv.companionView, str, mapC));
    }

    public final Bitmap a(String str) {
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        if (bitmapDecodeStream == null) {
            return null;
        }
        return (this.f21674f.f21667a == bitmapDecodeStream.getWidth() && this.f21674f.f21668b == bitmapDecodeStream.getHeight() && !avw.a((double) this.f21670b)) ? Bitmap.createScaledBitmap(bitmapDecodeStream, (int) (this.f21670b * bitmapDecodeStream.getWidth()), (int) (this.f21670b * bitmapDecodeStream.getHeight()), true) : bitmapDecodeStream;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Iterator<CompanionAdSlot.ClickListener> it = this.f21673e.iterator();
        while (it.hasNext()) {
            it.next().onCompanionAdClick();
        }
        this.f21675g.a(this.f21669a.clickThroughUrl(), getContext(), false);
    }
}
