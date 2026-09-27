public class __M$Effect_Console {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Effect.Console"); }
    };
    public static Object clear = FFI_STUB;
    public static Object clear(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Console.clear"); }
    public static Object debug = FFI_STUB;
    public static Object debug(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Console.debug"); }
    public static Object error = FFI_STUB;
    public static Object error(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Console.error"); }
    public static Object group = FFI_STUB;
    public static Object group(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Console.group"); }
    public static Object groupCollapsed = FFI_STUB;
    public static Object groupCollapsed(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Console.groupCollapsed"); }
    public static Object groupEnd = FFI_STUB;
    public static Object groupEnd(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Console.groupEnd"); }
    public static Object info = FFI_STUB;
    public static Object info(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Console.info"); }
    public static Object log = FFI_STUB;
    public static Object log(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Console.log"); }
    public static Object time = FFI_STUB;
    public static Object time(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Console.time"); }
    public static Object timeEnd = FFI_STUB;
    public static Object timeEnd(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Console.timeEnd"); }
    public static Object timeLog = FFI_STUB;
    public static Object timeLog(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Console.timeLog"); }
    public static Object warn = FFI_STUB;
    public static Object warn(Object... args) { throw new UnsupportedOperationException("Missing Java FFI: Effect.Console.warn"); }

public static final Object warnShow = (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> { return (java.util.function.Function<Object, Object>) (a_1_i1) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Console.warn)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0_i0).get("show"))).apply(a_1_i1)); }; };
public static final Object logShow = (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> { return (java.util.function.Function<Object, Object>) (a_1_i1) -> { return ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (arg) -> (java.util.function.Supplier<Object>) () -> { System.out.println(arg); return null; })).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0_i0).get("show"))).apply(a_1_i1)); }; };
public static final Object infoShow = (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> { return (java.util.function.Function<Object, Object>) (a_1_i1) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Console.info)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0_i0).get("show"))).apply(a_1_i1)); }; };
public static final Object grouped = (java.util.function.Function<Object, Object>) (name_0_i0) -> { return (java.util.function.Function<Object, Object>) (inner_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Bind.bind)).apply(__M$Effect.bindEffect))).apply(((java.util.function.Function<Object, Object>) (__M$Effect_Console.group)).apply(name_0_i0)))).apply((java.util.function.Function<Object, Object>) (_dollar___unused_2_i2) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object result_3_i3 = ((java.util.function.Supplier) (Object)(inner_1_i1)).get(); return ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Bind.bind)).apply(__M$Effect.bindEffect))).apply(__M$Effect_Console.groupEnd))).apply((java.util.function.Function<Object, Object>) (_dollar___unused_4_i4) -> { return (new java.util.function.Supplier<Object>() { public Object get() { return result_3_i3; } }); }))).get(); } }); }); }; };
public static final Object errorShow = (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> { return (java.util.function.Function<Object, Object>) (a_1_i1) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Console.error)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0_i0).get("show"))).apply(a_1_i1)); }; };
public static final Object debugShow = (java.util.function.Function<Object, Object>) (dictShow_0_i0) -> { return (java.util.function.Function<Object, Object>) (a_1_i1) -> { return ((java.util.function.Function<Object, Object>) (__M$Effect_Console.debug)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictShow_0_i0).get("show"))).apply(a_1_i1)); }; };
}
