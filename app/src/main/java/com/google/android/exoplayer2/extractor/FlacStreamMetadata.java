package com.google.android.exoplayer2.extractor;

import c.f.a.b.j3.h0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.k1;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class FlacStreamMetadata {
    public static final int NOT_IN_LOOKUP_TABLE = -1;
    private static final String SEPARATOR = "=";
    private static final String TAG = "FlacStreamMetadata";
    public final int bitsPerSample;
    public final int bitsPerSampleLookupKey;
    public final int channels;
    public final int maxBlockSizeSamples;
    public final int maxFrameSize;
    private final c.f.a.b.b3.a metadata;
    public final int minBlockSizeSamples;
    public final int minFrameSize;
    public final int sampleRate;
    public final int sampleRateLookupKey;
    public final a seekTable;
    public final long totalSamples;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f23915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f23916b;

        public a(long[] jArr, long[] jArr2) {
            this.f23915a = jArr;
            this.f23916b = jArr2;
        }
    }

    private FlacStreamMetadata(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, a aVar, c.f.a.b.b3.a aVar2) {
        this.minBlockSizeSamples = i2;
        this.maxBlockSizeSamples = i3;
        this.minFrameSize = i4;
        this.maxFrameSize = i5;
        this.sampleRate = i6;
        this.sampleRateLookupKey = getSampleRateLookupKey(i6);
        this.channels = i7;
        this.bitsPerSample = i8;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(i8);
        this.totalSamples = j2;
        this.seekTable = aVar;
        this.metadata = aVar2;
    }

    public FlacStreamMetadata(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
        this(i2, i3, i4, i5, i6, i7, i8, j2, (a) null, buildMetadata(arrayList, arrayList2));
    }

    public FlacStreamMetadata(byte[] bArr, int i2) {
        h0 h0Var = new h0(bArr);
        h0Var.p(i2 * 8);
        this.minBlockSizeSamples = h0Var.h(16);
        this.maxBlockSizeSamples = h0Var.h(16);
        this.minFrameSize = h0Var.h(24);
        this.maxFrameSize = h0Var.h(24);
        int iH = h0Var.h(20);
        this.sampleRate = iH;
        this.sampleRateLookupKey = getSampleRateLookupKey(iH);
        this.channels = h0Var.h(3) + 1;
        int iH2 = h0Var.h(5) + 1;
        this.bitsPerSample = iH2;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(iH2);
        this.totalSamples = h0Var.j(36);
        this.seekTable = null;
        this.metadata = null;
    }

    private static c.f.a.b.b3.a buildMetadata(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            String[] strArrV0 = x0.V0(str, SEPARATOR);
            if (strArrV0.length != 2) {
                z.i(TAG, "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new c.f.a.b.b3.k.a(strArrV0[0], strArrV0[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c.f.a.b.b3.a(arrayList);
    }

    private static int getBitsPerSampleLookupKey(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int getSampleRateLookupKey(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public FlacStreamMetadata copyWithPictureFrames(List<PictureFrame> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(buildMetadata(Collections.emptyList(), list)));
    }

    public FlacStreamMetadata copyWithSeekTable(a aVar) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, aVar, this.metadata);
    }

    public FlacStreamMetadata copyWithVorbisComments(List<String> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(buildMetadata(list, Collections.emptyList())));
    }

    public long getApproxBytesPerFrame() {
        long j2;
        long j3;
        int i2 = this.maxFrameSize;
        if (i2 > 0) {
            j2 = (((long) i2) + ((long) this.minFrameSize)) / 2;
            j3 = 1;
        } else {
            int i3 = this.minBlockSizeSamples;
            j2 = ((((i3 != this.maxBlockSizeSamples || i3 <= 0) ? 4096L : i3) * ((long) this.channels)) * ((long) this.bitsPerSample)) / 8;
            j3 = 64;
        }
        return j2 + j3;
    }

    public int getDecodedBitrate() {
        return this.bitsPerSample * this.sampleRate * this.channels;
    }

    public long getDurationUs() {
        long j2 = this.totalSamples;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / ((long) this.sampleRate);
    }

    public k1 getFormat(byte[] bArr, c.f.a.b.b3.a aVar) {
        bArr[4] = -128;
        int i2 = this.maxFrameSize;
        if (i2 <= 0) {
            i2 = -1;
        }
        return new k1.b().e0("audio/flac").W(i2).H(this.channels).f0(this.sampleRate).T(Collections.singletonList(bArr)).X(getMetadataCopyWithAppendedEntriesFrom(aVar)).E();
    }

    public int getMaxDecodedFrameSize() {
        return this.maxBlockSizeSamples * this.channels * (this.bitsPerSample / 8);
    }

    public c.f.a.b.b3.a getMetadataCopyWithAppendedEntriesFrom(c.f.a.b.b3.a aVar) {
        c.f.a.b.b3.a aVar2 = this.metadata;
        return aVar2 == null ? aVar : aVar2.c(aVar);
    }

    public long getSampleNumber(long j2) {
        return x0.s((j2 * ((long) this.sampleRate)) / 1000000, 0L, this.totalSamples - 1);
    }
}
