package d.a.a.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.security.KeyChainException;
import d.a.a.c.c;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Vector;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    public static class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f30134a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f30135b;

        public a(BlockingQueue blockingQueue) {
            this.f30135b = blockingQueue;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (this.f30134a) {
                return;
            }
            this.f30134a = true;
            try {
                this.f30135b.put(c.a.J(iBinder));
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static class b implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f30136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ServiceConnection f30137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d.a.a.c.c f30138d;

        public b(Context context, ServiceConnection serviceConnection, d.a.a.c.c cVar) {
            this.f30136b = context;
            this.f30137c = serviceConnection;
            this.f30138d = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f30136b.unbindService(this.f30137c);
        }

        public d.a.a.c.c d() {
            return this.f30138d;
        }
    }

    public static b a(Context context, String str) throws KeyChainException {
        b(context);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1);
        a aVar = new a(linkedBlockingQueue);
        Intent intent = new Intent("de.blinkt.openvpn.api.ExternalCertificateProvider");
        intent.setPackage(str);
        if (context.bindService(intent, aVar, 1)) {
            return new b(context, aVar, (d.a.a.c.c) linkedBlockingQueue.take());
        }
        throw new KeyChainException("could not bind to external authticator app: " + str);
    }

    public static void b(Context context) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper == context.getMainLooper()) {
            throw new IllegalStateException("calling this from your main thread can lead to deadlock");
        }
    }

    public static X509Certificate[] c(Context context, String str, String str2) throws KeyChainException {
        try {
            b bVarA = a(context.getApplicationContext(), str);
            try {
                byte[] bArrR1 = bVarA.d().R1(str2);
                if (bArrR1 == null) {
                    bVarA.close();
                    return null;
                }
                Collection<X509Certificate> collectionE = e(bArrR1);
                X509Certificate[] x509CertificateArr = (X509Certificate[]) collectionE.toArray(new X509Certificate[collectionE.size()]);
                bVarA.close();
                return x509CertificateArr;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        try {
                            bVarA.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (RemoteException | InterruptedException | RuntimeException e2) {
            throw new KeyChainException(e2);
        }
    }

    public static byte[] d(Context context, String str, String str2, byte[] bArr, Bundle bundle) throws KeyChainException {
        try {
            b bVarA = a(context.getApplicationContext(), str);
            try {
                d.a.a.c.c cVarD = bVarA.d();
                byte[] bArrT1 = cVarD.T1(str2, bArr, bundle);
                if (bArrT1 == null) {
                    bArrT1 = cVarD.U0(str2, bArr);
                }
                bVarA.close();
                return bArrT1;
            } finally {
            }
        } catch (RemoteException e2) {
            throw new KeyChainException(e2);
        }
    }

    public static Collection<X509Certificate> e(byte[] bArr) {
        try {
            Vector vector = new Vector();
            for (String str : new String(bArr, "iso8859-1").split("-----BEGIN CERTIFICATE-----")) {
                vector.addAll(CertificateFactory.getInstance("X.509").generateCertificates(new ByteArrayInputStream(("-----BEGIN CERTIFICATE-----" + str).getBytes("iso8859-1"))));
            }
            return vector;
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        } catch (CertificateException e3) {
            throw new AssertionError(e3);
        }
    }
}
