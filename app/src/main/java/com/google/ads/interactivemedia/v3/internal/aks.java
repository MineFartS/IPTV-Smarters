package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes.dex */
public final class aks extends ajb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f20004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DatagramPacket f20005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f20006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DatagramSocket f20007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MulticastSocket f20008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InetAddress f20009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InetSocketAddress f20010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20012i;

    public aks() {
        super(true);
        byte[] bArr = new byte[AdError.SERVER_ERROR_CODE];
        this.f20004a = bArr;
        this.f20005b = new DatagramPacket(bArr, 0, AdError.SERVER_ERROR_CODE);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final long a(ajl ajlVar) throws akr {
        DatagramSocket datagramSocket;
        Uri uri = ajlVar.f19897a;
        this.f20006c = uri;
        String host = uri.getHost();
        int port = this.f20006c.getPort();
        i(ajlVar);
        try {
            this.f20009f = InetAddress.getByName(host);
            this.f20010g = new InetSocketAddress(this.f20009f, port);
            if (this.f20009f.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f20010g);
                this.f20008e = multicastSocket;
                multicastSocket.joinGroup(this.f20009f);
                datagramSocket = this.f20008e;
            } else {
                datagramSocket = new DatagramSocket(this.f20010g);
            }
            this.f20007d = datagramSocket;
            try {
                this.f20007d.setSoTimeout(8000);
                this.f20011h = true;
                j(ajlVar);
                return -1L;
            } catch (SocketException e2) {
                throw new akr(e2);
            }
        } catch (IOException e3) {
            throw new akr(e3);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aje
    public final int b(byte[] bArr, int i2, int i3) throws akr {
        if (i3 == 0) {
            return 0;
        }
        if (this.f20012i == 0) {
            try {
                this.f20007d.receive(this.f20005b);
                int length = this.f20005b.getLength();
                this.f20012i = length;
                g(length);
            } catch (IOException e2) {
                throw new akr(e2);
            }
        }
        int length2 = this.f20005b.getLength();
        int i4 = this.f20012i;
        int iMin = Math.min(i4, i3);
        System.arraycopy(this.f20004a, length2 - i4, bArr, i2, iMin);
        this.f20012i -= iMin;
        return iMin;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Uri c() {
        return this.f20006c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void f() {
        this.f20006c = null;
        MulticastSocket multicastSocket = this.f20008e;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f20009f);
            } catch (IOException unused) {
            }
            this.f20008e = null;
        }
        DatagramSocket datagramSocket = this.f20007d;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f20007d = null;
        }
        this.f20009f = null;
        this.f20010g = null;
        this.f20012i = 0;
        if (this.f20011h) {
            this.f20011h = false;
            h();
        }
    }
}
