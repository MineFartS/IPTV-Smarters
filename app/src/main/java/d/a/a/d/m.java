package d.a.a.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import minefarts.iptvsmarters.R;
import d.a.a.d.z;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Locale;
import java.util.UnknownFormatConversionException;

/* JADX INFO: loaded from: classes2.dex */
public class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f30145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z.c f30148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f30149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30150g;

    public static class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i2) {
            return new m[i2];
        }
    }

    public m(Parcel parcel) {
        this.f30145b = null;
        this.f30146c = null;
        this.f30148e = z.c.INFO;
        this.f30149f = System.currentTimeMillis();
        this.f30150g = -1;
        this.f30145b = parcel.readArray(Object.class.getClassLoader());
        this.f30146c = parcel.readString();
        this.f30147d = parcel.readInt();
        this.f30148e = z.c.getEnumByValue(parcel.readInt());
        this.f30150g = parcel.readInt();
        this.f30149f = parcel.readLong();
    }

    public m(z.c cVar, int i2) {
        this.f30145b = null;
        this.f30146c = null;
        this.f30148e = z.c.INFO;
        this.f30149f = System.currentTimeMillis();
        this.f30150g = -1;
        this.f30147d = i2;
        this.f30148e = cVar;
    }

    public m(z.c cVar, int i2, String str) {
        this.f30145b = null;
        this.f30146c = null;
        this.f30148e = z.c.INFO;
        this.f30149f = System.currentTimeMillis();
        this.f30150g = -1;
        this.f30146c = str;
        this.f30148e = cVar;
        this.f30150g = i2;
    }

    public m(z.c cVar, int i2, Object... objArr) {
        this.f30145b = null;
        this.f30146c = null;
        this.f30148e = z.c.INFO;
        this.f30149f = System.currentTimeMillis();
        this.f30150g = -1;
        this.f30147d = i2;
        this.f30145b = objArr;
        this.f30148e = cVar;
    }

    public m(z.c cVar, String str) {
        this.f30145b = null;
        this.f30146c = null;
        this.f30148e = z.c.INFO;
        this.f30149f = System.currentTimeMillis();
        this.f30150g = -1;
        this.f30148e = cVar;
        this.f30146c = str;
    }

    public static String h(CharSequence charSequence, Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(charSequence);
            }
            sb.append(obj);
        }
        return sb.toString();
    }

    public long b() {
        return this.f30149f;
    }

    public byte[] c() throws UnsupportedEncodingException {
        String string;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16384);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putLong(this.f30149f);
        byteBufferAllocate.putInt(this.f30150g);
        byteBufferAllocate.putInt(this.f30148e.getInt());
        byteBufferAllocate.putInt(this.f30147d);
        String str = this.f30146c;
        if (str == null || str.length() == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            j(this.f30146c, byteBufferAllocate);
        }
        Object[] objArr = this.f30145b;
        if (objArr == null || objArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(objArr.length);
            for (Object obj : this.f30145b) {
                if (obj instanceof String) {
                    byteBufferAllocate.putChar('s');
                    string = (String) obj;
                } else {
                    if (obj instanceof Integer) {
                        byteBufferAllocate.putChar('i');
                        byteBufferAllocate.putInt(((Integer) obj).intValue());
                    } else if (obj instanceof Float) {
                        byteBufferAllocate.putChar('f');
                        byteBufferAllocate.putFloat(((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        byteBufferAllocate.putChar('d');
                        byteBufferAllocate.putDouble(((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        byteBufferAllocate.putChar('l');
                        byteBufferAllocate.putLong(((Long) obj).longValue());
                    } else if (obj == null) {
                        byteBufferAllocate.putChar('0');
                    } else {
                        z.m("Unknown object for LogItem marschaling " + obj);
                        byteBufferAllocate.putChar('s');
                        string = obj.toString();
                    }
                }
                j(string, byteBufferAllocate);
            }
        }
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.rewind();
        return Arrays.copyOf(byteBufferAllocate.array(), iPosition);
    }

    @SuppressLint({"StringFormatMatches"})
    public final String d(Context context) {
        String str;
        context.getPackageManager();
        String string = "error getting package signature";
        try {
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray()));
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(x509Certificate.getEncoded());
            byte[] bArrDigest = messageDigest.digest();
            string = Arrays.equals(bArrDigest, z.f30220m) ? context.getString(R.string.official_build) : Arrays.equals(bArrDigest, z.f30221n) ? context.getString(R.string.debug_build) : Arrays.equals(bArrDigest, z.f30222o) ? "amazon version" : Arrays.equals(bArrDigest, z.p) ? "F-Droid built and signed version" : context.getString(R.string.built_by, x509Certificate.getSubjectX500Principal().getName());
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException unused) {
            str = "error getting version";
        }
        Object[] objArr = this.f30145b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[objArrCopyOf.length - 1] = string;
        objArrCopyOf[objArrCopyOf.length - 2] = str;
        return context.getString(R.string.mobile_info, objArrCopyOf);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e(Context context) {
        try {
            String str = this.f30146c;
            if (str != null) {
                return str;
            }
            if (context != null) {
                int i2 = this.f30147d;
                if (i2 == R.string.mobile_info) {
                    return d(context);
                }
                Object[] objArr = this.f30145b;
                return objArr == null ? context.getString(i2) : context.getString(i2, objArr);
            }
            String str2 = String.format(Locale.ENGLISH, "Log (no context) resid %d", Integer.valueOf(this.f30147d));
            if (this.f30145b == null) {
                return str2;
            }
            return str2 + h("|", this.f30145b);
        } catch (FormatFlagsConversionMismatchException e2) {
            if (context == null) {
                throw e2;
            }
            throw new FormatFlagsConversionMismatchException(e2.getLocalizedMessage() + e(null), e2.getConversion());
        } catch (UnknownFormatConversionException e3) {
            if (context == null) {
                throw e3;
            }
            throw new UnknownFormatConversionException(e3.getLocalizedMessage() + e(null));
        }
    }

    public boolean equals(Object obj) {
        String str;
        z.c cVar;
        if (!(obj instanceof m)) {
            return obj.equals(this);
        }
        m mVar = (m) obj;
        return Arrays.equals(this.f30145b, mVar.f30145b) && (((str = mVar.f30146c) == null && this.f30146c == str) || this.f30146c.equals(str)) && this.f30147d == mVar.f30147d && ((((cVar = this.f30148e) == null && mVar.f30148e == cVar) || mVar.f30148e.equals(cVar)) && this.f30150g == mVar.f30150g && this.f30149f == mVar.f30149f);
    }

    public int f() {
        int i2 = this.f30150g;
        return i2 == -1 ? this.f30148e.getInt() : i2;
    }

    public final void j(String str, ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        byte[] bytes = str.getBytes("UTF-8");
        byteBuffer.putInt(bytes.length);
        byteBuffer.put(bytes);
    }

    public String toString() {
        return e(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeArray(this.f30145b);
        parcel.writeString(this.f30146c);
        parcel.writeInt(this.f30147d);
        parcel.writeInt(this.f30148e.getInt());
        parcel.writeInt(this.f30150g);
        parcel.writeLong(this.f30149f);
    }
}
