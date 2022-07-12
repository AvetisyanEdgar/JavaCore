package classwork.lesson21;

@MyAnno(str = "fast", val = 3)
public class SomeClass {
    @MyAnno(str = "wall", val = 5)
    private String name;
    @CustomAnnotation
    void meth(){

    }
}
