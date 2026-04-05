package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4660d;

    public static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4661a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4662b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4663c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4664d = -1;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final a b(int i2) {
            int i3 = 1;
            switch (i2) {
                case 0:
                case 10:
                    this.f4662b = i3;
                    break;
                case 1:
                case 2:
                case 4:
                case 5:
                case 8:
                case 9:
                    this.f4662b = 4;
                    break;
                case 3:
                    i3 = 2;
                    this.f4662b = i3;
                    break;
                case 6:
                    this.f4662b = 1;
                    this.f4663c |= 4;
                    break;
                case 7:
                    this.f4663c = 1 | this.f4663c;
                    this.f4662b = 4;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i2 + " for AudioAttributesCompat");
                    break;
            }
            this.f4661a = AudioAttributesImplBase.e(i2);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f4662b, this.f4663c, this.f4661a, this.f4664d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(int i2) {
            if (i2 == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.f4664d = i2;
            return b(i2);
        }
    }

    public AudioAttributesImplBase() {
        this.f4657a = 0;
        this.f4658b = 0;
        this.f4659c = 0;
        this.f4660d = -1;
    }

    public AudioAttributesImplBase(int i2, int i3, int i4, int i5) {
        this.f4657a = 0;
        this.f4658b = 0;
        this.f4659c = 0;
        this.f4660d = -1;
        this.f4658b = i2;
        this.f4659c = i3;
        this.f4657a = i4;
        this.f4660d = i5;
    }

    public static int e(int i2) {
        switch (i2) {
        }
        return 2;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i2 = this.f4660d;
        return i2 != -1 ? i2 : AudioAttributesCompat.b(false, this.f4659c, this.f4657a);
    }

    public int b() {
        return this.f4658b;
    }

    public int c() {
        int i2 = this.f4659c;
        int iA = a();
        if (iA == 6) {
            i2 |= 4;
        } else if (iA == 7) {
            i2 |= 1;
        }
        return i2 & 273;
    }

    public int d() {
        return this.f4657a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f4658b == audioAttributesImplBase.b() && this.f4659c == audioAttributesImplBase.c() && this.f4657a == audioAttributesImplBase.d() && this.f4660d == audioAttributesImplBase.f4660d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4658b), Integer.valueOf(this.f4659c), Integer.valueOf(this.f4657a), Integer.valueOf(this.f4660d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4660d != -1) {
            sb.append(" stream=");
            sb.append(this.f4660d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.c(this.f4657a));
        sb.append(" content=");
        sb.append(this.f4658b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f4659c).toUpperCase());
        return sb.toString();
    }
}
