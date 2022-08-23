package learnenums;

public enum MathOpEnums {
    PLUS,MINUS,MULTIPLICATION,DIVISION;
    //each constant is an obj of MathOpENums class
    //as if below code prior to ENUM class addition to JAVA
    //MathOpEnums plus = new MathOpEnums();

    //Constructor in an Enum class can't be a public.
    //Only private access modifier should be used
    private MathOpEnums() {
        System.out.println("");
    }
}
