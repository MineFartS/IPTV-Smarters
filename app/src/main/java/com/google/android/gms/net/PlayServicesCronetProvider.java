package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.g;
import c.f.a.c.f.h;
import c.f.a.c.f.q.o;
import c.f.a.c.l.a;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    @UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(@RecentlyNonNull Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        String str;
        try {
            a.d(this.mContext);
        } catch (g unused) {
            if (Log.isLoggable(TAG, 4)) {
                str = "Google-Play-Services-Cronet-Provider is unavailable.";
                Log.i(TAG, str);
            }
        } catch (h unused2) {
            if (Log.isLoggable(TAG, 4)) {
                str = "Google-Play-Services-Cronet-Provider is not installed yet.";
                Log.i(TAG, str);
            }
        }
    }

    @Override // org.chromium.net.CronetProvider
    @RecentlyNonNull
    @Keep
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        try {
            a.d(this.mContext);
            Throwable th = null;
            try {
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) ((ClassLoader) o.i(((DynamiteModule) o.i(a.b())).b().getClassLoader())).loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                builder = null;
                th = e2;
            }
            if (th != null) {
                throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", th);
            }
            o.j(builder, "The value of the constructed builder should never be null");
            return builder;
        } catch (g e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e3);
        } catch (h e4) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e4);
        }
    }

    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext));
    }

    @Override // org.chromium.net.CronetProvider
    @RecentlyNonNull
    @Keep
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    @RecentlyNonNull
    @Keep
    public String getVersion() {
        tryToInstallCronetProvider();
        return a.c();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public boolean isEnabled() {
        tryToInstallCronetProvider();
        return a.a();
    }
}
