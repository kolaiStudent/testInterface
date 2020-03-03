public interface Action<P, R extends String, E extends Exception> {
    default R does (P p) throws E
    {
        R r = (R) "dunno";
        E e = (E) new Exception("exept");
        Integer o=0;
        for (int i = 0; i<5000; i++){
            double k = Math.random();
    }
        if (p.getClass().isInstance(o)) return r;
        else throw e;


    }
}
