package com.facebook.ads.redexgen.X;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04243y {
    public static String[] A01;
    public final InterfaceC04233x A00;

    static {
        A01();
    }

    public static void A01() {
        A01 = new String[]{"1CU3iw4Trc3qggngkxP7P26jEGLrLZaR", "qcH7HKgKdAybLTWn0rmK7JyCE0S9C8rn", "oNJ0dA1Zpt4CixMfeWT18n5RxX88Y0E3", "FZ8N3xW3PfzdZjJWrErZ2QIuE13XuJtD", "DvPOKoiXqOiYMgjx6IqCziqOSBLzEcJY", "MpMZeZ7xc490HXAXJonG5r1KTyiIoUHH", "NGMd8PbmdSzgSLgNcWdVjgLa", "jY1Ixh6DMe9BpV8yAbg842YJP45AQ2Eb"};
    }

    public C04243y(InterfaceC04233x interfaceC04233x) {
        this.A00 = interfaceC04233x;
    }

    private int A00(List<C04013a> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).A00 == 8) {
                if (z) {
                    return size;
                }
            } else {
                z = true;
            }
        }
        return -1;
    }

    private void A02(List<C04013a> list, int i2, int i3) {
        C04013a c04013a = list.get(i2);
        C04013a nextOp = list.get(i3);
        int i4 = nextOp.A00;
        if (i4 != 1) {
            if (i4 == 2) {
                A04(list, i2, c04013a, i3, nextOp);
                return;
            } else {
                if (i4 == 4) {
                    A05(list, i2, c04013a, i3, nextOp);
                    return;
                }
                return;
            }
        }
        String[] strArr = A01;
        if (strArr[1].charAt(7) == strArr[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "aUQhN9RPINWHdtDS2haQB24BMlUHbr4B";
        strArr2[7] = "XOFwSchhjWWz78nEYYkf12AsjhBhdKRi";
        A03(list, i2, c04013a, i3, nextOp);
    }

    private void A03(List<C04013a> list, int i2, C04013a c04013a, int i3, C04013a c04013a2) {
        int i4 = 0;
        if (c04013a.A01 < c04013a2.A02) {
            i4 = 0 - 1;
        }
        if (c04013a.A02 < c04013a2.A02) {
            i4++;
        }
        if (c04013a2.A02 <= c04013a.A02) {
            c04013a.A02 += c04013a2.A01;
        }
        if (c04013a2.A02 <= c04013a.A01) {
            c04013a.A01 += c04013a2.A01;
        }
        c04013a2.A02 += i4;
        list.set(i2, c04013a2);
        list.set(i3, c04013a);
    }

    private final void A04(List<C04013a> list, int i2, C04013a c04013a, int i3, C04013a c04013a2) {
        boolean z;
        C04013a c04013aA8j = null;
        boolean z2 = false;
        if (c04013a.A02 < c04013a.A01) {
            z = false;
            if (c04013a2.A02 == c04013a.A02 && c04013a2.A01 == c04013a.A01 - c04013a.A02) {
                z2 = true;
            }
        } else {
            z = true;
            if (c04013a2.A02 == c04013a.A01 + 1 && c04013a2.A01 == c04013a.A02 - c04013a.A01) {
                z2 = true;
            }
        }
        if (c04013a.A01 < c04013a2.A02) {
            c04013a2.A02--;
        } else if (c04013a.A01 < c04013a2.A02 + c04013a2.A01) {
            c04013a2.A01--;
            c04013a.A00 = 2;
            c04013a.A01 = 1;
            int i4 = c04013a2.A01;
            if (A01[6].length() == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "8AUTweiK2qHuqKAjuAP9RAHRjtqC9cI5";
            strArr[3] = "fxjAamJyQJjVOLb9u9QxKoC9co41mLuZ";
            if (i4 == 0) {
                list.remove(i3);
                this.A00.ACB(c04013a2);
                return;
            }
            return;
        }
        if (c04013a.A02 <= c04013a2.A02) {
            c04013a2.A02++;
        } else if (c04013a.A02 < c04013a2.A02 + c04013a2.A01) {
            c04013aA8j = this.A00.A8j(2, c04013a.A02 + 1, (c04013a2.A02 + c04013a2.A01) - c04013a.A02, null);
            c04013a2.A01 = c04013a.A02 - c04013a2.A02;
        }
        if (z2) {
            list.set(i2, c04013a2);
            list.remove(i3);
            this.A00.ACB(c04013a);
            return;
        }
        if (z) {
            if (c04013aA8j != null) {
                if (c04013a.A02 > c04013aA8j.A02) {
                    c04013a.A02 -= c04013aA8j.A01;
                }
                if (c04013a.A01 > c04013aA8j.A02) {
                    c04013a.A01 -= c04013aA8j.A01;
                }
            }
            if (c04013a.A02 > c04013a2.A02) {
                c04013a.A02 -= c04013a2.A01;
            }
            if (c04013a.A01 > c04013a2.A02) {
                c04013a.A01 -= c04013a2.A01;
            }
        } else {
            if (c04013aA8j != null) {
                if (c04013a.A02 >= c04013aA8j.A02) {
                    c04013a.A02 -= c04013aA8j.A01;
                }
                if (c04013a.A01 >= c04013aA8j.A02) {
                    c04013a.A01 -= c04013aA8j.A01;
                }
            }
            if (c04013a.A02 >= c04013a2.A02) {
                c04013a.A02 -= c04013a2.A01;
            }
            if (c04013a.A01 >= c04013a2.A02) {
                c04013a.A01 -= c04013a2.A01;
            }
        }
        list.set(i2, c04013a2);
        String[] strArr2 = A01;
        if (strArr2[1].charAt(7) == strArr2[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A01;
        strArr3[1] = "R1vl9Esi4EQuoIO0IEs3BYKA9Bp2yfIo";
        strArr3[5] = "ll7MLLjNdpT1F8Cd0W3dCYnGe1w6KT9M";
        if (c04013a.A02 != c04013a.A01) {
            list.set(i3, c04013a);
        } else {
            list.remove(i3);
        }
        if (c04013aA8j != null) {
            list.add(i2, c04013aA8j);
        }
    }

    private final void A05(List<C04013a> list, int i2, C04013a c04013a, int i3, C04013a c04013a2) {
        C04013a c04013aA8j = null;
        C04013a c04013aA8j2 = null;
        if (c04013a.A01 < c04013a2.A02) {
            c04013a2.A02--;
        } else if (c04013a.A01 < c04013a2.A02 + c04013a2.A01) {
            c04013a2.A01--;
            c04013aA8j = this.A00.A8j(4, c04013a.A02, 1, c04013a2.A03);
        }
        if (c04013a.A02 <= c04013a2.A02) {
            c04013a2.A02++;
        } else if (c04013a.A02 < c04013a2.A02 + c04013a2.A01) {
            int i4 = (c04013a2.A02 + c04013a2.A01) - c04013a.A02;
            c04013aA8j2 = this.A00.A8j(4, c04013a.A02 + 1, i4, c04013a2.A03);
            c04013a2.A01 -= i4;
        }
        list.set(i3, c04013a);
        if (c04013a2.A01 > 0) {
            list.set(i2, c04013a2);
        } else {
            list.remove(i2);
            this.A00.ACB(c04013a2);
        }
        if (c04013aA8j != null) {
            list.add(i2, c04013aA8j);
        }
        if (c04013aA8j2 != null) {
            list.add(i2, c04013aA8j2);
        }
    }

    public final void A06(List<C04013a> list) {
        while (true) {
            int iA00 = A00(list);
            if (iA00 != -1) {
                A02(list, iA00, iA00 + 1);
            } else {
                return;
            }
        }
    }
}
