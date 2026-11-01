package com.transsion.ugcvideodetail.activity;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.videofloat.manager.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/*  JADX ERROR: Class process error: OutOfMemoryError
    java.lang.OutOfMemoryError: Java heap space
    	at java.base/java.util.IdentityHashMap.init(IdentityHashMap.java:266)
    	at java.base/java.util.IdentityHashMap.<init>(IdentityHashMap.java:222)
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.<init>(TypeUpdateInfo.java:17)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:82)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:63)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:672)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:246)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor$$Lambda/0x000075cb9820a000.apply(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
    */
/* compiled from: source.java */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u001fJ\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010$J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010$J\u000f\u0010)\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010$J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010$J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u0010\u0005J\u000f\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u0010\u0005J\u000f\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u0010\u0005J\u000f\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010\u0005R\u0018\u00107\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b9\u00106R\u0018\u0010<\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b;\u00106R\u0018\u0010>\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u00106R\u0018\u0010@\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u00106R\u0018\u0010B\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u00106R\u0018\u0010D\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u00106R\u0018\u0010F\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bE\u00106R\u0016\u0010I\u001a\u00020+8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bM\u00106R\u0018\u0010Q\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010KR\u001b\u0010Y\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lcom/transsion/ugcvideodetail/activity/UGCVideoDetailActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Lfx/a;", "Lcom/transsion/videofloat/manager/c;", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "", "tag", "", "K0", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "O0", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "video", "", "Q0", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "category", "P0", "(Ljava/lang/String;)V", "N0", "()Lfx/a;", "u0", "retryLoadData", "getPageName", "()Ljava/lang/String;", "onPause", "onDestroy", "j", "isMusicFloatingAttach", "()Z", "isChangeStatusBar", "j0", "s0", "r0", "isTranslucent", "isStatusDark", "", "statusColor", "()I", "Landroid/view/View;", "k0", "()Landroid/view/View;", "p0", "q0", "o0", "t0", "i", "Ljava/lang/String;", "videoId", "collectionId", "k", "subjectId", "l", "type", "m", "ops", "n", "fromOptId", "o", "pageStyle", "p", "previousPageVideoId", "q", "previousPageTrackId", "r", "I", "bottomFragmentSelected", "s", "Z", "withoutHistory", "t", "homeTabId", "u", "Landroidx/fragment/app/Fragment;", "mFragment", "v", "hasHandledActivityLimit", "Lgx/a;", "w", "Lkotlin/Lazy;", "M0", "()Lgx/a;", "detailApi", "UGCVideoDetail_psRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class UGCVideoDetailActivity extends BaseNewActivity<fx.a> implements c {

    /* renamed from: i, reason: collision with root package name */
    public String f57283i;

    /* renamed from: j, reason: collision with root package name */
    public String f57284j;

    /* renamed from: k, reason: collision with root package name */
    public String f57285k;

    /* renamed from: l, reason: collision with root package name */
    public String f57286l;

    /* renamed from: m, reason: collision with root package name */
    public String f57287m;

    /* renamed from: n, reason: collision with root package name */
    public String f57288n;

    /* renamed from: o, reason: collision with root package name */
    public String f57289o;

    /* renamed from: p, reason: collision with root package name */
    public String f57290p;

    /* renamed from: q, reason: collision with root package name */
    public String f57291q;

    /* renamed from: r, reason: collision with root package name */
    public int f57292r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f57293s;

    /* renamed from: t, reason: collision with root package name */
    public String f57294t;

    /* renamed from: u, reason: collision with root package name */
    private Fragment f57295u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f57296v;

    /* renamed from: w, reason: collision with root package name */
    private final Lazy f57297w;

    public UGCVideoDetailActivity() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            r1.<init>()
            com.transsion.ugcvideodetail.activity.a r0 = new com.transsion.ugcvideodetail.activity.a
            r0.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt.b(r0)
            r1.f57297w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.<init>():void");
    }

    public static /* synthetic */ gx.a G0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            gx.a r0 = L0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.G0():gx.a");
    }

    public static final /* synthetic */ void H0(UGCVideoDetailActivity uGCVideoDetailActivity, Fragment fragment, String str) {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            r0.K0(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.H0(com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity, androidx.fragment.app.Fragment, java.lang.String):void");
    }

    public static final /* synthetic */ gx.a I0(UGCVideoDetailActivity uGCVideoDetailActivity) {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            gx.a r0 = r0.M0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.I0(com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity):gx.a");
    }

    public static final /* synthetic */ boolean J0(UGCVideoDetailActivity uGCVideoDetailActivity, UGCVideo uGCVideo) {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            boolean r0 = r0.Q0(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.J0(com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity, com.transsion.ugcvideodetail.api.bean.UGCVideo):boolean");
    }

    private final void K0(Fragment fragment, String str) {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            r0 = r16
            r1 = r17
            androidx.fragment.app.FragmentManager r2 = r16.getSupportFragmentManager()
            java.lang.String r3 = "getSupportFragmentManager(...)"
            kotlin.jvm.internal.Intrinsics.g(r2, r3)
            androidx.fragment.app.x r2 = r2.p()
            java.lang.String r3 = "beginTransaction()"
            kotlin.jvm.internal.Intrinsics.g(r2, r3)
            rg.a$a r4 = rg.a.f76847a
            java.lang.String r3 = r0.f57294t
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "createFragment: homeTabId:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = r5.toString()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "UGCVideoDetailActivity"
            r7 = 0
            rg.a.C0888a.l(r4, r5, r6, r7, r8, r9)
            java.lang.String r3 = "id"
            java.lang.String r4 = r0.f57283i
            kotlin.Pair r3 = kotlin.TuplesKt.a(r3, r4)
            java.lang.String r4 = "ugcCategory"
            java.lang.String r5 = r0.f57286l
            kotlin.Pair r4 = kotlin.TuplesKt.a(r4, r5)
            java.lang.String r5 = "subject_id"
            java.lang.String r6 = r0.f57285k
            kotlin.Pair r5 = kotlin.TuplesKt.a(r5, r6)
            java.lang.String r6 = "collection_id"
            java.lang.String r7 = r0.f57284j
            kotlin.Pair r6 = kotlin.TuplesKt.a(r6, r7)
            java.lang.String r7 = "ops"
            java.lang.String r8 = r0.f57287m
            kotlin.Pair r7 = kotlin.TuplesKt.a(r7, r8)
            java.lang.String r8 = "from_opt_id"
            java.lang.String r9 = r0.f57288n
            kotlin.Pair r8 = kotlin.TuplesKt.a(r8, r9)
            java.lang.String r9 = "parent_video_id"
            java.lang.String r10 = r0.f57290p
            kotlin.Pair r9 = kotlin.TuplesKt.a(r9, r10)
            java.lang.String r10 = "parent_track_id"
            java.lang.String r11 = r0.f57291q
            kotlin.Pair r10 = kotlin.TuplesKt.a(r10, r11)
            int r11 = r0.f57292r
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "ugc_bottom_fragment_selected"
            kotlin.Pair r11 = kotlin.TuplesKt.a(r12, r11)
            boolean r12 = r0.f57293s
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            java.lang.String r13 = "ugc_without_history"
            kotlin.Pair r12 = kotlin.TuplesKt.a(r13, r12)
            java.lang.String r13 = "tab_id"
            java.lang.String r14 = r0.f57294t
            kotlin.Pair r13 = kotlin.TuplesKt.a(r13, r14)
            r14 = 11
            kotlin.Pair[] r14 = new kotlin.Pair[r14]
            r15 = 0
            r14[r15] = r3
            r3 = 1
            r14[r3] = r4
            r3 = 2
            r14[r3] = r5
            r3 = 3
            r14[r3] = r6
            r3 = 4
            r14[r3] = r7
            r3 = 5
            r14[r3] = r8
            r3 = 6
            r14[r3] = r9
            r3 = 7
            r14[r3] = r10
            r3 = 8
            r14[r3] = r11
            r3 = 9
            r14[r3] = r12
            r3 = 10
            r14[r3] = r13
            android.os.Bundle r3 = androidx.core.os.d.b(r14)
            r1.setArguments(r3)
            int r3 = com.transsion.moviedetail.R$id.container
            r4 = r18
            r2.t(r3, r1, r4)
            r0.f57295u = r1
            r2.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.K0(androidx.fragment.app.Fragment, java.lang.String):void");
    }

    private static final gx.a L0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            fh.c$a r0 = fh.c.f64884e
            fh.c r0 = r0.a()
            java.lang.Class<gx.a> r1 = gx.a.class
            java.lang.Object r0 = r0.h(r1)
            gx.a r0 = (gx.a) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.L0():gx.a");
    }

    private final gx.a M0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            kotlin.Lazy r0 = r1.f57297w
            java.lang.Object r0 = r0.getValue()
            gx.a r0 = (gx.a) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.M0():gx.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void O0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            g4.a r0 = r8.getMViewBinding()
            fx.a r0 = (fx.a) r0
            android.widget.ProgressBar r0 = r0.f64938c
            java.lang.String r1 = "ugcPbLoading"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            pg.c.k(r0)
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.view.v.a(r8)
            com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity$requestVideoDetailAndCreateFragment$1 r5 = new com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity$requestVideoDetailAndCreateFragment$1
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.i.d(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.O0():void");
    }

    private final boolean Q0(UGCVideo uGCVideo) {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            boolean r1 = r1.isVerticalImmStyle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.Q0(com.transsion.ugcvideodetail.api.bean.UGCVideo):boolean");
    }

    public fx.a N0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            android.view.LayoutInflater r0 = r2.getLayoutInflater()
            fx.a r0 = fx.a.c(r0)
            java.lang.String r1 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.N0():fx.a");
    }

    public final void P0(String str) {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            boolean r0 = r2.f57296v
            if (r0 == 0) goto L5
            return
        L5:
            com.transsion.ugcvideodetail.api.UGCVideoType r0 = com.transsion.ugcvideodetail.api.UGCVideoType.MUSIC
            java.lang.String r0 = r0.getValue()
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r3, r0)
            r0 = 1
            if (r3 == 0) goto L14
            r3 = r0
            goto L15
        L14:
            r3 = 3
        L15:
            com.transsion.baselib.report.l r1 = com.transsion.baselib.report.l.f42928a
            r1.w(r3, r2)
            r2.f57296v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.P0(java.lang.String):void");
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            java.lang.String r0 = "/ugc_video/detail"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.getPageName():java.lang.String");
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public /* bridge */ /* synthetic */ g4.a getViewBinding() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            fx.a r0 = r1.N0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.getViewBinding():g4.a");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isChangeStatusBar() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.isChangeStatusBar():boolean");
    }

    @Override // com.transsion.baseui.activity.BaseMusicFloatActivity
    public boolean isMusicFloatingAttach() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.isMusicFloatingAttach():boolean");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isStatusDark() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.isStatusDark():boolean");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isTranslucent() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.isTranslucent():boolean");
    }

    @Override // com.transsion.videofloat.manager.c
    public void j() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            androidx.fragment.app.Fragment r0 = r3.f57295u
            boolean r1 = r0 instanceof com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment
            r2 = 0
            if (r1 == 0) goto L14
            boolean r1 = r0 instanceof com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment
            if (r1 == 0) goto Le
            r2 = r0
            com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment r2 = (com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment) r2
        Le:
            if (r2 == 0) goto L24
            r2.P0()
            goto L24
        L14:
            boolean r1 = r0 instanceof com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment
            if (r1 == 0) goto L24
            boolean r1 = r0 instanceof com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment
            if (r1 == 0) goto L1f
            r2 = r0
            com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment r2 = (com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment) r2
        L1f:
            if (r2 == 0) goto L24
            r2.c1()
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.j():void");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public String j0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.j0():java.lang.String");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public View k0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            android.view.View r0 = super.k0()
            pt.b.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.k0():android.view.View");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            com.therouter.TheRouter.l(r2)
            java.lang.String r0 = r2.f57286l
            com.transsion.ugcvideodetail.api.UGCVideoType r1 = com.transsion.ugcvideodetail.api.UGCVideoType.SHORT_TV
            java.lang.String r1 = r1.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r1)
            if (r0 == 0) goto L19
            com.transsion.ugcvideodetail.api.UGCPageStyle r0 = com.transsion.ugcvideodetail.api.UGCPageStyle.UGC_PAGE_STYLE_IMM_VERTICAL_VIDEO
            java.lang.String r0 = r0.getValue()
            r2.f57289o = r0
        L19:
            super.onCreate(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            super.onDestroy()
            r1.j()
            fz.e$a r0 = fz.e.f65120a
            fz.e r0 = r0.b()
            r0.m(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.onDestroy():void");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            super.onPause()
            boolean r0 = r1.isFinishing()
            if (r0 == 0) goto Lc
            r1.j()
        Lc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.onPause():void");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean r0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.r0():boolean");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean s0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.s0():boolean");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public int statusColor() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            int r0 = com.tn.lib.widget.R$color.black
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.statusColor():int");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void u0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            androidx.fragment.app.Fragment r0 = r2.f57295u
            if (r0 != 0) goto L4d
            androidx.fragment.app.FragmentManager r0 = r2.getSupportFragmentManager()
            java.lang.String r1 = "VideoDetailFragment"
            androidx.fragment.app.Fragment r0 = r0.k0(r1)
            r2.f57295u = r0
            if (r0 != 0) goto L4d
            java.lang.String r0 = r2.f57289o
            com.transsion.ugcvideodetail.api.UGCPageStyle r1 = com.transsion.ugcvideodetail.api.UGCPageStyle.UGC_PAGE_STYLE_HORIZONTAL_VIDEO
            java.lang.String r1 = r1.getValue()
            boolean r1 = kotlin.jvm.internal.Intrinsics.c(r0, r1)
            if (r1 == 0) goto L2c
            com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment$a r0 = com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment.INSTANCE
            com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment r0 = r0.a()
            java.lang.String r1 = "UGCVideoDetailFragment"
            r2.K0(r0, r1)
            goto L4d
        L2c:
            com.transsion.ugcvideodetail.api.UGCPageStyle r1 = com.transsion.ugcvideodetail.api.UGCPageStyle.UGC_PAGE_STYLE_IMM_VERTICAL_VIDEO
            java.lang.String r1 = r1.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r1)
            if (r0 == 0) goto L4a
            com.transsion.baselib.report.l r0 = com.transsion.baselib.report.l.f42928a
            r1 = 2
            r0.w(r1, r2)
            com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment$a r0 = com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment.INSTANCE
            com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment r0 = r0.a()
            java.lang.String r1 = "UGCImmVideoDetailFragment"
            r2.K0(r0, r1)
            goto L4d
        L4a:
            r2.O0()
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.u0():void");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void o0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.o0():void");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void p0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.p0():void");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void q0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.q0():void");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.retryLoadData():void");
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void t0() {
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            this = this;
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity.t0():void");
    }
}
