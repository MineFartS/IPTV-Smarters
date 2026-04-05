package org.jsoup.nodes;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class BooleanAttribute extends Attribute {
    public BooleanAttribute(String str) {
        super(str, BuildConfig.FLAVOR);
    }

    @Override // org.jsoup.nodes.Attribute
    public boolean isBooleanAttribute() {
        return true;
    }
}
