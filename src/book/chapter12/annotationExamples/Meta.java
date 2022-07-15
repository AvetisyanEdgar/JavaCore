package book.chapter12.annotationExamples;

import java.lang.reflect.Method;

class Meta {
    @MyAnno(str = "Two parameters", val = 19)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();
        try{
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("Test", 10);

    }
}