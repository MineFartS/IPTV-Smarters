package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.bjo;
import com.google.ads.interactivemedia.v3.internal.bjp;

/* JADX INFO: loaded from: classes.dex */
public abstract class bjo<MessageType extends bjp<MessageType, BuilderType>, BuilderType extends bjo<MessageType, BuilderType>> implements bly {
    @Override // 
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    public abstract BuilderType Y(MessageType messagetype);

    @Override // com.google.ads.interactivemedia.v3.internal.bly
    public final /* bridge */ /* synthetic */ bly Z(blz blzVar) {
        if (aU().getClass().isInstance(blzVar)) {
            return Y((bjp) blzVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public void aa(byte[] bArr, int i2, bkm bkmVar) {
        throw null;
    }
}
