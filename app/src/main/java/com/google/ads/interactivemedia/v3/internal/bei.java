package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import com.google.ads.interactivemedia.v3.internal.bek;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class bei<T_WRAPPER extends bek<T_ENGINE>, T_ENGINE> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bei<bej, Cipher> f20995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bei<bej, Mac> f20996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bei<bej, KeyAgreement> f20997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bei<bej, KeyPairGenerator> f20998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bei<bej, KeyFactory> f20999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f21000f = Logger.getLogger(bei.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<Provider> f21001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f21002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final T_WRAPPER f21003i;

    static {
        if (bet.b()) {
            String[] strArr = {"GmsCore_OpenSSL", KeyProvider18.CIPHER_PROVIDER_NAME_FOR_RSA};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f21000f.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            f21001g = arrayList;
        } else {
            f21001g = new ArrayList();
        }
        f21002h = true;
        f20995a = new bei<>(new bej(1));
        f20996b = new bei<>(new bej(4));
        new bei(new bej(6));
        new bei(new bej(5));
        f20997c = new bei<>(new bej());
        f20998d = new bei<>(new bej(3));
        f20999e = new bei<>(new bej(2));
    }

    public bei(T_WRAPPER t_wrapper) {
        this.f21003i = t_wrapper;
    }

    public final T_ENGINE a(String str) throws GeneralSecurityException {
        Iterator<Provider> it = f21001g.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return (T_ENGINE) this.f21003i.a(str, it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (f21002h) {
            return (T_ENGINE) this.f21003i.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
