package java9recipes.chapter6.AccessingClassVar;

public class Main {
 public static void main(String args[]){
  AccessingClassVariablesfromLambda var=new AccessingClassVariablesfromLambda();
  AccessingClassVariablesfromLambda.InnerClass inner=var.new InnerClass();
  inner.lambdaInMethod("hello");

}
}