package androidx.media;

import a.d0.b;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4657a = bVar.p(audioAttributesImplBase.f4657a, 1);
        audioAttributesImplBase.f4658b = bVar.p(audioAttributesImplBase.f4658b, 2);
        audioAttributesImplBase.f4659c = bVar.p(audioAttributesImplBase.f4659c, 3);
        audioAttributesImplBase.f4660d = bVar.p(audioAttributesImplBase.f4660d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.x(false, false);
        bVar.F(audioAttributesImplBase.f4657a, 1);
        bVar.F(audioAttributesImplBase.f4658b, 2);
        bVar.F(audioAttributesImplBase.f4659c, 3);
        bVar.F(audioAttributesImplBase.f4660d, 4);
    }
}
