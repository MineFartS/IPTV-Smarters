package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f4654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4655b;

    public static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes.Builder f4656a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(int i2) {
            this.f4656a.setLegacyStreamType(i2);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f4656a.build());
        }
    }

    public AudioAttributesImplApi21() {
        this.f4655b = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i2) {
        this.f4655b = -1;
        this.f4654a = audioAttributes;
        this.f4655b = i2;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i2 = this.f4655b;
        return i2 != -1 ? i2 : AudioAttributesCompat.b(false, b(), c());
    }

    public int b() {
        return this.f4654a.getFlags();
    }

    public int c() {
        return this.f4654a.getUsage();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f4654a.equals(((AudioAttributesImplApi21) obj).f4654a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4654a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4654a;
    }
}
