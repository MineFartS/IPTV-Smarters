package androidx.media;

import a.d0.b;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f4652d = (AudioAttributesImpl) bVar.v(audioAttributesCompat.f4652d, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.x(false, false);
        bVar.M(audioAttributesCompat.f4652d, 1);
    }
}
