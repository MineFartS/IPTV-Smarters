package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class axx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f20701a = Logger.getLogger(axx.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, axw> f20702b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap<String, axv> f20703c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f20704d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap<String, awv<?>> f20705e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, axq<?, ?>> f20706f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ConcurrentMap<String, axd> f20707g = new ConcurrentHashMap();

    private axx() {
    }

    @Deprecated
    public static awv<?> a(String str) {
        String strValueOf;
        String str2;
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ConcurrentMap<String, awv<?>> concurrentMap = f20705e;
        Locale locale = Locale.US;
        awv<?> awvVar = concurrentMap.get(str.toLowerCase(locale));
        if (awvVar != null) {
            return awvVar;
        }
        String strConcat = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call DeterministicAeadConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call StreamingAeadConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call HybridConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call MacConfig.register().";
        } else {
            if (!str.toLowerCase(locale).startsWith("tinkpublickeysign") && !str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                if (str.toLowerCase(locale).startsWith("tink")) {
                    strValueOf = String.valueOf(strConcat);
                    str2 = "Maybe call TinkConfig.register().";
                }
                throw new GeneralSecurityException(strConcat);
            }
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call SignatureConfig.register().";
        }
        strConcat = strValueOf.concat(str2);
        throw new GeneralSecurityException(strConcat);
    }

    public static axa<?> b(String str) {
        return q(str).b();
    }

    public static synchronized blz c(bcw bcwVar) {
        axa<?> axaVarB;
        axaVarB = b(bcwVar.g());
        if (!f20704d.get(bcwVar.g()).booleanValue()) {
            String strValueOf = String.valueOf(bcwVar.g());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return axaVarB.b(bcwVar.f());
    }

    public static Class<?> d(Class<?> cls) {
        axq<?, ?> axqVar = f20706f.get(cls);
        if (axqVar == null) {
            return null;
        }
        return axqVar.a();
    }

    public static <P> P e(bct bctVar, Class<P> cls) {
        return (P) r(bctVar.g(), bctVar.f(), cls);
    }

    public static <P> P f(String str, blz blzVar, Class<P> cls) {
        return (P) o(str, cls).e(blzVar);
    }

    public static <P> P g(String str, byte[] bArr, Class<P> cls) {
        return (P) r(str, bkd.o(bArr), cls);
    }

    public static <B, P> P h(axp<B> axpVar, Class<P> cls) throws GeneralSecurityException {
        axq<?, ?> axqVar = f20706f.get(cls);
        if (axqVar == null) {
            String name = axpVar.d().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
        }
        if (axqVar.a().equals(axpVar.d())) {
            return (P) axqVar.c(axpVar);
        }
        String strValueOf = String.valueOf(axqVar.a());
        String strValueOf2 = String.valueOf(axpVar.d());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 44 + strValueOf2.length());
        sb.append("Wrong input primitive class, expected ");
        sb.append(strValueOf);
        sb.append(", got ");
        sb.append(strValueOf2);
        throw new GeneralSecurityException(sb.toString());
    }

    public static synchronized Map<String, axd> i() {
        return Collections.unmodifiableMap(f20707g);
    }

    public static synchronized <P> void j(axa<P> axaVar, boolean z) {
        if (axaVar == null) {
            throw new IllegalArgumentException("key manager must be non-null.");
        }
        String strF = axaVar.f();
        s(strF, axaVar.getClass(), Collections.emptyMap(), z);
        f20702b.putIfAbsent(strF, new axs(axaVar));
        f20704d.put(strF, Boolean.valueOf(z));
    }

    public static synchronized <B, P> void k(axq<B, P> axqVar) {
        if (axqVar == null) {
            throw new IllegalArgumentException("wrapper must be non-null");
        }
        Class<P> clsB = axqVar.b();
        ConcurrentMap<Class<?>, axq<?, ?>> concurrentMap = f20706f;
        if (concurrentMap.containsKey(clsB)) {
            axq<?, ?> axqVar2 = concurrentMap.get(clsB);
            if (!axqVar.getClass().getName().equals(axqVar2.getClass().getName())) {
                Logger logger = f20701a;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(clsB);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 62);
                sb.append("Attempted overwrite of a registered PrimitiveWrapper for type ");
                sb.append(strValueOf);
                logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb.toString());
                throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", clsB.getName(), axqVar2.getClass().getName(), axqVar.getClass().getName()));
            }
        }
        concurrentMap.put(clsB, axqVar);
    }

    public static synchronized void l(bcw bcwVar) {
        axa<?> axaVarB = b(bcwVar.g());
        if (!f20704d.get(bcwVar.g()).booleanValue()) {
            String strValueOf = String.valueOf(bcwVar.g());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        axaVarB.a(bcwVar.f());
    }

    public static synchronized <KeyProtoT extends blz, PublicKeyProtoT extends blz> void m(axr<KeyProtoT, PublicKeyProtoT> axrVar, axh<PublicKeyProtoT> axhVar) {
        Class<?> clsD;
        s("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", axrVar.getClass(), axrVar.a().d(), true);
        s("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", axhVar.getClass(), Collections.emptyMap(), false);
        ConcurrentMap<String, axw> concurrentMap = f20702b;
        if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (clsD = concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").d()) != null && !clsD.getName().equals(axhVar.getClass().getName())) {
            Logger logger = f20701a;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder(219);
            sb.append("Attempted overwrite of a registered key manager for key type ");
            sb.append("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
            sb.append(" with inconsistent public key type ");
            sb.append("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
            logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", axrVar.getClass().getName(), clsD.getName(), axhVar.getClass().getName()));
        }
        if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").d() == null) {
            concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new axu(axrVar, axhVar));
            f20703c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", u(axrVar));
            t("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", axrVar.a().d());
        }
        ConcurrentMap<String, Boolean> concurrentMap2 = f20704d;
        concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
        if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", p(axhVar));
        }
        concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
    }

    public static synchronized <KeyProtoT extends blz> void n(axh<KeyProtoT> axhVar) {
        String strG = axhVar.g();
        s(strG, axhVar.getClass(), axhVar.a().d(), true);
        ConcurrentMap<String, axw> concurrentMap = f20702b;
        if (!concurrentMap.containsKey(strG)) {
            concurrentMap.put(strG, p(axhVar));
            f20703c.put(strG, u(axhVar));
            t(strG, axhVar.a().d());
        }
        f20704d.put(strG, Boolean.TRUE);
    }

    private static <P> axa<P> o(String str, Class<P> cls) throws GeneralSecurityException {
        axw axwVarQ = q(str);
        if (axwVarQ.e().contains(cls)) {
            return axwVarQ.a(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(axwVarQ.c());
        Set<Class<?>> setE = axwVarQ.e();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : setE) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String string = sb.toString();
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + strValueOf.length() + String.valueOf(string).length());
        sb2.append("Primitive type ");
        sb2.append(name);
        sb2.append(" not supported by key manager of type ");
        sb2.append(strValueOf);
        sb2.append(", supported primitives: ");
        sb2.append(string);
        throw new GeneralSecurityException(sb2.toString());
    }

    private static <KeyProtoT extends blz> axw p(axh<KeyProtoT> axhVar) {
        return new axt(axhVar);
    }

    private static synchronized axw q(String str) {
        ConcurrentMap<String, axw> concurrentMap;
        concurrentMap = f20702b;
        if (!concurrentMap.containsKey(str)) {
            String strValueOf = String.valueOf(str);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "No key manager found for key type ".concat(strValueOf) : new String("No key manager found for key type "));
        }
        return concurrentMap.get(str);
    }

    private static <P> P r(String str, bkd bkdVar, Class<P> cls) {
        return (P) o(str, cls).d(bkdVar);
    }

    private static synchronized <KeyProtoT extends blz, KeyFormatProtoT extends blz> void s(String str, Class cls, Map<String, axe<KeyFormatProtoT>> map, boolean z) {
        ConcurrentMap<String, axw> concurrentMap = f20702b;
        axw axwVar = concurrentMap.get(str);
        if (axwVar != null && !axwVar.c().equals(cls)) {
            f20701a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, axwVar.c().getName(), cls.getName()));
        }
        if (z) {
            ConcurrentMap<String, Boolean> concurrentMap2 = f20704d;
            if (concurrentMap2.containsKey(str) && !concurrentMap2.get(str).booleanValue()) {
                throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
            }
            if (concurrentMap.containsKey(str)) {
                for (Map.Entry<String, axe<KeyFormatProtoT>> entry : map.entrySet()) {
                    if (!f20707g.containsKey(entry.getKey())) {
                        String key = entry.getKey();
                        StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 79 + str.length());
                        sb.append("Attempted to register a new key template ");
                        sb.append(key);
                        sb.append(" from an existing key manager of type ");
                        sb.append(str);
                        throw new GeneralSecurityException(sb.toString());
                    }
                }
            } else {
                for (Map.Entry<String, axe<KeyFormatProtoT>> entry2 : map.entrySet()) {
                    if (f20707g.containsKey(entry2.getKey())) {
                        String strValueOf = String.valueOf(entry2.getKey());
                        throw new GeneralSecurityException(strValueOf.length() != 0 ? "Attempted overwrite of a registered key template ".concat(strValueOf) : new String("Attempted overwrite of a registered key template "));
                    }
                }
            }
        }
    }

    private static <KeyFormatProtoT extends blz> void t(String str, Map<String, axe<KeyFormatProtoT>> map) {
        for (Map.Entry<String, axe<KeyFormatProtoT>> entry : map.entrySet()) {
            f20707g.put(entry.getKey(), axd.d(str, entry.getValue().f20680a.ai(), entry.getValue().f20681b));
        }
    }

    private static <KeyProtoT extends blz> axv u(axh<KeyProtoT> axhVar) {
        return new axv();
    }
}
