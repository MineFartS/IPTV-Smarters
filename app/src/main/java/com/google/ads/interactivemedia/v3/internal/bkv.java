package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.bkv;
import com.google.ads.interactivemedia.v3.internal.bkx;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class bkv<MessageType extends bkx<MessageType, BuilderType>, BuilderType extends bkv<MessageType, BuilderType>> extends bjo<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageType f21329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21330b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MessageType f21331c;

    public bkv(MessageType messagetype) {
        this.f21331c = messagetype;
        this.f21329a = (MessageType) messagetype.av(4);
    }

    private static final void a(MessageType messagetype, MessageType messagetype2) {
        bmg.a().c(messagetype).g(messagetype, messagetype2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjo
    public final /* bridge */ /* synthetic */ bjo Y(bjp bjpVar) {
        ah((bkx) bjpVar);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bma
    public final /* bridge */ /* synthetic */ blz aU() {
        return this.f21331c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bjo
    /* JADX INFO: renamed from: ab, reason: merged with bridge method [inline-methods] */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.f21331c.av(5);
        buildertype.ah(ae());
        return buildertype;
    }

    public final MessageType ac() {
        MessageType messagetype = (MessageType) ae();
        if (messagetype.au()) {
            return messagetype;
        }
        throw new bmy();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bly
    /* JADX INFO: renamed from: ad, reason: merged with bridge method [inline-methods] */
    public MessageType ae() {
        if (this.f21330b) {
            return this.f21329a;
        }
        MessageType messagetype = this.f21329a;
        bmg.a().c(messagetype).f(messagetype);
        this.f21330b = true;
        return this.f21329a;
    }

    public void ag() {
        MessageType messagetype = (MessageType) this.f21329a.av(4);
        a(messagetype, this.f21329a);
        this.f21329a = messagetype;
    }

    public final void ah(MessageType messagetype) {
        if (this.f21330b) {
            ag();
            this.f21330b = false;
        }
        a(this.f21329a, messagetype);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjo
    /* JADX INFO: renamed from: ai, reason: merged with bridge method [inline-methods] */
    public final void aa(byte[] bArr, int i2, bkm bkmVar) throws blf {
        if (this.f21330b) {
            ag();
            this.f21330b = false;
        }
        try {
            bmg.a().c(this.f21329a).i(this.f21329a, bArr, 0, i2, new bjt(bkmVar));
        } catch (blf e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        } catch (IndexOutOfBoundsException unused) {
            throw blf.h();
        }
    }
}
