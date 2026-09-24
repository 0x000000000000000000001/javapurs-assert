    public static Object assertImpl = (java.util.function.Function<Object, Object>) (message) ->
        (java.util.function.Function<Object, Object>) (success) ->
        (java.util.function.Supplier<Object>) () -> {
            if (!((Boolean) success)) throw new RuntimeException((String) message);
            return null;
        };

    public static Object checkThrows = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Supplier<Object>) () -> {
            try {
                ((java.util.function.Supplier<Object>) fn).get();
                return false;
            } catch (Throwable thrown) {
                if (thrown instanceof RuntimeException) return true;
                RuntimeException error = new RuntimeException("Threw something other than an Error");
                error.initCause(thrown);
                throw error;
            }
        };
